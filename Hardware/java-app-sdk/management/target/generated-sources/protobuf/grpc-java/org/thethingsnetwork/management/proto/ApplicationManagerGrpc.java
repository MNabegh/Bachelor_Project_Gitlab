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
 * ApplicationManager manages application and device registrations on the Handler
 * To protect our quality of service, you can make up to 5000 calls to the
 * ApplicationManager API per hour. Once you go over the rate limit, you will
 * receive an error response.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.14.0)",
    comments = "Source: ttn/api/handler/handler.proto")
public class ApplicationManagerGrpc {

  private ApplicationManagerGrpc() {}

  public static final String SERVICE_NAME = "handler.ApplicationManager";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier,
      com.google.protobuf.Empty> METHOD_REGISTER_APPLICATION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "handler.ApplicationManager", "RegisterApplication"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier,
      org.thethingsnetwork.management.proto.HandlerOuterClass.Application> METHOD_GET_APPLICATION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "handler.ApplicationManager", "GetApplication"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.HandlerOuterClass.Application.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.HandlerOuterClass.Application,
      com.google.protobuf.Empty> METHOD_SET_APPLICATION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "handler.ApplicationManager", "SetApplication"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.HandlerOuterClass.Application.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier,
      com.google.protobuf.Empty> METHOD_DELETE_APPLICATION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "handler.ApplicationManager", "DeleteApplication"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceIdentifier,
      org.thethingsnetwork.management.proto.HandlerOuterClass.Device> METHOD_GET_DEVICE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "handler.ApplicationManager", "GetDevice"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceIdentifier.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.HandlerOuterClass.Device.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.HandlerOuterClass.Device,
      com.google.protobuf.Empty> METHOD_SET_DEVICE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "handler.ApplicationManager", "SetDevice"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.HandlerOuterClass.Device.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceIdentifier,
      com.google.protobuf.Empty> METHOD_DELETE_DEVICE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "handler.ApplicationManager", "DeleteDevice"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceIdentifier.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier,
      org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceList> METHOD_GET_DEVICES_FOR_APPLICATION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "handler.ApplicationManager", "GetDevicesForApplication"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceList.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.HandlerOuterClass.DryDownlinkMessage,
      org.thethingsnetwork.management.proto.HandlerOuterClass.DryDownlinkResult> METHOD_DRY_DOWNLINK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "handler.ApplicationManager", "DryDownlink"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.HandlerOuterClass.DryDownlinkMessage.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.HandlerOuterClass.DryDownlinkResult.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.HandlerOuterClass.DryUplinkMessage,
      org.thethingsnetwork.management.proto.HandlerOuterClass.DryUplinkResult> METHOD_DRY_UPLINK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "handler.ApplicationManager", "DryUplink"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.HandlerOuterClass.DryUplinkMessage.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.HandlerOuterClass.DryUplinkResult.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.HandlerOuterClass.SimulatedUplinkMessage,
      com.google.protobuf.Empty> METHOD_SIMULATE_UPLINK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "handler.ApplicationManager", "SimulateUplink"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.HandlerOuterClass.SimulatedUplinkMessage.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ApplicationManagerStub newStub(io.grpc.Channel channel) {
    return new ApplicationManagerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ApplicationManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ApplicationManagerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ApplicationManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ApplicationManagerFutureStub(channel);
  }

  /**
   * <pre>
   * ApplicationManager manages application and device registrations on the Handler
   * To protect our quality of service, you can make up to 5000 calls to the
   * ApplicationManager API per hour. Once you go over the rate limit, you will
   * receive an error response.
   * </pre>
   */
  public static interface ApplicationManager {

    /**
     * <pre>
     * Applications should first be registered to the Handler with the `RegisterApplication` method
     * </pre>
     */
    public void registerApplication(org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver);

    /**
     * <pre>
     * GetApplication returns the application with the given identifier (app_id)
     * </pre>
     */
    public void getApplication(org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.HandlerOuterClass.Application> responseObserver);

