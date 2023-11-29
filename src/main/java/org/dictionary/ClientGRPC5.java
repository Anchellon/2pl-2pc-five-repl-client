package org.dictionary;

import io.grpc.EquivalentAddressGroup;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.NameResolver;
import io.grpc.Attributes;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ClientGRPC5 {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }

// Creating the load balancer

        NameResolver.Factory nameResolverFactory = new MultiAddressNameResolverFactory(
                new InetSocketAddress("localhost", 5001),
                new InetSocketAddress("localhost", 5002),
                new InetSocketAddress("localhost", 5003),
                new InetSocketAddress("localhost", 5004),
                new InetSocketAddress("localhost", 5005)
        );

        ManagedChannel channel = ManagedChannelBuilder
                .forTarget("service") // WE ARE USING AN OLDER VERSION SO THIS WILL BE IGNORED IF WE USE THE FOLLOWING CHAINED METHOD
                // IN REALITY THIS WOULD BE THE DOMAIN NAME FROM WHERE WE ARE GETTING THE A RECORDS OF IPS FROM THE NAME RESOLVER IN FURTURE VERSIONS
                .nameResolverFactory(nameResolverFactory)
                .defaultLoadBalancingPolicy("round_robin")
                .usePlaintext()
                .build();

//  Creating the file handler for Terminal Logging

        Logger logger;
        FileHandler fh = null;
        logger = Logger.getLogger("Client_gRPCLog");
        try {
            fh = new FileHandler("Client_gRPClog", true);
        } catch (IOException e) {
            logger.info("File I/O failed");
            e.printStackTrace();
        }


        try {
            logger.addHandler(fh);
        } catch (SecurityException e) {
            logger.info("Security Privileges Not Valid");
            e.printStackTrace();
        }
        SimpleFormatter formatter = new SimpleFormatter();
        try {
            fh.setFormatter(formatter);
        } catch (SecurityException e) {
            logger.info("Security Privileges Not Valid");
            e.printStackTrace();
        } catch (NullPointerException e) {
            logger.info("File Handler Not set Not Valid");
            e.printStackTrace();
        }

        dictionaryServiceGrpc.dictionaryServiceBlockingStub dictionaryStub = dictionaryServiceGrpc.newBlockingStub(channel);

// Pre-populating with data
        logger.info("Pre-populating the db store");
        String key = "";
        String value = "";
        KeyValue kv;
        Status status = null;
        String[] keysArray = new String[]{"anshul", "tushar", "meena", "sunil", "pranoy", "jamie"};
        List<String> keys = Arrays.asList(keysArray);
        String[] valsArray = new String[]{"1", "2", "3", "4", "5", "6"};
        List<String> values = Arrays.asList(valsArray);
        for (int i = 0; i < 6; i++) {
            kv = KeyValue.newBuilder().setKey(keys.get(i)).setValue(values.get(i)).build();
            status = dictionaryStub.put(kv);
            System.out.println((status));
        }
// Interactive User Exp

        boolean shouldContinue = false;
        String answer = "";

        do {

            Scanner scanObj = new Scanner(System.in);
            System.out.println("Enter Operation : PUT / GET / DEL");
            String operation = scanObj.nextLine();  // Read user input
            System.out.println("Operation is: " + operation);// Output user input

            switch (operation.toLowerCase()) {
                case "put" -> {
                    logger.info("PUT option Has been selected");
                    System.out.println("Prepare to enter Key/Value Pair to PUT");
                    System.out.println("Enter KEY:");
                    key = scanObj.nextLine();
                    System.out.println("Enter VALUE:");
                    value = scanObj.nextLine();
                    kv = KeyValue.newBuilder().setKey(key).setValue(value).build();
                    status = dictionaryStub.put(kv);

                }
                case "get" -> {
                    logger.info("GET option Has been selected");
                    System.out.println("Prepare to enter KEY to GET");
                    System.out.println("Enter KEY:");
                    key = scanObj.nextLine();
                    kv = KeyValue.newBuilder().setKey(key).build();
                    status = dictionaryStub.get(kv);
                }
                case "del" -> {
                    logger.info("DEL option Has been selected");
                    System.out.println("Prepare to enter KEY to DELETE");
                    System.out.println("Enter KEY:");
                    key = scanObj.nextLine();
                    kv = KeyValue.newBuilder().setKey(key).build();
                    status = dictionaryStub.delete(kv);

                }
                default -> {
                    logger.info("Invalid Operation Entered");
                    System.out.println("Invalid Operation Entered");
                }
            }
            if (status != null) {
                switch (status.getStatus().toLowerCase()) {
                    case "added" -> {
                        logger.info("Successfully Added the Key-value Pair");
                    }
                    case "updated" -> {
                        logger.info("Successfully Updated the Key:" + key + " with value " + value);
                    }
                    case "deleted" -> {
                        logger.info("Successfully Deleted the Key:" + key + " with value " + value);
                    }
                    case "key-absent" -> {
                        logger.info("Queried Key:" + key + " not present");
                    }
                }

            }
            logger.info("User requested to continue or not.");
            System.out.println("Do you want to continue?");
            System.out.println("Type yes or Press y to continue followed by enter:");
            System.out.println("Press any other key followed by enter to exit:");
            System.out.println("Enter your answer:");
            answer = scanObj.nextLine();
            if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
                logger.info("User chooses");
                shouldContinue = true;
            } else {
                logger.info("User Exits");
                shouldContinue = false;
            }

        } while (shouldContinue);
    }

    private static class MultiAddressNameResolverFactory extends NameResolver.Factory {

        final List<EquivalentAddressGroup> addresses;

        MultiAddressNameResolverFactory(SocketAddress... addresses) {
            this.addresses = Arrays.stream(addresses)
                    .map(EquivalentAddressGroup::new)
                    .collect(Collectors.toList());
        }

        public NameResolver newNameResolver(URI notUsedUri, NameResolver.Args args) {
            return new NameResolver() {

                @Override
                public String getServiceAuthority() {
                    return "fakeAuthority";
                }

                public void start(Listener2 listener) {
                    listener.onResult(ResolutionResult.newBuilder().setAddresses(addresses).setAttributes(Attributes.EMPTY).build());
                }

                public void shutdown() {
                }
            };
        }

        @Override
        public String getDefaultScheme() {
            return "multiaddress";
        }
    }


}





