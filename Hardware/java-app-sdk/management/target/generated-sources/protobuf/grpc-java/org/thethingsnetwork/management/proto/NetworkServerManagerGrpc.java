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
 * The NetworkServerManager service provides configuration and monitoring
 * functionality
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.14.0)",
    comments = "Source: ttn/api/networkserver/networkserver.proto")
public class NetworkServerManagerGrpc {

  private NetworkServerManagerGrpc() {}

  public static final String SERVICE_NAME = "networkserver.NetworkServerManager";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.Networkserver.StatusRequest,
      org.thethingsnetwork.management.proto.Networkserver.Status> METHOD_GET_STATUS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "networkserver.NetworkServerManager", "GetStatus"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.Networkserver.StatusRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.Networkserver.Status.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NetworkServerManagerStub newStub(io.grpc.Channel channel) {
    return new NetworkServerManagerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NetworkServerManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NetworkServerManagerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static NetworkServerManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NetworkServerManagerFutureStub(channel);
  }

  /**
   * <pre>
   * The NetworkServerManager service provides configuration and monitoring
   * functionality
   * </pre>
   */
  public static interface NetworkServerManager {

    /**
     */
    public void getStatus(org.thethingsnetwork.management.proto.Networkserver.StatusRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.Networkserver.Status> responseObserver);
  }

  @io.grpc.ExperimentalApi
  public static abstract class AbstractNetworkServerManager implements NetworkServerManager, io.grpc.BindableService {

    @java.lang.Override
    public void getStatus(org.thethingsnetwork.management.proto.Networkserver.StatusRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.Networkserver.Status> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_STATUS, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return NetworkServerManagerGrpc.bindService(this);
    }
  }

  /**
   * <pre>
   * The NetworkServerManager service provides configuration and monitoring
   * functionality
   * </pre>
   */
  public static interface NetworkServerManagerBlockingClient {

    /**
     */
    public org.thethingsnetwork.management.proto.Networkserver.Status getStatus(org.thethingsnetwork.management.proto.Networkserver.StatusRequest request);
  }

  /**
   * <pre>
   * The NetworkServerManager service provides configuration and monitoring
   * functionality
   * </pre>
   */
  public static interface NetworkServerManagerFutureClient {

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.Networkserver.Status> getStatus(
        org.thethingsnetwork.management.proto.Networkserver.StatusRequest request);
  }

  public static class NetworkServerManagerStub extends io.grpc.stub.AbstractStub<NetworkServerManagerStub>
      implements NetworkServerManager {
    private NetworkServerManagerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NetworkServerManagerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkServerManagerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NetworkServerManagerStub(channel, callOptions);
    }

    @java.lang.Override
    public void getStatus(org.thethingsnetwork.management.proto.Networkserver.StatusRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.Networkserver.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_STATUS, getCallOptions()), request, responseObserver);
    }
  }

  public static class NetworkServerManagerBlockingStub extends io.grpc.stub.AbstractStub<NetworkServerManagerBlockingStub>
      implements NetworkServerManagerBlockingClient {
    private NetworkServerManagerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NetworkServerManagerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkServerManagerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NetworkServerManagerBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public org.thethingsnetwork.management.proto.Networkserver.Status getStatus(org.thethingsnetwork.management.proto.Networkserver.StatusRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_STATUS, getCallOptions(), request);
    }
  }

  public static class NetworkServerManagerFutureStub extends io.grpc.stub.AbstractStub<NetworkServerManagerFutureStub>
      implements NetworkServerManagerFutureClient {
    private NetworkServerManagerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NetworkServerManagerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkServerManagerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NetworkServerManagerFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.Networkserver.Status> getStatus(
        org.thethingsnetwork.management.proto.Networkserver.StatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_STATUS, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STATUS = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NetworkServerManager serviceImpl;
    private final int methodId;

    public MethodHandlers(NetworkServerManager serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STATUS:
          serviceImpl.getStatus((org.thethingsnetwork.management.proto.Networkserver.StatusRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.Networkserver.Status>) responseObserver);
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
      final NetworkServerManager serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_GET_STATUS,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.Networkserver.StatusRequest,
              org.thethingsnetwork.management.proto.Networkserver.Status>(
                serviceImpl, METHODID_GET_STATUS)))
        .build();
  }
}
