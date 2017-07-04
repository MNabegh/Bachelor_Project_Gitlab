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
    comments = "Source: ttn/api/monitor/monitor.proto")
public class MonitorGrpc {

  private MonitorGrpc() {}

  public static final String SERVICE_NAME = "monitor.Monitor";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.RouterOuterClass.Status,
      com.google.protobuf.Empty> METHOD_ROUTER_STATUS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING,
          generateFullMethodName(
              "monitor.Monitor", "RouterStatus"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.RouterOuterClass.Status.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.Gateway.Status,
      com.google.protobuf.Empty> METHOD_GATEWAY_STATUS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING,
          generateFullMethodName(
              "monitor.Monitor", "GatewayStatus"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.Gateway.Status.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.RouterOuterClass.UplinkMessage,
      com.google.protobuf.Empty> METHOD_GATEWAY_UPLINK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING,
          generateFullMethodName(
              "monitor.Monitor", "GatewayUplink"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.RouterOuterClass.UplinkMessage.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.RouterOuterClass.DownlinkMessage,
      com.google.protobuf.Empty> METHOD_GATEWAY_DOWNLINK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING,
          generateFullMethodName(
              "monitor.Monitor", "GatewayDownlink"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.RouterOuterClass.DownlinkMessage.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.BrokerOuterClass.Status,
      com.google.protobuf.Empty> METHOD_BROKER_STATUS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING,
          generateFullMethodName(
              "monitor.Monitor", "BrokerStatus"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.BrokerOuterClass.Status.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage,
      com.google.protobuf.Empty> METHOD_BROKER_UPLINK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING,
          generateFullMethodName(
              "monitor.Monitor", "BrokerUplink"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage,
      com.google.protobuf.Empty> METHOD_BROKER_DOWNLINK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING,
          generateFullMethodName(
              "monitor.Monitor", "BrokerDownlink"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.HandlerOuterClass.Status,
      com.google.protobuf.Empty> METHOD_HANDLER_STATUS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING,
          generateFullMethodName(
              "monitor.Monitor", "HandlerStatus"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.HandlerOuterClass.Status.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage,
      com.google.protobuf.Empty> METHOD_HANDLER_UPLINK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING,
          generateFullMethodName(
              "monitor.Monitor", "HandlerUplink"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage,
      com.google.protobuf.Empty> METHOD_HANDLER_DOWNLINK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING,
          generateFullMethodName(
              "monitor.Monitor", "HandlerDownlink"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.Networkserver.Status,
      com.google.protobuf.Empty> METHOD_NETWORK_SERVER_STATUS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING,
          generateFullMethodName(
              "monitor.Monitor", "NetworkServerStatus"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.Networkserver.Status.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MonitorStub newStub(io.grpc.Channel channel) {
    return new MonitorStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MonitorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MonitorBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static MonitorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MonitorFutureStub(channel);
  }

  /**
   */
  public static interface Monitor {

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.RouterOuterClass.Status> routerStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver);

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.Gateway.Status> gatewayStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver);

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.RouterOuterClass.UplinkMessage> gatewayUplink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver);

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.RouterOuterClass.DownlinkMessage> gatewayDownlink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver);

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.Status> brokerStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver);

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage> brokerUplink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver);

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage> brokerDownlink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver);

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.HandlerOuterClass.Status> handlerStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver);

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage> handlerUplink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver);

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage> handlerDownlink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver);

    /**
     */
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.Networkserver.Status> networkServerStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver);
  }

  @io.grpc.ExperimentalApi
  public static abstract class AbstractMonitor implements Monitor, io.grpc.BindableService {

