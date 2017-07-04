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
 * The Broker service provides pure network functionality
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.14.0)",
    comments = "Source: ttn/api/broker/broker.proto")
public class BrokerGrpc {

  private BrokerGrpc() {}

  public static final String SERVICE_NAME = "broker.Broker";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.BrokerOuterClass.UplinkMessage,
      org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage> METHOD_ASSOCIATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING,
          generateFullMethodName(
              "broker.Broker", "Associate"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.BrokerOuterClass.UplinkMessage.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.BrokerOuterClass.SubscribeRequest,
      org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage> METHOD_SUBSCRIBE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "broker.Broker", "Subscribe"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.BrokerOuterClass.SubscribeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage,
      com.google.protobuf.Empty> METHOD_PUBLISH =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING,
          generateFullMethodName(
              "broker.Broker", "Publish"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.BrokerOuterClass.DeviceActivationRequest,
      org.thethingsnetwork.management.proto.BrokerOuterClass.DeviceActivationResponse> METHOD_ACTIVATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "broker.Broker", "Activate"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.BrokerOuterClass.DeviceActivationRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.BrokerOuterClass.DeviceActivationResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BrokerStub newStub(io.grpc.Channel channel) {
    return new BrokerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BrokerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BrokerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static BrokerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BrokerFutureStub(channel);
  }

  /**
   * <pre>
   * The Broker service provides pure network functionality
   * </pre>
   */
  public static interface Broker {

    /**
     * <pre>
     * Router initiates an Association with the Broker.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.UplinkMessage> associate(
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage> responseObserver);

    /**
     * <pre>
     * Handler subscribes to uplink stream.
     * </pre>
     */
    public void subscribe(org.thethingsnetwork.management.proto.BrokerOuterClass.SubscribeRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage> responseObserver);

    /**
     * <pre>
     * Handler initiates downlink stream.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage> publish(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver);

    /**
     * <pre>
     * Router requests device activation
     * </pre>
     */
    public void activate(org.thethingsnetwork.management.proto.BrokerOuterClass.DeviceActivationRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DeviceActivationResponse> responseObserver);
  }

  @io.grpc.ExperimentalApi
  public static abstract class AbstractBroker implements Broker, io.grpc.BindableService {

    @java.lang.Override
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.UplinkMessage> associate(
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_ASSOCIATE, responseObserver);
    }

    @java.lang.Override
    public void subscribe(org.thethingsnetwork.management.proto.BrokerOuterClass.SubscribeRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SUBSCRIBE, responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage> publish(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_PUBLISH, responseObserver);
    }

    @java.lang.Override
    public void activate(org.thethingsnetwork.management.proto.BrokerOuterClass.DeviceActivationRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DeviceActivationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ACTIVATE, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return BrokerGrpc.bindService(this);
    }
  }

  /**
   * <pre>
   * The Broker service provides pure network functionality
   * </pre>
   */
  public static interface BrokerBlockingClient {

    /**
     * <pre>
     * Handler subscribes to uplink stream.
     * </pre>
     */
    public java.util.Iterator<org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage> subscribe(
        org.thethingsnetwork.management.proto.BrokerOuterClass.SubscribeRequest request);

    /**
     * <pre>
     * Router requests device activation
     * </pre>
     */
    public org.thethingsnetwork.management.proto.BrokerOuterClass.DeviceActivationResponse activate(org.thethingsnetwork.management.proto.BrokerOuterClass.DeviceActivationRequest request);
  }

  /**
   * <pre>
   * The Broker service provides pure network functionality
   * </pre>
   */
  public static interface BrokerFutureClient {

    /**
     * <pre>
     * Router requests device activation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.BrokerOuterClass.DeviceActivationResponse> activate(
        org.thethingsnetwork.management.proto.BrokerOuterClass.DeviceActivationRequest request);
  }

  public static class BrokerStub extends io.grpc.stub.AbstractStub<BrokerStub>
      implements Broker {
    private BrokerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BrokerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrokerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BrokerStub(channel, callOptions);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.UplinkMessage> associate(
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_ASSOCIATE, getCallOptions()), responseObserver);
    }

    @java.lang.Override
    public void subscribe(org.thethingsnetwork.management.proto.BrokerOuterClass.SubscribeRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_SUBSCRIBE, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage> publish(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_PUBLISH, getCallOptions()), responseObserver);
    }

    @java.lang.Override
    public void activate(org.thethingsnetwork.management.proto.BrokerOuterClass.DeviceActivationRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DeviceActivationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ACTIVATE, getCallOptions()), request, responseObserver);
    }
  }

  public static class BrokerBlockingStub extends io.grpc.stub.AbstractStub<BrokerBlockingStub>
      implements BrokerBlockingClient {
    private BrokerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BrokerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrokerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BrokerBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public java.util.Iterator<org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage> subscribe(
        org.thethingsnetwork.management.proto.BrokerOuterClass.SubscribeRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_SUBSCRIBE, getCallOptions(), request);
    }

    @java.lang.Override
    public org.thethingsnetwork.management.proto.BrokerOuterClass.DeviceActivationResponse activate(org.thethingsnetwork.management.proto.BrokerOuterClass.DeviceActivationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ACTIVATE, getCallOptions(), request);
    }
  }

  public static class BrokerFutureStub extends io.grpc.stub.AbstractStub<BrokerFutureStub>
      implements BrokerFutureClient {
    private BrokerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BrokerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BrokerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BrokerFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.BrokerOuterClass.DeviceActivationResponse> activate(
        org.thethingsnetwork.management.proto.BrokerOuterClass.DeviceActivationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ACTIVATE, getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBSCRIBE = 0;
  private static final int METHODID_ACTIVATE = 1;
  private static final int METHODID_ASSOCIATE = 2;
  private static final int METHODID_PUBLISH = 3;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Broker serviceImpl;
    private final int methodId;

    public MethodHandlers(Broker serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBSCRIBE:
          serviceImpl.subscribe((org.thethingsnetwork.management.proto.BrokerOuterClass.SubscribeRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage>) responseObserver);
          break;
        case METHODID_ACTIVATE:
          serviceImpl.activate((org.thethingsnetwork.management.proto.BrokerOuterClass.DeviceActivationRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DeviceActivationResponse>) responseObserver);
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
        case METHODID_ASSOCIATE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.associate(
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage>) responseObserver);
        case METHODID_PUBLISH:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.publish(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final Broker serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_ASSOCIATE,
          asyncBidiStreamingCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.BrokerOuterClass.UplinkMessage,
              org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage>(
                serviceImpl, METHODID_ASSOCIATE)))
        .addMethod(
          METHOD_SUBSCRIBE,
          asyncServerStreamingCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.BrokerOuterClass.SubscribeRequest,
              org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage>(
                serviceImpl, METHODID_SUBSCRIBE)))
        .addMethod(
          METHOD_PUBLISH,
          asyncClientStreamingCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage,
              com.google.protobuf.Empty>(
                serviceImpl, METHODID_PUBLISH)))
        .addMethod(
          METHOD_ACTIVATE,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.BrokerOuterClass.DeviceActivationRequest,
              org.thethingsnetwork.management.proto.BrokerOuterClass.DeviceActivationResponse>(
                serviceImpl, METHODID_ACTIVATE)))
        .build();
  }
}