    /**
     * <pre>
     * SetApplication updates the settings for the application. All fields must be supplied.
     * </pre>
     */
    public void setApplication(org.thethingsnetwork.management.proto.HandlerOuterClass.Application request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver);

    /**
     * <pre>
     * DeleteApplication deletes the application with the given identifier (app_id)
     * </pre>
     */
    public void deleteApplication(org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver);

    /**
     * <pre>
     * GetDevice returns the device with the given identifier (app_id and dev_id)
     * </pre>
     */
    public void getDevice(org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceIdentifier request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.HandlerOuterClass.Device> responseObserver);

    /**
     * <pre>
     * SetDevice creates or updates a device. All fields must be supplied.
     * </pre>
     */
    public void setDevice(org.thethingsnetwork.management.proto.HandlerOuterClass.Device request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver);

    /**
     * <pre>
     * DeleteDevice deletes the device with the given identifier (app_id and dev_id)
     * </pre>
     */
    public void deleteDevice(org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceIdentifier request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver);

    /**
     * <pre>
     * GetDevicesForApplication returns all devices that belong to the application with the given identifier (app_id)
     * </pre>
     */
    public void getDevicesForApplication(org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceList> responseObserver);

    /**
     * <pre>
     * DryUplink simulates processing a downlink message and returns the result
     * </pre>
     */
    public void dryDownlink(org.thethingsnetwork.management.proto.HandlerOuterClass.DryDownlinkMessage request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.HandlerOuterClass.DryDownlinkResult> responseObserver);

    /**
     * <pre>
     * DryUplink simulates processing an uplink message and returns the result
     * </pre>
     */
    public void dryUplink(org.thethingsnetwork.management.proto.HandlerOuterClass.DryUplinkMessage request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.HandlerOuterClass.DryUplinkResult> responseObserver);

    /**
     * <pre>
     * SimulateUplink simulates an uplink message
     * </pre>
     */
    public void simulateUplink(org.thethingsnetwork.management.proto.HandlerOuterClass.SimulatedUplinkMessage request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver);
  }

  @io.grpc.ExperimentalApi
  public static abstract class AbstractApplicationManager implements ApplicationManager, io.grpc.BindableService {

    @java.lang.Override
    public void registerApplication(org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REGISTER_APPLICATION, responseObserver);
    }