    @java.lang.Override
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.RouterOuterClass.Status> routerStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_ROUTER_STATUS, responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.Gateway.Status> gatewayStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_GATEWAY_STATUS, responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.RouterOuterClass.UplinkMessage> gatewayUplink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_GATEWAY_UPLINK, responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.RouterOuterClass.DownlinkMessage> gatewayDownlink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_GATEWAY_DOWNLINK, responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.Status> brokerStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_BROKER_STATUS, responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage> brokerUplink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_BROKER_UPLINK, responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage> brokerDownlink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_BROKER_DOWNLINK, responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.HandlerOuterClass.Status> handlerStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_HANDLER_STATUS, responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage> handlerUplink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_HANDLER_UPLINK, responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage> handlerDownlink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_HANDLER_DOWNLINK, responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.Networkserver.Status> networkServerStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_NETWORK_SERVER_STATUS, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return MonitorGrpc.bindService(this);
    }
  }

  /**
   */
  public static interface MonitorBlockingClient {
  }

  /**
   */
  public static interface MonitorFutureClient {
  }

  public static class MonitorStub extends io.grpc.stub.AbstractStub<MonitorStub>
      implements Monitor {
    private MonitorStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MonitorStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MonitorStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MonitorStub(channel, callOptions);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.RouterOuterClass.Status> routerStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_ROUTER_STATUS, getCallOptions()), responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.Gateway.Status> gatewayStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_GATEWAY_STATUS, getCallOptions()), responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.RouterOuterClass.UplinkMessage> gatewayUplink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_GATEWAY_UPLINK, getCallOptions()), responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.RouterOuterClass.DownlinkMessage> gatewayDownlink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_GATEWAY_DOWNLINK, getCallOptions()), responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.Status> brokerStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_BROKER_STATUS, getCallOptions()), responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage> brokerUplink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_BROKER_UPLINK, getCallOptions()), responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage> brokerDownlink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_BROKER_DOWNLINK, getCallOptions()), responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.HandlerOuterClass.Status> handlerStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_HANDLER_STATUS, getCallOptions()), responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage> handlerUplink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_HANDLER_UPLINK, getCallOptions()), responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage> handlerDownlink(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_HANDLER_DOWNLINK, getCallOptions()), responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.Networkserver.Status> networkServerStatus(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_NETWORK_SERVER_STATUS, getCallOptions()), responseObserver);
    }
  }

  public static class MonitorBlockingStub extends io.grpc.stub.AbstractStub<MonitorBlockingStub>
      implements MonitorBlockingClient {
    private MonitorBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MonitorBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MonitorBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MonitorBlockingStub(channel, callOptions);
    }
  }

  public static class MonitorFutureStub extends io.grpc.stub.AbstractStub<MonitorFutureStub>
      implements MonitorFutureClient {
    private MonitorFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MonitorFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MonitorFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MonitorFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_ROUTER_STATUS = 0;
  private static final int METHODID_GATEWAY_STATUS = 1;
  private static final int METHODID_GATEWAY_UPLINK = 2;
  private static final int METHODID_GATEWAY_DOWNLINK = 3;
  private static final int METHODID_BROKER_STATUS = 4;
  private static final int METHODID_BROKER_UPLINK = 5;
  private static final int METHODID_BROKER_DOWNLINK = 6;
  private static final int METHODID_HANDLER_STATUS = 7;
  private static final int METHODID_HANDLER_UPLINK = 8;
  private static final int METHODID_HANDLER_DOWNLINK = 9;
  private static final int METHODID_NETWORK_SERVER_STATUS = 10;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Monitor serviceImpl;
    private final int methodId;

    public MethodHandlers(Monitor serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ROUTER_STATUS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.routerStatus(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        case METHODID_GATEWAY_STATUS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.gatewayStatus(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        case METHODID_GATEWAY_UPLINK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.gatewayUplink(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        case METHODID_GATEWAY_DOWNLINK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.gatewayDownlink(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        case METHODID_BROKER_STATUS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.brokerStatus(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        case METHODID_BROKER_UPLINK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.brokerUplink(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        case METHODID_BROKER_DOWNLINK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.brokerDownlink(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        case METHODID_HANDLER_STATUS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.handlerStatus(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        case METHODID_HANDLER_UPLINK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.handlerUplink(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        case METHODID_HANDLER_DOWNLINK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.handlerDownlink(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        case METHODID_NETWORK_SERVER_STATUS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.networkServerStatus(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final Monitor serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_ROUTER_STATUS,
          asyncClientStreamingCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.RouterOuterClass.Status,
              com.google.protobuf.Empty>(
                serviceImpl, METHODID_ROUTER_STATUS)))
        .addMethod(
          METHOD_GATEWAY_STATUS,
          asyncClientStreamingCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.Gateway.Status,
              com.google.protobuf.Empty>(
                serviceImpl, METHODID_GATEWAY_STATUS)))
        .addMethod(
          METHOD_GATEWAY_UPLINK,
          asyncClientStreamingCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.RouterOuterClass.UplinkMessage,
              com.google.protobuf.Empty>(
                serviceImpl, METHODID_GATEWAY_UPLINK)))
        .addMethod(
          METHOD_GATEWAY_DOWNLINK,
          asyncClientStreamingCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.RouterOuterClass.DownlinkMessage,
              com.google.protobuf.Empty>(
                serviceImpl, METHODID_GATEWAY_DOWNLINK)))
        .addMethod(
          METHOD_BROKER_STATUS,
          asyncClientStreamingCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.BrokerOuterClass.Status,
              com.google.protobuf.Empty>(
                serviceImpl, METHODID_BROKER_STATUS)))
        .addMethod(
          METHOD_BROKER_UPLINK,
          asyncClientStreamingCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage,
              com.google.protobuf.Empty>(
                serviceImpl, METHODID_BROKER_UPLINK)))
        .addMethod(
          METHOD_BROKER_DOWNLINK,
          asyncClientStreamingCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage,
              com.google.protobuf.Empty>(
                serviceImpl, METHODID_BROKER_DOWNLINK)))
        .addMethod(
          METHOD_HANDLER_STATUS,
          asyncClientStreamingCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.HandlerOuterClass.Status,
              com.google.protobuf.Empty>(
                serviceImpl, METHODID_HANDLER_STATUS)))
        .addMethod(
          METHOD_HANDLER_UPLINK,
          asyncClientStreamingCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedUplinkMessage,
              com.google.protobuf.Empty>(
                serviceImpl, METHODID_HANDLER_UPLINK)))
        .addMethod(
          METHOD_HANDLER_DOWNLINK,
          asyncClientStreamingCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.BrokerOuterClass.DownlinkMessage,
              com.google.protobuf.Empty>(
                serviceImpl, METHODID_HANDLER_DOWNLINK)))
        .addMethod(
          METHOD_NETWORK_SERVER_STATUS,
          asyncClientStreamingCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.Networkserver.Status,
              com.google.protobuf.Empty>(
                serviceImpl, METHODID_NETWORK_SERVER_STATUS)))
        .build();
  }
}
