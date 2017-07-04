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
 * The RouterManager service provides configuration and monitoring functionality
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.14.0)",
    comments = "Source: ttn/api/router/router.proto")
public class RouterManagerGrpc {

  private RouterManagerGrpc() {}

  public static final String SERVICE_NAME = "router.RouterManager";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.RouterOuterClass.GatewayStatusRequest,
      org.thethingsnetwork.management.proto.RouterOuterClass.GatewayStatusResponse> METHOD_GATEWAY_STATUS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "router.RouterManager", "GatewayStatus"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.RouterOuterClass.GatewayStatusRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.RouterOuterClass.GatewayStatusResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.RouterOuterClass.StatusRequest,
      org.thethingsnetwork.management.proto.RouterOuterClass.Status> METHOD_GET_STATUS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "router.RouterManager", "GetStatus"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.RouterOuterClass.StatusRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.RouterOuterClass.Status.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RouterManagerStub newStub(io.grpc.Channel channel) {
    return new RouterManagerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RouterManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RouterManagerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static RouterManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RouterManagerFutureStub(channel);
  }

  /**
   * <pre>
   * The RouterManager service provides configuration and monitoring functionality
   * </pre>
   */
  public static interface RouterManager {

    /**
     * <pre>
     * Gateway owner or network operator requests Gateway status from Router Manager
     * Deprecated: Use monitor API (NOC) instead of this
     * </pre>
     */
    public void gatewayStatus(org.thethingsnetwork.management.proto.RouterOuterClass.GatewayStatusRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.RouterOuterClass.GatewayStatusResponse> responseObserver);

    /**
     * <pre>
     * Network operator requests Router status
     * </pre>
     */
    public void getStatus(org.thethingsnetwork.management.proto.RouterOuterClass.StatusRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.RouterOuterClass.Status> responseObserver);
  }

  @io.grpc.ExperimentalApi
  public static abstract class AbstractRouterManager implements RouterManager, io.grpc.BindableService {

    @java.lang.Override
    public void gatewayStatus(org.thethingsnetwork.management.proto.RouterOuterClass.GatewayStatusRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.RouterOuterClass.GatewayStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GATEWAY_STATUS, responseObserver);
    }

    @java.lang.Override
    public void getStatus(org.thethingsnetwork.management.proto.RouterOuterClass.StatusRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.RouterOuterClass.Status> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_STATUS, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return RouterManagerGrpc.bindService(this);
    }
  }

  /**
   * <pre>
   * The RouterManager service provides configuration and monitoring functionality
   * </pre>
   */
  public static interface RouterManagerBlockingClient {

    /**
     * <pre>
     * Gateway owner or network operator requests Gateway status from Router Manager
     * Deprecated: Use monitor API (NOC) instead of this
     * </pre>
     */
    public org.thethingsnetwork.management.proto.RouterOuterClass.GatewayStatusResponse gatewayStatus(org.thethingsnetwork.management.proto.RouterOuterClass.GatewayStatusRequest request);

    /**
     * <pre>
     * Network operator requests Router status
     * </pre>
     */
    public org.thethingsnetwork.management.proto.RouterOuterClass.Status getStatus(org.thethingsnetwork.management.proto.RouterOuterClass.StatusRequest request);
  }

  /**
   * <pre>
   * The RouterManager service provides configuration and monitoring functionality
   * </pre>
   */
  public static interface RouterManagerFutureClient {

    /**
     * <pre>
     * Gateway owner or network operator requests Gateway status from Router Manager
     * Deprecated: Use monitor API (NOC) instead of this
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.RouterOuterClass.GatewayStatusResponse> gatewayStatus(
        org.thethingsnetwork.management.proto.RouterOuterClass.GatewayStatusRequest request);

    /**
     * <pre>
     * Network operator requests Router status
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.RouterOuterClass.Status> getStatus(
        org.thethingsnetwork.management.proto.RouterOuterClass.StatusRequest request);
  }

  public static class RouterManagerStub extends io.grpc.stub.AbstractStub<RouterManagerStub>
      implements RouterManager {
    private RouterManagerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RouterManagerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouterManagerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RouterManagerStub(channel, callOptions);
    }

    @java.lang.Override
    public void gatewayStatus(org.thethingsnetwork.management.proto.RouterOuterClass.GatewayStatusRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.RouterOuterClass.GatewayStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GATEWAY_STATUS, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getStatus(org.thethingsnetwork.management.proto.RouterOuterClass.StatusRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.RouterOuterClass.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_STATUS, getCallOptions()), request, responseObserver);
    }
  }

  public static class RouterManagerBlockingStub extends io.grpc.stub.AbstractStub<RouterManagerBlockingStub>
      implements RouterManagerBlockingClient {
    private RouterManagerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RouterManagerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouterManagerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RouterManagerBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public org.thethingsnetwork.management.proto.RouterOuterClass.GatewayStatusResponse gatewayStatus(org.thethingsnetwork.management.proto.RouterOuterClass.GatewayStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GATEWAY_STATUS, getCallOptions(), request);
    }

    @java.lang.Override
    public org.thethingsnetwork.management.proto.RouterOuterClass.Status getStatus(org.thethingsnetwork.management.proto.RouterOuterClass.StatusRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_STATUS, getCallOptions(), request);
    }
  }

  public static class RouterManagerFutureStub extends io.grpc.stub.AbstractStub<RouterManagerFutureStub>
      implements RouterManagerFutureClient {
    private RouterManagerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RouterManagerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouterManagerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RouterManagerFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.RouterOuterClass.GatewayStatusResponse> gatewayStatus(
        org.thethingsnetwork.management.proto.RouterOuterClass.GatewayStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GATEWAY_STATUS, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.RouterOuterClass.Status> getStatus(
        org.thethingsnetwork.management.proto.RouterOuterClass.StatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_STATUS, getCallOptions()), request);
    }
  }

  private static final int METHODID_GATEWAY_STATUS = 0;
  private static final int METHODID_GET_STATUS = 1;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RouterManager serviceImpl;
    private final int methodId;

    public MethodHandlers(RouterManager serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GATEWAY_STATUS:
          serviceImpl.gatewayStatus((org.thethingsnetwork.management.proto.RouterOuterClass.GatewayStatusRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.RouterOuterClass.GatewayStatusResponse>) responseObserver);
          break;
        case METHODID_GET_STATUS:
          serviceImpl.getStatus((org.thethingsnetwork.management.proto.RouterOuterClass.StatusRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.RouterOuterClass.Status>) responseObserver);
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
      final RouterManager serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_GATEWAY_STATUS,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.RouterOuterClass.GatewayStatusRequest,
              org.thethingsnetwork.management.proto.RouterOuterClass.GatewayStatusResponse>(
                serviceImpl, METHODID_GATEWAY_STATUS)))
        .addMethod(
          METHOD_GET_STATUS,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.RouterOuterClass.StatusRequest,
              org.thethingsnetwork.management.proto.RouterOuterClass.Status>(
                serviceImpl, METHODID_GET_STATUS)))
        .build();
  }
}
