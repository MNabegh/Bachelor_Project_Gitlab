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
 * The Router service provides pure network functionality
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.14.0)",
    comments = "Source: ttn/api/router/router.proto")
public class RouterGrpc {

  private RouterGrpc() {}

  public static final String SERVICE_NAME = "router.Router";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.Gateway.Status,
      com.google.protobuf.Empty> METHOD_GATEWAY_STATUS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING,
          generateFullMethodName(
              "router.Router", "GatewayStatus"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.Gateway.Status.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.RouterOuterClass.UplinkMessage,
      com.google.protobuf.Empty> METHOD_UPLINK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING,
          generateFullMethodName(
              "router.Router", "Uplink"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.RouterOuterClass.UplinkMessage.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.RouterOuterClass.SubscribeRequest,
      org.thethingsnetwork.management.proto.RouterOuterClass.DownlinkMessage> METHOD_SUBSCRIBE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "router.Router", "Subscribe"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.RouterOuterClass.SubscribeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.RouterOuterClass.DownlinkMessage.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.RouterOuterClass.DeviceActivationRequest,
      org.thethingsnetwork.management.proto.RouterOuterClass.DeviceActivationResponse> METHOD_ACTIVATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "router.Router", "Activate"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.RouterOuterClass.DeviceActivationRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.RouterOuterClass.DeviceActivationResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RouterStub newStub(io.grpc.Channel channel) {
    return new RouterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RouterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RouterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static RouterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RouterFutureStub(channel);
  }

  /**
   * <pre>
   * The Router service provides pure network functionality
   * </pre>
   */
  public static interface Router {

    /**
     * <pre>
     * Gateway streams status messages to Router
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.Gateway.Status> gatewayStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver);

    /**
     * <pre>
     * Gateway streams uplink messages to Router
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.RouterOuterClass.UplinkMessage> uplink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver);

    /**
     * <pre>
     * Gateway subscribes to downlink messages from Router
     * It is possible to open multiple subscriptions (but not recommended).
     * If you do this, you are responsible for de-duplication of downlink messages.
     * </pre>
     */
    public void subscribe(org.thethingsnetwork.management.proto.RouterOuterClass.SubscribeRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.RouterOuterClass.DownlinkMessage> responseObserver);

    /**
     * <pre>
     * Gateway requests device activation
     * </pre>
     */
    public void activate(org.thethingsnetwork.management.proto.RouterOuterClass.DeviceActivationRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.RouterOuterClass.DeviceActivationResponse> responseObserver);
  }

  @io.grpc.ExperimentalApi
  public static abstract class AbstractRouter implements Router, io.grpc.BindableService {

    @java.lang.Override
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.Gateway.Status> gatewayStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_GATEWAY_STATUS, responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.RouterOuterClass.UplinkMessage> uplink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_UPLINK, responseObserver);
    }

    @java.lang.Override
    public void subscribe(org.thethingsnetwork.management.proto.RouterOuterClass.SubscribeRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.RouterOuterClass.DownlinkMessage> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SUBSCRIBE, responseObserver);
    }

