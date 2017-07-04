package org.thethingsnetwork.management.proto;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * The BrokerManager service provides configuration and monitoring functionality
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.14.0)",
    comments = "Source: ttn/api/broker/broker.proto")
public class BrokerManagerGrpc {

  private BrokerManagerGrpc() {}

  public static final String SERVICE_NAME = "broker.BrokerManager";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.BrokerOuterClass.ApplicationHandlerRegistration,
      com.google.protobuf.Empty> METHOD_REGISTER_APPLICATION_HANDLER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "broker.BrokerManager", "RegisterApplicationHandler"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.BrokerOuterClass.ApplicationHandlerRegistration.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.BrokerOuterClass.StatusRequest,
      org.thethingsnetwork.management.proto.BrokerOuterClass.Status> METHOD_GET_STATUS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "broker.BrokerManager", "GetStatus"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.BrokerOuterClass.StatusRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.BrokerOuterClass.Status.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BrokerManagerStub newStub(io.grpc.Channel channel) {
    return new BrokerManagerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BrokerManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BrokerManagerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static BrokerManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BrokerManagerFutureStub(channel);
  }

  /**
   * <pre>
   * The BrokerManager service provides configuration and monitoring functionality
   * </pre>
   */
  public static interface BrokerManager {

    /**
     * <pre>
     * Handler announces a new application to Broker. This is a temporary method that will be removed
     * when we can push updates from the Discovery service to the routing services.
     * </pre>
     */
    public void registerApplicationHandler(org.thethingsnetwork.management.proto.BrokerOuterClass.ApplicationHandlerRegistration request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver);

    /**
     * <pre>
     * Network operator requests Broker status
     * </pre>
     */
    public void getStatus(org.thethingsnetwork.management.proto.BrokerOuterClass.StatusRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.Status> responseObserver);
  }

  @io.grpc.ExperimentalApi
  public static abstract class AbstractBrokerManager implements BrokerManager, io.grpc.BindableService {

    @java.lang.Override
    public void registerApplicationHandler(org.thethingsnetwork.management.proto.BrokerOuterClass.ApplicationHandlerRegistration request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REGISTER_APPLICATION_HANDLER, responseObserver);
    }

    @java.lang.Override
    public void getStatus(org.thethingsnetwork.management.proto.BrokerOuterClass.StatusRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.Status> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_STATUS, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return BrokerManagerGrpc.bindService(this);
    }
  }

  /**
   * <pre>
   * The BrokerManager service provides configuration and monitoring functionality
   * </pre>
   */
  public static interface BrokerManagerBlockingClient {

    /**
     * <pre>
     * Handler announces a new application to Broker. This is a temporary method that will be removed
     * when we can push updates from the Discovery service to the routing services.
     * </pre>
     */
    public com.google.protobuf.Empty registerApplicationHandler(org.thethingsnetwork.management.proto.BrokerOuterClass.ApplicationHandlerRegistration request);

    /**
     * <pre>
     * Network operator requests Broker status
     * </pre>
     */
    public org.thethingsnetwork.management.proto.BrokerOuterClass.Status getStatus(org.thethingsnetwork.management.proto.BrokerOuterClass.StatusRequest request);
  }

  /**
   * <pre>
   * The BrokerManager service provides configuration and monitoring functionality
   * </pre>
   */
  public static interface BrokerManagerFutureClient {

    /**
     * <pre>
     * Handler announces a new application to Broker. This is a temporary method that will be removed
     * when we can push updates from the Discovery service to the routing services.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> registerApplicationHandler(
        org.thethingsnetwork.management.proto.BrokerOuterClass.ApplicationHandlerRegistration request);

    /**
     * <pre>
     * Network operator requests Broker status
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.BrokerOuterClass.Status> getStatus(
        org.thethingsnetwork.management.proto.BrokerOuterClass.StatusRequest request);
  }

  public static class BrokerManagerStub extends io.grpc.stub.AbstractStub<BrokerManagerStub>
      implements BrokerManager {
    private BrokerManagerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BrokerManagerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrokerManagerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BrokerManagerStub(channel, callOptions);
    }

    @java.lang.Override
    public void registerApplicationHandler(org.thethingsnetwork.management.proto.BrokerOuterClass.ApplicationHandlerRegistration request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REGISTER_APPLICATION_HANDLER, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getStatus(org.thethingsnetwork.management.proto.BrokerOuterClass.StatusRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_STATUS, getCallOptions()), request, responseObserver);
    }
  }

  public static class BrokerManagerBlockingStub extends io.grpc.stub.AbstractStub<BrokerManagerBlockingStub>
      implements BrokerManagerBlockingClient {
    private BrokerManagerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BrokerManagerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrokerManagerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BrokerManagerBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.protobuf.Empty registerApplicationHandler(org.thethingsnetwork.management.proto.BrokerOuterClass.ApplicationHandlerRegistration request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REGISTER_APPLICATION_HANDLER, getCallOptions(), request);
    }

    @java.lang.Override
    public org.thethingsnetwork.management.proto.BrokerOuterClass.Status getStatus(org.thethingsnetwork.management.proto.BrokerOuterClass.StatusRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_STATUS, getCallOptions(), request);
    }
  }

  public static class BrokerManagerFutureStub extends io.grpc.stub.AbstractStub<BrokerManagerFutureStub>
      implements BrokerManagerFutureClient {
    private BrokerManagerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BrokerManagerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrokerManagerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BrokerManagerFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> registerApplicationHandler(
        org.thethingsnetwork.management.proto.BrokerOuterClass.ApplicationHandlerRegistration request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REGISTER_APPLICATION_HANDLER, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.BrokerOuterClass.Status> getStatus(
        org.thethingsnetwork.management.proto.BrokerOuterClass.StatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_STATUS, getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_APPLICATION_HANDLER = 0;
  private static final int METHODID_GET_STATUS = 1;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BrokerManager serviceImpl;
    private final int methodId;

    public MethodHandlers(BrokerManager serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_APPLICATION_HANDLER:
          serviceImpl.registerApplicationHandler((org.thethingsnetwork.management.proto.BrokerOuterClass.ApplicationHandlerRegistration) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_STATUS:
          serviceImpl.getStatus((org.thethingsnetwork.management.proto.BrokerOuterClass.StatusRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.Status>) responseObserver);
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

  public static io.grpc.ServerServiceDefinition bindService(
      final BrokerManager serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_REGISTER_APPLICATION_HANDLER,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.BrokerOuterClass.ApplicationHandlerRegistration,
              com.google.protobuf.Empty>(
                serviceImpl, METHODID_REGISTER_APPLICATION_HANDLER)))
        .addMethod(
          METHOD_GET_STATUS,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.BrokerOuterClass.StatusRequest,
              org.thethingsnetwork.management.proto.BrokerOuterClass.Status>(
                serviceImpl, METHODID_GET_STATUS)))
        .build();
  }
}
