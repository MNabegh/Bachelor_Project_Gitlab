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
 * The Device Addresses in the network are issued by the NetworkServer
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.14.0)",
    comments = "Source: ttn/api/protocol/lorawan/device_address.proto")
public class DevAddrManagerGrpc {

  private DevAddrManagerGrpc() {}

  public static final String SERVICE_NAME = "lorawan.DevAddrManager";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.DeviceAddress.PrefixesRequest,
      org.thethingsnetwork.management.proto.DeviceAddress.PrefixesResponse> METHOD_GET_PREFIXES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "lorawan.DevAddrManager", "GetPrefixes"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.DeviceAddress.PrefixesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.DeviceAddress.PrefixesResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.DeviceAddress.DevAddrRequest,
      org.thethingsnetwork.management.proto.DeviceAddress.DevAddrResponse> METHOD_GET_DEV_ADDR =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "lorawan.DevAddrManager", "GetDevAddr"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.DeviceAddress.DevAddrRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.DeviceAddress.DevAddrResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DevAddrManagerStub newStub(io.grpc.Channel channel) {
    return new DevAddrManagerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DevAddrManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DevAddrManagerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static DevAddrManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DevAddrManagerFutureStub(channel);
  }

  /**
   * <pre>
   * The Device Addresses in the network are issued by the NetworkServer
   * </pre>
   */
  public static interface DevAddrManager {

    /**
     * <pre>
     * Get all prefixes that are in use or available
     * </pre>
     */
    public void getPrefixes(org.thethingsnetwork.management.proto.DeviceAddress.PrefixesRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.DeviceAddress.PrefixesResponse> responseObserver);

    /**
     * <pre>
     * Request a device address
     * </pre>
     */
    public void getDevAddr(org.thethingsnetwork.management.proto.DeviceAddress.DevAddrRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.DeviceAddress.DevAddrResponse> responseObserver);
  }

  @io.grpc.ExperimentalApi
  public static abstract class AbstractDevAddrManager implements DevAddrManager, io.grpc.BindableService {

    @java.lang.Override
    public void getPrefixes(org.thethingsnetwork.management.proto.DeviceAddress.PrefixesRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.DeviceAddress.PrefixesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PREFIXES, responseObserver);
    }

    @java.lang.Override
    public void getDevAddr(org.thethingsnetwork.management.proto.DeviceAddress.DevAddrRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.DeviceAddress.DevAddrResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_DEV_ADDR, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return DevAddrManagerGrpc.bindService(this);
    }
  }

  /**
   * <pre>
   * The Device Addresses in the network are issued by the NetworkServer
   * </pre>
   */
  public static interface DevAddrManagerBlockingClient {

    /**
     * <pre>
     * Get all prefixes that are in use or available
     * </pre>
     */
    public org.thethingsnetwork.management.proto.DeviceAddress.PrefixesResponse getPrefixes(org.thethingsnetwork.management.proto.DeviceAddress.PrefixesRequest request);

    /**
     * <pre>
     * Request a device address
     * </pre>
     */
    public org.thethingsnetwork.management.proto.DeviceAddress.DevAddrResponse getDevAddr(org.thethingsnetwork.management.proto.DeviceAddress.DevAddrRequest request);
  }

  /**
   * <pre>
   * The Device Addresses in the network are issued by the NetworkServer
   * </pre>
   */
  public static interface DevAddrManagerFutureClient {

    /**
     * <pre>
     * Get all prefixes that are in use or available
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.DeviceAddress.PrefixesResponse> getPrefixes(
        org.thethingsnetwork.management.proto.DeviceAddress.PrefixesRequest request);

    /**
     * <pre>
     * Request a device address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.DeviceAddress.DevAddrResponse> getDevAddr(
        org.thethingsnetwork.management.proto.DeviceAddress.DevAddrRequest request);
  }

  public static class DevAddrManagerStub extends io.grpc.stub.AbstractStub<DevAddrManagerStub>
      implements DevAddrManager {
    private DevAddrManagerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DevAddrManagerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DevAddrManagerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DevAddrManagerStub(channel, callOptions);
    }

    @java.lang.Override
    public void getPrefixes(org.thethingsnetwork.management.proto.DeviceAddress.PrefixesRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.DeviceAddress.PrefixesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PREFIXES, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getDevAddr(org.thethingsnetwork.management.proto.DeviceAddress.DevAddrRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.DeviceAddress.DevAddrResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_DEV_ADDR, getCallOptions()), request, responseObserver);
    }
  }

  public static class DevAddrManagerBlockingStub extends io.grpc.stub.AbstractStub<DevAddrManagerBlockingStub>
      implements DevAddrManagerBlockingClient {
    private DevAddrManagerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DevAddrManagerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DevAddrManagerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DevAddrManagerBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public org.thethingsnetwork.management.proto.DeviceAddress.PrefixesResponse getPrefixes(org.thethingsnetwork.management.proto.DeviceAddress.PrefixesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PREFIXES, getCallOptions(), request);
    }

    @java.lang.Override
    public org.thethingsnetwork.management.proto.DeviceAddress.DevAddrResponse getDevAddr(org.thethingsnetwork.management.proto.DeviceAddress.DevAddrRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_DEV_ADDR, getCallOptions(), request);
    }
  }

  public static class DevAddrManagerFutureStub extends io.grpc.stub.AbstractStub<DevAddrManagerFutureStub>
      implements DevAddrManagerFutureClient {
    private DevAddrManagerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DevAddrManagerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DevAddrManagerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DevAddrManagerFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.DeviceAddress.PrefixesResponse> getPrefixes(
        org.thethingsnetwork.management.proto.DeviceAddress.PrefixesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PREFIXES, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.DeviceAddress.DevAddrResponse> getDevAddr(
        org.thethingsnetwork.management.proto.DeviceAddress.DevAddrRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_DEV_ADDR, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PREFIXES = 0;
  private static final int METHODID_GET_DEV_ADDR = 1;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DevAddrManager serviceImpl;
    private final int methodId;

    public MethodHandlers(DevAddrManager serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PREFIXES:
          serviceImpl.getPrefixes((org.thethingsnetwork.management.proto.DeviceAddress.PrefixesRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.DeviceAddress.PrefixesResponse>) responseObserver);
          break;
        case METHODID_GET_DEV_ADDR:
          serviceImpl.getDevAddr((org.thethingsnetwork.management.proto.DeviceAddress.DevAddrRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.DeviceAddress.DevAddrResponse>) responseObserver);
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
      final DevAddrManager serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_GET_PREFIXES,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.DeviceAddress.PrefixesRequest,
              org.thethingsnetwork.management.proto.DeviceAddress.PrefixesResponse>(
                serviceImpl, METHODID_GET_PREFIXES)))
        .addMethod(
          METHOD_GET_DEV_ADDR,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.DeviceAddress.DevAddrRequest,
              org.thethingsnetwork.management.proto.DeviceAddress.DevAddrResponse>(
                serviceImpl, METHODID_GET_DEV_ADDR)))
        .build();
  }
}