    @java.lang.Override
    public void getApplication(org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.HandlerOuterClass.Application> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_APPLICATION, responseObserver);
    }

    @java.lang.Override
    public void setApplication(org.thethingsnetwork.management.proto.HandlerOuterClass.Application request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_APPLICATION, responseObserver);
    }

    @java.lang.Override
    public void deleteApplication(org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_APPLICATION, responseObserver);
    }

    @java.lang.Override
    public void getDevice(org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceIdentifier request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.HandlerOuterClass.Device> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_DEVICE, responseObserver);
    }

    @java.lang.Override
    public void setDevice(org.thethingsnetwork.management.proto.HandlerOuterClass.Device request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_DEVICE, responseObserver);
    }

    @java.lang.Override
    public void deleteDevice(org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceIdentifier request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_DEVICE, responseObserver);
    }

    @java.lang.Override
    public void getDevicesForApplication(org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_DEVICES_FOR_APPLICATION, responseObserver);
    }

    @java.lang.Override
    public void dryDownlink(org.thethingsnetwork.management.proto.HandlerOuterClass.DryDownlinkMessage request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.HandlerOuterClass.DryDownlinkResult> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DRY_DOWNLINK, responseObserver);
    }

    @java.lang.Override
    public void dryUplink(org.thethingsnetwork.management.proto.HandlerOuterClass.DryUplinkMessage request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.HandlerOuterClass.DryUplinkResult> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DRY_UPLINK, responseObserver);
    }

    @java.lang.Override
    public void simulateUplink(org.thethingsnetwork.management.proto.HandlerOuterClass.SimulatedUplinkMessage request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SIMULATE_UPLINK, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return ApplicationManagerGrpc.bindService(this);
    }
  }

  /**
   * <pre>
   * ApplicationManager manages application and device registrations on the Handler
   * To protect our quality of service, you can make up to 5000 calls to the
   * ApplicationManager API per hour. Once you go over the rate limit, you will
   * receive an error response.
   * </pre>
   */
  public static interface ApplicationManagerBlockingClient {

    /**
     * <pre>
     * Applications should first be registered to the Handler with the `RegisterApplication` method
     * </pre>
     */
    public com.google.protobuf.Empty registerApplication(org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier request);

    /**
     * <pre>
     * GetApplication returns the application with the given identifier (app_id)
     * </pre>
     */
    public org.thethingsnetwork.management.proto.HandlerOuterClass.Application getApplication(org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier request);

    /**
     * <pre>
     * SetApplication updates the settings for the application. All fields must be supplied.
     * </pre>
     */
    public com.google.protobuf.Empty setApplication(org.thethingsnetwork.management.proto.HandlerOuterClass.Application request);

    /**
     * <pre>
     * DeleteApplication deletes the application with the given identifier (app_id)
     * </pre>
     */
    public com.google.protobuf.Empty deleteApplication(org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier request);

    /**
     * <pre>
     * GetDevice returns the device with the given identifier (app_id and dev_id)
     * </pre>
     */
    public org.thethingsnetwork.management.proto.HandlerOuterClass.Device getDevice(org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceIdentifier request);

    /**
     * <pre>
     * SetDevice creates or updates a device. All fields must be supplied.
     * </pre>
     */
    public com.google.protobuf.Empty setDevice(org.thethingsnetwork.management.proto.HandlerOuterClass.Device request);

    /**
     * <pre>
     * DeleteDevice deletes the device with the given identifier (app_id and dev_id)
     * </pre>
     */
    public com.google.protobuf.Empty deleteDevice(org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceIdentifier request);

    /**
     * <pre>
     * GetDevicesForApplication returns all devices that belong to the application with the given identifier (app_id)
     * </pre>
     */
    public org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceList getDevicesForApplication(org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier request);

    /**
     * <pre>
     * DryUplink simulates processing a downlink message and returns the result
     * </pre>
     */
    public org.thethingsnetwork.management.proto.HandlerOuterClass.DryDownlinkResult dryDownlink(org.thethingsnetwork.management.proto.HandlerOuterClass.DryDownlinkMessage request);

    /**
     * <pre>
     * DryUplink simulates processing an uplink message and returns the result
     * </pre>
     */
    public org.thethingsnetwork.management.proto.HandlerOuterClass.DryUplinkResult dryUplink(org.thethingsnetwork.management.proto.HandlerOuterClass.DryUplinkMessage request);

    /**
     * <pre>
     * SimulateUplink simulates an uplink message
     * </pre>
     */
    public com.google.protobuf.Empty simulateUplink(org.thethingsnetwork.management.proto.HandlerOuterClass.SimulatedUplinkMessage request);
  }

  /**
   * <pre>
   * ApplicationManager manages application and device registrations on the Handler
   * To protect our quality of service, you can make up to 5000 calls to the
   * ApplicationManager API per hour. Once you go over the rate limit, you will
   * receive an error response.
   * </pre>
   */
  public static interface ApplicationManagerFutureClient {

    /**
     * <pre>
     * Applications should first be registered to the Handler with the `RegisterApplication` method
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> registerApplication(
        org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier request);

    /**
     * <pre>
     * GetApplication returns the application with the given identifier (app_id)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.HandlerOuterClass.Application> getApplication(
        org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier request);

    /**
     * <pre>
     * SetApplication updates the settings for the application. All fields must be supplied.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> setApplication(
        org.thethingsnetwork.management.proto.HandlerOuterClass.Application request);

    /**
     * <pre>
     * DeleteApplication deletes the application with the given identifier (app_id)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteApplication(
        org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier request);

    /**
     * <pre>
     * GetDevice returns the device with the given identifier (app_id and dev_id)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.HandlerOuterClass.Device> getDevice(
        org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceIdentifier request);

    /**
     * <pre>
     * SetDevice creates or updates a device. All fields must be supplied.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> setDevice(
        org.thethingsnetwork.management.proto.HandlerOuterClass.Device request);

    /**
     * <pre>
     * DeleteDevice deletes the device with the given identifier (app_id and dev_id)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteDevice(
        org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceIdentifier request);

    /**
     * <pre>
     * GetDevicesForApplication returns all devices that belong to the application with the given identifier (app_id)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceList> getDevicesForApplication(
        org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier request);

    /**
     * <pre>
     * DryUplink simulates processing a downlink message and returns the result
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.HandlerOuterClass.DryDownlinkResult> dryDownlink(
        org.thethingsnetwork.management.proto.HandlerOuterClass.DryDownlinkMessage request);

    /**
     * <pre>
     * DryUplink simulates processing an uplink message and returns the result
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.HandlerOuterClass.DryUplinkResult> dryUplink(
        org.thethingsnetwork.management.proto.HandlerOuterClass.DryUplinkMessage request);

    /**
     * <pre>
     * SimulateUplink simulates an uplink message
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> simulateUplink(
        org.thethingsnetwork.management.proto.HandlerOuterClass.SimulatedUplinkMessage request);
  }

  public static class ApplicationManagerStub extends io.grpc.stub.AbstractStub<ApplicationManagerStub>
      implements ApplicationManager {
    private ApplicationManagerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApplicationManagerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApplicationManagerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApplicationManagerStub(channel, callOptions);
    }

    @java.lang.Override
    public void registerApplication(org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REGISTER_APPLICATION, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getApplication(org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.HandlerOuterClass.Application> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_APPLICATION, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void setApplication(org.thethingsnetwork.management.proto.HandlerOuterClass.Application request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_APPLICATION, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void deleteApplication(org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_APPLICATION, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getDevice(org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceIdentifier request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.HandlerOuterClass.Device> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_DEVICE, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void setDevice(org.thethingsnetwork.management.proto.HandlerOuterClass.Device request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_DEVICE, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void deleteDevice(org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceIdentifier request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_DEVICE, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getDevicesForApplication(org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_DEVICES_FOR_APPLICATION, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void dryDownlink(org.thethingsnetwork.management.proto.HandlerOuterClass.DryDownlinkMessage request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.HandlerOuterClass.DryDownlinkResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DRY_DOWNLINK, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void dryUplink(org.thethingsnetwork.management.proto.HandlerOuterClass.DryUplinkMessage request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.HandlerOuterClass.DryUplinkResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DRY_UPLINK, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void simulateUplink(org.thethingsnetwork.management.proto.HandlerOuterClass.SimulatedUplinkMessage request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SIMULATE_UPLINK, getCallOptions()), request, responseObserver);
    }
  }

  public static class ApplicationManagerBlockingStub extends io.grpc.stub.AbstractStub<ApplicationManagerBlockingStub>
      implements ApplicationManagerBlockingClient {
    private ApplicationManagerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApplicationManagerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApplicationManagerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApplicationManagerBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.protobuf.Empty registerApplication(org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REGISTER_APPLICATION, getCallOptions(), request);
    }

    @java.lang.Override
    public org.thethingsnetwork.management.proto.HandlerOuterClass.Application getApplication(org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_APPLICATION, getCallOptions(), request);
    }

    @java.lang.Override
    public com.google.protobuf.Empty setApplication(org.thethingsnetwork.management.proto.HandlerOuterClass.Application request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_APPLICATION, getCallOptions(), request);
    }

    @java.lang.Override
    public com.google.protobuf.Empty deleteApplication(org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_APPLICATION, getCallOptions(), request);
    }

    @java.lang.Override
    public org.thethingsnetwork.management.proto.HandlerOuterClass.Device getDevice(org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceIdentifier request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_DEVICE, getCallOptions(), request);
    }

    @java.lang.Override
    public com.google.protobuf.Empty setDevice(org.thethingsnetwork.management.proto.HandlerOuterClass.Device request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_DEVICE, getCallOptions(), request);
    }

    @java.lang.Override
    public com.google.protobuf.Empty deleteDevice(org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceIdentifier request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_DEVICE, getCallOptions(), request);
    }

    @java.lang.Override
    public org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceList getDevicesForApplication(org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_DEVICES_FOR_APPLICATION, getCallOptions(), request);
    }

    @java.lang.Override
    public org.thethingsnetwork.management.proto.HandlerOuterClass.DryDownlinkResult dryDownlink(org.thethingsnetwork.management.proto.HandlerOuterClass.DryDownlinkMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DRY_DOWNLINK, getCallOptions(), request);
    }

    @java.lang.Override
    public org.thethingsnetwork.management.proto.HandlerOuterClass.DryUplinkResult dryUplink(org.thethingsnetwork.management.proto.HandlerOuterClass.DryUplinkMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DRY_UPLINK, getCallOptions(), request);
    }

    @java.lang.Override
    public com.google.protobuf.Empty simulateUplink(org.thethingsnetwork.management.proto.HandlerOuterClass.SimulatedUplinkMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SIMULATE_UPLINK, getCallOptions(), request);
    }
  }

  public static class ApplicationManagerFutureStub extends io.grpc.stub.AbstractStub<ApplicationManagerFutureStub>
      implements ApplicationManagerFutureClient {
    private ApplicationManagerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApplicationManagerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApplicationManagerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApplicationManagerFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> registerApplication(
        org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REGISTER_APPLICATION, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.HandlerOuterClass.Application> getApplication(
        org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_APPLICATION, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> setApplication(
        org.thethingsnetwork.management.proto.HandlerOuterClass.Application request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_APPLICATION, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteApplication(
        org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_APPLICATION, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.HandlerOuterClass.Device> getDevice(
        org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceIdentifier request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_DEVICE, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> setDevice(
        org.thethingsnetwork.management.proto.HandlerOuterClass.Device request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_DEVICE, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteDevice(
        org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceIdentifier request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_DEVICE, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceList> getDevicesForApplication(
        org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_DEVICES_FOR_APPLICATION, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.HandlerOuterClass.DryDownlinkResult> dryDownlink(
        org.thethingsnetwork.management.proto.HandlerOuterClass.DryDownlinkMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DRY_DOWNLINK, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.HandlerOuterClass.DryUplinkResult> dryUplink(
        org.thethingsnetwork.management.proto.HandlerOuterClass.DryUplinkMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DRY_UPLINK, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> simulateUplink(
        org.thethingsnetwork.management.proto.HandlerOuterClass.SimulatedUplinkMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SIMULATE_UPLINK, getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_APPLICATION = 0;
  private static final int METHODID_GET_APPLICATION = 1;
  private static final int METHODID_SET_APPLICATION = 2;
  private static final int METHODID_DELETE_APPLICATION = 3;
  private static final int METHODID_GET_DEVICE = 4;
  private static final int METHODID_SET_DEVICE = 5;
  private static final int METHODID_DELETE_DEVICE = 6;
  private static final int METHODID_GET_DEVICES_FOR_APPLICATION = 7;
  private static final int METHODID_DRY_DOWNLINK = 8;
  private static final int METHODID_DRY_UPLINK = 9;
  private static final int METHODID_SIMULATE_UPLINK = 10;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ApplicationManager serviceImpl;
    private final int methodId;

    public MethodHandlers(ApplicationManager serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_APPLICATION:
          serviceImpl.registerApplication((org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_APPLICATION:
          serviceImpl.getApplication((org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.HandlerOuterClass.Application>) responseObserver);
          break;
        case METHODID_SET_APPLICATION:
          serviceImpl.setApplication((org.thethingsnetwork.management.proto.HandlerOuterClass.Application) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_APPLICATION:
          serviceImpl.deleteApplication((org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_DEVICE:
          serviceImpl.getDevice((org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceIdentifier) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.HandlerOuterClass.Device>) responseObserver);
          break;
        case METHODID_SET_DEVICE:
          serviceImpl.setDevice((org.thethingsnetwork.management.proto.HandlerOuterClass.Device) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_DEVICE:
          serviceImpl.deleteDevice((org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceIdentifier) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_DEVICES_FOR_APPLICATION:
          serviceImpl.getDevicesForApplication((org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceList>) responseObserver);
          break;
        case METHODID_DRY_DOWNLINK:
          serviceImpl.dryDownlink((org.thethingsnetwork.management.proto.HandlerOuterClass.DryDownlinkMessage) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.HandlerOuterClass.DryDownlinkResult>) responseObserver);
          break;
        case METHODID_DRY_UPLINK:
          serviceImpl.dryUplink((org.thethingsnetwork.management.proto.HandlerOuterClass.DryUplinkMessage) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.HandlerOuterClass.DryUplinkResult>) responseObserver);
          break;
        case METHODID_SIMULATE_UPLINK:
          serviceImpl.simulateUplink((org.thethingsnetwork.management.proto.HandlerOuterClass.SimulatedUplinkMessage) request,
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
      final ApplicationManager serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_REGISTER_APPLICATION,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier,
              com.google.protobuf.Empty>(
                serviceImpl, METHODID_REGISTER_APPLICATION)))
        .addMethod(
          METHOD_GET_APPLICATION,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier,
              org.thethingsnetwork.management.proto.HandlerOuterClass.Application>(
                serviceImpl, METHODID_GET_APPLICATION)))
        .addMethod(
          METHOD_SET_APPLICATION,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.HandlerOuterClass.Application,
              com.google.protobuf.Empty>(
                serviceImpl, METHODID_SET_APPLICATION)))
        .addMethod(
          METHOD_DELETE_APPLICATION,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier,
              com.google.protobuf.Empty>(
                serviceImpl, METHODID_DELETE_APPLICATION)))
        .addMethod(
          METHOD_GET_DEVICE,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceIdentifier,
              org.thethingsnetwork.management.proto.HandlerOuterClass.Device>(
                serviceImpl, METHODID_GET_DEVICE)))
        .addMethod(
          METHOD_SET_DEVICE,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.HandlerOuterClass.Device,
              com.google.protobuf.Empty>(
                serviceImpl, METHODID_SET_DEVICE)))
        .addMethod(
          METHOD_DELETE_DEVICE,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceIdentifier,
              com.google.protobuf.Empty>(
                serviceImpl, METHODID_DELETE_DEVICE)))
        .addMethod(
          METHOD_GET_DEVICES_FOR_APPLICATION,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.HandlerOuterClass.ApplicationIdentifier,
              org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceList>(
                serviceImpl, METHODID_GET_DEVICES_FOR_APPLICATION)))
        .addMethod(
          METHOD_DRY_DOWNLINK,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.HandlerOuterClass.DryDownlinkMessage,
              org.thethingsnetwork.management.proto.HandlerOuterClass.DryDownlinkResult>(
                serviceImpl, METHODID_DRY_DOWNLINK)))
        .addMethod(
          METHOD_DRY_UPLINK,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.HandlerOuterClass.DryUplinkMessage,
              org.thethingsnetwork.management.proto.HandlerOuterClass.DryUplinkResult>(
                serviceImpl, METHODID_DRY_UPLINK)))
        .addMethod(
          METHOD_SIMULATE_UPLINK,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.HandlerOuterClass.SimulatedUplinkMessage,
              com.google.protobuf.Empty>(
                serviceImpl, METHODID_SIMULATE_UPLINK)))
        .build();
  }
}