    @java.lang.Override
    public void activate(org.thethingsnetwork.management.proto.RouterOuterClass.DeviceActivationRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.RouterOuterClass.DeviceActivationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ACTIVATE, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return RouterGrpc.bindService(this);
    }
  }

  /**
   * <pre>
   * The Router service provides pure network functionality
   * </pre>
   */
  public static interface RouterBlockingClient {

    /**
     * <pre>
     * Gateway subscribes to downlink messages from Router
     * It is possible to open multiple subscriptions (but not recommended).
     * If you do this, you are responsible for de-duplication of downlink messages.
     * </pre>
     */
    public java.util.Iterator<org.thethingsnetwork.management.proto.RouterOuterClass.DownlinkMessage> subscribe(
        org.thethingsnetwork.management.proto.RouterOuterClass.SubscribeRequest request);

    /**
     * <pre>
     * Gateway requests device activation
     * </pre>
     */
    public org.thethingsnetwork.management.proto.RouterOuterClass.DeviceActivationResponse activate(org.thethingsnetwork.management.proto.RouterOuterClass.DeviceActivationRequest request);
  }

  /**
   * <pre>
   * The Router service provides pure network functionality
   * </pre>
   */
  public static interface RouterFutureClient {

    /**
     * <pre>
     * Gateway requests device activation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.RouterOuterClass.DeviceActivationResponse> activate(
        org.thethingsnetwork.management.proto.RouterOuterClass.DeviceActivationRequest request);
  }

  public static class RouterStub extends io.grpc.stub.AbstractStub<RouterStub>
      implements Router {
    private RouterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RouterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RouterStub(channel, callOptions);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.Gateway.Status> gatewayStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_GATEWAY_STATUS, getCallOptions()), responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.RouterOuterClass.UplinkMessage> uplink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_UPLINK, getCallOptions()), responseObserver);
    }

    @java.lang.Override
    public void subscribe(org.thethingsnetwork.management.proto.RouterOuterClass.SubscribeRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.RouterOuterClass.DownlinkMessage> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_SUBSCRIBE, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void activate(org.thethingsnetwork.management.proto.RouterOuterClass.DeviceActivationRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.RouterOuterClass.DeviceActivationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ACTIVATE, getCallOptions()), request, responseObserver);
    }
  }

  public static class RouterBlockingStub extends io.grpc.stub.AbstractStub<RouterBlockingStub>
      implements RouterBlockingClient {
    private RouterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RouterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RouterBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public java.util.Iterator<org.thethingsnetwork.management.proto.RouterOuterClass.DownlinkMessage> subscribe(
        org.thethingsnetwork.management.proto.RouterOuterClass.SubscribeRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_SUBSCRIBE, getCallOptions(), request);
    }

    @java.lang.Override
    public org.thethingsnetwork.management.proto.RouterOuterClass.DeviceActivationResponse activate(org.thethingsnetwork.management.proto.RouterOuterClass.DeviceActivationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ACTIVATE, getCallOptions(), request);
    }
  }

  public static class RouterFutureStub extends io.grpc.stub.AbstractStub<RouterFutureStub>
      implements RouterFutureClient {
    private RouterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RouterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RouterFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.RouterOuterClass.DeviceActivationResponse> activate(
        org.thethingsnetwork.management.proto.RouterOuterClass.DeviceActivationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ACTIVATE, getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBSCRIBE = 0;
  private static final int METHODID_ACTIVATE = 1;
  private static final int METHODID_GATEWAY_STATUS = 2;
  private static final int METHODID_UPLINK = 3;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Router serviceImpl;
    private final int methodId;

    public MethodHandlers(Router serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBSCRIBE:
          serviceImpl.subscribe((org.thethingsnetwork.management.proto.RouterOuterClass.SubscribeRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.RouterOuterClass.DownlinkMessage>) responseObserver);
          break;
        case METHODID_ACTIVATE:
          serviceImpl.activate((org.thethingsnetwork.management.proto.RouterOuterClass.DeviceActivationRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.RouterOuterClass.DeviceActivationResponse>) responseObserver);
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
        case METHODID_GATEWAY_STATUS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.gatewayStatus(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        case METHODID_UPLINK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.uplink(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final Router serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_GATEWAY_STATUS,
          asyncClientStreamingCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.Gateway.Status,
              com.google.protobuf.Empty>(
                serviceImpl, METHODID_GATEWAY_STATUS)))
        .addMethod(
          METHOD_UPLINK,
          asyncClientStreamingCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.RouterOuterClass.UplinkMessage,
              com.google.protobuf.Empty>(
                serviceImpl, METHODID_UPLINK)))
        .addMethod(
          METHOD_SUBSCRIBE,
          asyncServerStreamingCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.RouterOuterClass.SubscribeRequest,
              org.thethingsnetwork.management.proto.RouterOuterClass.DownlinkMessage>(
                serviceImpl, METHODID_SUBSCRIBE)))
        .addMethod(
          METHOD_ACTIVATE,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.RouterOuterClass.DeviceActivationRequest,
              org.thethingsnetwork.management.proto.RouterOuterClass.DeviceActivationResponse>(
                serviceImpl, METHODID_ACTIVATE)))
        .build();
  }
}
