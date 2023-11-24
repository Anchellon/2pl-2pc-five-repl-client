package org.dictionary;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: dictionary.proto")
public final class dictionaryServiceGrpc {

  private dictionaryServiceGrpc() {}

  public static final String SERVICE_NAME = "dictionaryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.dictionary.KeyValue,
      org.dictionary.Status> getPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "put",
      requestType = org.dictionary.KeyValue.class,
      responseType = org.dictionary.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.dictionary.KeyValue,
      org.dictionary.Status> getPutMethod() {
    io.grpc.MethodDescriptor<org.dictionary.KeyValue, org.dictionary.Status> getPutMethod;
    if ((getPutMethod = dictionaryServiceGrpc.getPutMethod) == null) {
      synchronized (dictionaryServiceGrpc.class) {
        if ((getPutMethod = dictionaryServiceGrpc.getPutMethod) == null) {
          dictionaryServiceGrpc.getPutMethod = getPutMethod = 
              io.grpc.MethodDescriptor.<org.dictionary.KeyValue, org.dictionary.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dictionaryService", "put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dictionary.KeyValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dictionary.Status.getDefaultInstance()))
                  .setSchemaDescriptor(new dictionaryServiceMethodDescriptorSupplier("put"))
                  .build();
          }
        }
     }
     return getPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.dictionary.KeyValue,
      org.dictionary.Status> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = org.dictionary.KeyValue.class,
      responseType = org.dictionary.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.dictionary.KeyValue,
      org.dictionary.Status> getGetMethod() {
    io.grpc.MethodDescriptor<org.dictionary.KeyValue, org.dictionary.Status> getGetMethod;
    if ((getGetMethod = dictionaryServiceGrpc.getGetMethod) == null) {
      synchronized (dictionaryServiceGrpc.class) {
        if ((getGetMethod = dictionaryServiceGrpc.getGetMethod) == null) {
          dictionaryServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<org.dictionary.KeyValue, org.dictionary.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dictionaryService", "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dictionary.KeyValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dictionary.Status.getDefaultInstance()))
                  .setSchemaDescriptor(new dictionaryServiceMethodDescriptorSupplier("get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.dictionary.KeyValue,
      org.dictionary.Status> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = org.dictionary.KeyValue.class,
      responseType = org.dictionary.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.dictionary.KeyValue,
      org.dictionary.Status> getDeleteMethod() {
    io.grpc.MethodDescriptor<org.dictionary.KeyValue, org.dictionary.Status> getDeleteMethod;
    if ((getDeleteMethod = dictionaryServiceGrpc.getDeleteMethod) == null) {
      synchronized (dictionaryServiceGrpc.class) {
        if ((getDeleteMethod = dictionaryServiceGrpc.getDeleteMethod) == null) {
          dictionaryServiceGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<org.dictionary.KeyValue, org.dictionary.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dictionaryService", "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dictionary.KeyValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.dictionary.Status.getDefaultInstance()))
                  .setSchemaDescriptor(new dictionaryServiceMethodDescriptorSupplier("delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static dictionaryServiceStub newStub(io.grpc.Channel channel) {
    return new dictionaryServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static dictionaryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new dictionaryServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static dictionaryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new dictionaryServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class dictionaryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void put(org.dictionary.KeyValue request,
        io.grpc.stub.StreamObserver<org.dictionary.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     */
    public void get(org.dictionary.KeyValue request,
        io.grpc.stub.StreamObserver<org.dictionary.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void delete(org.dictionary.KeyValue request,
        io.grpc.stub.StreamObserver<org.dictionary.Status> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.dictionary.KeyValue,
                org.dictionary.Status>(
                  this, METHODID_PUT)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.dictionary.KeyValue,
                org.dictionary.Status>(
                  this, METHODID_GET)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.dictionary.KeyValue,
                org.dictionary.Status>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class dictionaryServiceStub extends io.grpc.stub.AbstractStub<dictionaryServiceStub> {
    private dictionaryServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private dictionaryServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected dictionaryServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new dictionaryServiceStub(channel, callOptions);
    }

    /**
     */
    public void put(org.dictionary.KeyValue request,
        io.grpc.stub.StreamObserver<org.dictionary.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(org.dictionary.KeyValue request,
        io.grpc.stub.StreamObserver<org.dictionary.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(org.dictionary.KeyValue request,
        io.grpc.stub.StreamObserver<org.dictionary.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class dictionaryServiceBlockingStub extends io.grpc.stub.AbstractStub<dictionaryServiceBlockingStub> {
    private dictionaryServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private dictionaryServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected dictionaryServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new dictionaryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.dictionary.Status put(org.dictionary.KeyValue request) {
      return blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.dictionary.Status get(org.dictionary.KeyValue request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.dictionary.Status delete(org.dictionary.KeyValue request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class dictionaryServiceFutureStub extends io.grpc.stub.AbstractStub<dictionaryServiceFutureStub> {
    private dictionaryServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private dictionaryServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected dictionaryServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new dictionaryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dictionary.Status> put(
        org.dictionary.KeyValue request) {
      return futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dictionary.Status> get(
        org.dictionary.KeyValue request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.dictionary.Status> delete(
        org.dictionary.KeyValue request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUT = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_DELETE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final dictionaryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(dictionaryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUT:
          serviceImpl.put((org.dictionary.KeyValue) request,
              (io.grpc.stub.StreamObserver<org.dictionary.Status>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((org.dictionary.KeyValue) request,
              (io.grpc.stub.StreamObserver<org.dictionary.Status>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((org.dictionary.KeyValue) request,
              (io.grpc.stub.StreamObserver<org.dictionary.Status>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class dictionaryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    dictionaryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.dictionary.DictionaryProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("dictionaryService");
    }
  }

  private static final class dictionaryServiceFileDescriptorSupplier
      extends dictionaryServiceBaseDescriptorSupplier {
    dictionaryServiceFileDescriptorSupplier() {}
  }

  private static final class dictionaryServiceMethodDescriptorSupplier
      extends dictionaryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    dictionaryServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (dictionaryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new dictionaryServiceFileDescriptorSupplier())
              .addMethod(getPutMethod())
              .addMethod(getGetMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
