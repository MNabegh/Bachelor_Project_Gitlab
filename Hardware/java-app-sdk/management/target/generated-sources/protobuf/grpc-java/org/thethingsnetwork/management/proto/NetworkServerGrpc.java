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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.14.0)",
    comments = "Source: ttn/api/networkserver/networkserver.proto")
public class NetworkServerGrpc {

  private NetworkServerGrpc() {}

  public static final String SERVICE_NAME = "networkserver.NetworkServer";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.Networkserver.DevicesRequest,
      org.thethingsnetwork.management.proto.Networkserver.DevicesResponse> METHOD_GET_DEVICES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "networkserver.NetworkServer", "GetDevices"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.Networkserver.DevicesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.Networkserver.DevicesResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedDeviceActivationRequest,
      org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedDeviceActivationRequest> METHOD_PREPARE_ACTIVATION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "networkserver.NetworkServer", "PrepareActivation"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedDeviceActivationRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedDeviceActivationRequest.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceActivationResponse,
      org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceActivationResponse> METHOD_ACTIVATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "networkserver.NetworkServer", "Activate"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceActivationResponse.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceActivationResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage,
      org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage> METHOD_UPLINK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "networkserver.NetworkServer", "Uplink"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage,
      org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage> METHOD_DOWNLINK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "networkserver.NetworkServer", "Downlink"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NetworkServerStub newStub(io.grpc.Channel channel) {
    return new NetworkServerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NetworkServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NetworkServerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static NetworkServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NetworkServerFutureStub(channel);
  }

  /**
   */
  public static interface NetworkServer {

    /**
     * <pre>
     * Broker requests devices with DevAddr and matching FCnt (or disabled FCnt check)
     * </pre>
     */
    public void getDevices(org.thethingsnetwork.management.proto.Networkserver.DevicesRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.Networkserver.DevicesResponse> responseObserver);

    /**
     * <pre>
     * Broker requests device activation "template" from Network Server
     * </pre>
     */
    public void prepareActivation(org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedDeviceActivationRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedDeviceActivationRequest> responseObserver);

    /**
     * <pre>
     * Broker confirms device activation (after response from Handler)
     * </pre>
     */
    public void activate(org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceActivationResponse request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceActivationResponse> responseObserver);

    /**
     * <pre>
     * Broker informs Network Server about Uplink
     * </pre>
     */
    public void uplink(org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage> responseObserver);

    /**
     * <pre>
     * Broker informs Network Server about Downlink, NetworkServer may add MAC commands and re-set MIC
     * </pre>
     */
    public void downlink(org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage> responseObserver);
  }

  @io.grpc.ExperimentalApi
  public static abstract class AbstractNetworkServer implements NetworkServer, io.grpc.BindableService {

    @java.lang.Override
    public void getDevices(org.thethingsnetwork.management.proto.Networkserver.DevicesRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.Networkserver.DevicesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_DEVICES, responseObserver);
    }

