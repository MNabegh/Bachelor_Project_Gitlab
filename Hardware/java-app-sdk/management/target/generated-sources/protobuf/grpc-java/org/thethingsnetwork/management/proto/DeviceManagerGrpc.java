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
    comments = "Source: ttn/api/protocol/lorawan/device.proto")
public class DeviceManagerGrpc {

  private DeviceManagerGrpc() {}

  public static final String SERVICE_NAME = "lorawan.DeviceManager";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.DeviceOuterClass.DeviceIdentifier,
      org.thethingsnetwork.management.proto.DeviceOuterClass.Device> METHOD_GET_DEVICE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "lorawan.DeviceManager", "GetDevice"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.DeviceOuterClass.DeviceIdentifier.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.DeviceOuterClass.Device.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.DeviceOuterClass.Device,
      com.google.protobuf.Empty> METHOD_SET_DEVICE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "lorawan.DeviceManager", "SetDevice"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.DeviceOuterClass.Device.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.DeviceOuterClass.DeviceIdentifier,
      com.google.protobuf.Empty> METHOD_DELETE_DEVICE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "lorawan.DeviceManager", "DeleteDevice"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.DeviceOuterClass.DeviceIdentifier.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeviceManagerStub newStub(io.grpc.Channel channel) {
    return new DeviceManagerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeviceManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DeviceManagerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static DeviceManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DeviceManagerFutureStub(channel);
  }

  /**
   */
  public static interface DeviceManager {

    /**
     */
    public void getDevice(org.thethingsnetwork.management.proto.DeviceOuterClass.DeviceIdentifier request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.DeviceOuterClass.Device> responseObserver);

    /**
     */
    public void setDevice(org.thethingsnetwork.management.proto.DeviceOuterClass.Device request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver);

    /**
     */
    public void deleteDevice(org.thethingsnetwork.management.proto.DeviceOuterClass.DeviceIdentifier request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver);
  }

  @io.grpc.ExperimentalApi
  public static abstract class AbstractDeviceManager implements DeviceManager, io.grpc.BindableService {

    @java.lang.Override
    public void getDevice(org.thethingsnetwork.management.proto.DeviceOuterClass.DeviceIdentifier request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.DeviceOuterClass.Device> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_DEVICE, responseObserver);
    }

    @java.lang.Override
    public void setDevice(org.thethingsnetwork.management.proto.DeviceOuterClass.Device request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_DEVICE, responseObserver);
    }

    @java.lang.Override
    public void deleteDevice(org.thethingsnetwork.management.proto.DeviceOuterClass.DeviceIdentifier request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_DEVICE, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return DeviceManagerGrpc.bindService(this);
    }
  }

  /**
   */
  public static interface DeviceManagerBlockingClient {

    /**
     */
    public org.thethingsnetwork.management.proto.DeviceOuterClass.Device getDevice(org.thethingsnetwork.management.proto.DeviceOuterClass.DeviceIdentifier request);

    /**
     */
    public com.google.protobuf.Empty setDevice(org.thethingsnetwork.management.proto.DeviceOuterClass.Device request);

    /**
     */
    public com.google.protobuf.Empty deleteDevice(org.thethingsnetwork.management.proto.DeviceOuterClass.DeviceIdentifier request);
  }

  /**
   */
  public static interface DeviceManagerFutureClient {

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.DeviceOuterClass.Device> getDevice(
        org.thethingsnetwork.management.proto.DeviceOuterClass.DeviceIdentifier request);

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> setDevice(
        org.thethingsnetwork.management.proto.DeviceOuterClass.Device request);

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteDevice(
        org.thethingsnetwork.management.proto.DeviceOuterClass.DeviceIdentifier request);
  }

  public static class DeviceManagerStub extends io.grpc.stub.AbstractStub<DeviceManagerStub>
      implements DeviceManager {
    private DeviceManagerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeviceManagerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceManagerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeviceManagerStub(channel, callOptions);
    }

    @java.lang.Override
    public void getDevice(org.thethingsnetwork.management.proto.DeviceOuterClass.DeviceIdentifier request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.DeviceOuterClass.Device> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_DEVICE, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void setDevice(org.thethingsnetwork.management.proto.DeviceOuterClass.Device request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_DEVICE, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void deleteDevice(org.thethingsnetwork.management.proto.DeviceOuterClass.DeviceIdentifier request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_DEVICE, getCallOptions()), request, responseObserver);
    }
  }

  public static class DeviceManagerBlockingStub extends io.grpc.stub.AbstractStub<DeviceManagerBlockingStub>
      implements DeviceManagerBlockingClient {
    private DeviceManagerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeviceManagerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceManagerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeviceManagerBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public org.thethingsnetwork.management.proto.DeviceOuterClass.Device getDevice(org.thethingsnetwork.management.proto.DeviceOuterClass.DeviceIdentifier request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_DEVICE, getCallOptions(), request);
    }

    @java.lang.Override
    public com.google.protobuf.Empty setDevice(org.thethingsnetwork.management.proto.DeviceOuterClass.Device request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_DEVICE, getCallOptions(), request);
    }

    @java.lang.Override
    public com.google.protobuf.Empty deleteDevice(org.thethingsnetwork.management.proto.DeviceOuterClass.DeviceIdentifier request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_DEVICE, getCallOptions(), request);
    }
  }

  public static class DeviceManagerFutureStub extends io.grpc.stub.AbstractStub<DeviceManagerFutureStub>
      implements DeviceManagerFutureClient {
    private DeviceManagerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeviceManagerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceManagerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeviceManagerFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.DeviceOuterClass.Device> getDevice(
        org.thethingsnetwork.management.proto.DeviceOuterClass.DeviceIdentifier request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_DEVICE, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> setDevice(
        org.thethingsnetwork.management.proto.DeviceOuterClass.Device request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_DEVICE, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteDevice(
        org.thethingsnetwork.management.proto.DeviceOuterClass.DeviceIdentifier request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_DEVICE, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DEVICE = 0;
  private static final int METHODID_SET_DEVICE = 1;
  private static final int METHODID_DELETE_DEVICE = 2;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DeviceManager serviceImpl;
    private final int methodId;

    public MethodHandlers(DeviceManager serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DEVICE:
          serviceImpl.getDevice((org.thethingsnetwork.management.proto.DeviceOuterClass.DeviceIdentifier) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.DeviceOuterClass.Device>) responseObserver);
          break;
        case METHODID_SET_DEVICE:
          serviceImpl.setDevice((org.thethingsnetwork.management.proto.DeviceOuterClass.Device) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_DEVICE:
          serviceImpl.deleteDevice((org.thethingsnetwork.management.proto.DeviceOuterClass.DeviceIdentifier) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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
      final DeviceManager serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_GET_DEVICE,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.DeviceOuterClass.DeviceIdentifier,
              org.thethingsnetwork.management.proto.DeviceOuterClass.Device>(
                serviceImpl, METHODID_GET_DEVICE)))
        .addMethod(
          METHOD_SET_DEVICE,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.DeviceOuterClass.Device,
              com.google.protobuf.Empty>(
                serviceImpl, METHODID_SET_DEVICE)))
        .addMethod(
          METHOD_DELETE_DEVICE,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.DeviceOuterClass.DeviceIdentifier,
              com.google.protobuf.Empty>(
                serviceImpl, METHODID_DELETE_DEVICE)))
        .build();
  }
}