    @java.lang.Override
    public void prepareActivation(org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedDeviceActivationRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedDeviceActivationRequest> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PREPARE_ACTIVATION, responseObserver);
    }

    @java.lang.Override
    public void activate(org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceActivationResponse request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceActivationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ACTIVATE, responseObserver);
    }

    @java.lang.Override
    public void uplink(org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPLINK, responseObserver);
    }

    @java.lang.Override
    public void downlink(org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DOWNLINK, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return NetworkServerGrpc.bindService(this);
    }
  }

  /**
   */
  public static interface NetworkServerBlockingClient {

    /**
     * <pre>
     * Broker requests devices with DevAddr and matching FCnt (or disabled FCnt check)
     * </pre>
     */
    public org.thethingsnetwork.management.proto.Networkserver.DevicesResponse getDevices(org.thethingsnetwork.management.proto.Networkserver.DevicesRequest request);

    /**
     * <pre>
     * Broker requests device activation "template" from Network Server
     * </pre>
     */
    public org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedDeviceActivationRequest prepareActivation(org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedDeviceActivationRequest request);

    /**
     * <pre>
     * Broker confirms device activation (after response from Handler)
     * </pre>
     */
    public org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceActivationResponse activate(org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceActivationResponse request);

    /**
     * <pre>
     * Broker informs Network Server about Uplink
     * </pre>
     */
    public org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage uplink(org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage request);

    /**
     * <pre>
     * Broker informs Network Server about Downlink, NetworkServer may add MAC commands and re-set MIC
     * </pre>
     */
    public org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage downlink(org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage request);
  }

  /**
   */
  public static interface NetworkServerFutureClient {

    /**
     * <pre>
     * Broker requests devices with DevAddr and matching FCnt (or disabled FCnt check)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.Networkserver.DevicesResponse> getDevices(
        org.thethingsnetwork.management.proto.Networkserver.DevicesRequest request);

    /**
     * <pre>
     * Broker requests device activation "template" from Network Server
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedDeviceActivationRequest> prepareActivation(
        org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedDeviceActivationRequest request);

    /**
     * <pre>
     * Broker confirms device activation (after response from Handler)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceActivationResponse> activate(
        org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceActivationResponse request);

    /**
     * <pre>
     * Broker informs Network Server about Uplink
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage> uplink(
        org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage request);

    /**
     * <pre>
     * Broker informs Network Server about Downlink, NetworkServer may add MAC commands and re-set MIC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage> downlink(
        org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage request);
  }

  public static class NetworkServerStub extends io.grpc.stub.AbstractStub<NetworkServerStub>
      implements NetworkServer {
    private NetworkServerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NetworkServerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkServerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NetworkServerStub(channel, callOptions);
    }

    @java.lang.Override
    public void getDevices(org.thethingsnetwork.management.proto.Networkserver.DevicesRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.Networkserver.DevicesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_DEVICES, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void prepareActivation(org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedDeviceActivationRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedDeviceActivationRequest> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PREPARE_ACTIVATION, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void activate(org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceActivationResponse request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceActivationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ACTIVATE, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void uplink(org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPLINK, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void downlink(org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DOWNLINK, getCallOptions()), request, responseObserver);
    }
  }

  public static class NetworkServerBlockingStub extends io.grpc.stub.AbstractStub<NetworkServerBlockingStub>
      implements NetworkServerBlockingClient {
    private NetworkServerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NetworkServerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkServerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NetworkServerBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public org.thethingsnetwork.management.proto.Networkserver.DevicesResponse getDevices(org.thethingsnetwork.management.proto.Networkserver.DevicesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_DEVICES, getCallOptions(), request);
    }

    @java.lang.Override
    public org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedDeviceActivationRequest prepareActivation(org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedDeviceActivationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PREPARE_ACTIVATION, getCallOptions(), request);
    }

    @java.lang.Override
    public org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceActivationResponse activate(org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceActivationResponse request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ACTIVATE, getCallOptions(), request);
    }

    @java.lang.Override
    public org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage uplink(org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPLINK, getCallOptions(), request);
    }

    @java.lang.Override
    public org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage downlink(org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DOWNLINK, getCallOptions(), request);
    }
  }

  public static class NetworkServerFutureStub extends io.grpc.stub.AbstractStub<NetworkServerFutureStub>
      implements NetworkServerFutureClient {
    private NetworkServerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NetworkServerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkServerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NetworkServerFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.Networkserver.DevicesResponse> getDevices(
        org.thethingsnetwork.management.proto.Networkserver.DevicesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_DEVICES, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedDeviceActivationRequest> prepareActivation(
        org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedDeviceActivationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PREPARE_ACTIVATION, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceActivationResponse> activate(
        org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceActivationResponse request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ACTIVATE, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage> uplink(
        org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPLINK, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage> downlink(
        org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DOWNLINK, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DEVICES = 0;
  private static final int METHODID_PREPARE_ACTIVATION = 1;
  private static final int METHODID_ACTIVATE = 2;
  private static final int METHODID_UPLINK = 3;
  private static final int METHODID_DOWNLINK = 4;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NetworkServer serviceImpl;
    private final int methodId;

    public MethodHandlers(NetworkServer serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DEVICES:
          serviceImpl.getDevices((org.thethingsnetwork.management.proto.Networkserver.DevicesRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.Networkserver.DevicesResponse>) responseObserver);
          break;
        case METHODID_PREPARE_ACTIVATION:
          serviceImpl.prepareActivation((org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedDeviceActivationRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedDeviceActivationRequest>) responseObserver);
          break;
        case METHODID_ACTIVATE:
          serviceImpl.activate((org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceActivationResponse) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceActivationResponse>) responseObserver);
          break;
        case METHODID_UPLINK:
          serviceImpl.uplink((org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage>) responseObserver);
          break;
        case METHODID_DOWNLINK:
          serviceImpl.downlink((org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage>) responseObserver);
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
      final NetworkServer serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_GET_DEVICES,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.Networkserver.DevicesRequest,
              org.thethingsnetwork.management.proto.Networkserver.DevicesResponse>(
                serviceImpl, METHODID_GET_DEVICES)))
        .addMethod(
          METHOD_PREPARE_ACTIVATION,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedDeviceActivationRequest,
              org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedDeviceActivationRequest>(
                serviceImpl, METHODID_PREPARE_ACTIVATION)))
        .addMethod(
          METHOD_ACTIVATE,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceActivationResponse,
              org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceActivationResponse>(
                serviceImpl, METHODID_ACTIVATE)))
        .addMethod(
          METHOD_UPLINK,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage,
              org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage>(
                serviceImpl, METHODID_UPLINK)))
        .addMethod(
          METHOD_DOWNLINK,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage,
              org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage>(
                serviceImpl, METHODID_DOWNLINK)))
        .build();
  }
}
