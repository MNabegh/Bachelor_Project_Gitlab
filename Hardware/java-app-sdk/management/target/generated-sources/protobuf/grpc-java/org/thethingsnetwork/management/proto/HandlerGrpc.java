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
 * The Handler service provides pure network functionality
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.14.0)",
    comments = "Source: ttn/api/handler/handler.proto")
public class HandlerGrpc {

  private HandlerGrpc() {}

  public static final String SERVICE_NAME = "handler.Handler";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.BrokerOuterClass.ActivationChallengeRequest,
      org.thethingsnetwork.management.proto.BrokerOuterClass.ActivationChallengeResponse> METHOD_ACTIVATION_CHALLENGE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "handler.Handler", "ActivationChallenge"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.BrokerOuterClass.ActivationChallengeRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.BrokerOuterClass.ActivationChallengeResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedDeviceActivationRequest,
      org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceActivationResponse> METHOD_ACTIVATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "handler.Handler", "Activate"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedDeviceActivationRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceActivationResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HandlerStub newStub(io.grpc.Channel channel) {
    return new HandlerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HandlerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HandlerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static HandlerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HandlerFutureStub(channel);
  }

  /**
   * <pre>
   * The Handler service provides pure network functionality
   * </pre>
   */
  public static interface Handler {

    /**
     */
    public void activationChallenge(org.thethingsnetwork.management.proto.BrokerOuterClass.ActivationChallengeRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.ActivationChallengeResponse> responseObserver);

    /**
     */
    public void activate(org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedDeviceActivationRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceActivationResponse> responseObserver);
  }

  @io.grpc.ExperimentalApi
  public static abstract class AbstractHandler implements Handler, io.grpc.BindableService {

    @java.lang.Override
    public void activationChallenge(org.thethingsnetwork.management.proto.BrokerOuterClass.ActivationChallengeRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.ActivationChallengeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ACTIVATION_CHALLENGE, responseObserver);
    }

    @java.lang.Override
    public void activate(org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedDeviceActivationRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceActivationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ACTIVATE, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return HandlerGrpc.bindService(this);
    }
  }

  /**
   * <pre>
   * The Handler service provides pure network functionality
   * </pre>
   */
  public static interface HandlerBlockingClient {

    /**
     */
    public org.thethingsnetwork.management.proto.BrokerOuterClass.ActivationChallengeResponse activationChallenge(org.thethingsnetwork.management.proto.BrokerOuterClass.ActivationChallengeRequest request);

    /**
     */
    public org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceActivationResponse activate(org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedDeviceActivationRequest request);
  }

  /**
   * <pre>
   * The Handler service provides pure network functionality
   * </pre>
   */
  public static interface HandlerFutureClient {

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.BrokerOuterClass.ActivationChallengeResponse> activationChallenge(
        org.thethingsnetwork.management.proto.BrokerOuterClass.ActivationChallengeRequest request);

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceActivationResponse> activate(
        org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedDeviceActivationRequest request);
  }

  public static class HandlerStub extends io.grpc.stub.AbstractStub<HandlerStub>
      implements Handler {
    private HandlerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HandlerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HandlerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HandlerStub(channel, callOptions);
    }

    @java.lang.Override
    public void activationChallenge(org.thethingsnetwork.management.proto.BrokerOuterClass.ActivationChallengeRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.ActivationChallengeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ACTIVATION_CHALLENGE, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void activate(org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedDeviceActivationRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceActivationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ACTIVATE, getCallOptions()), request, responseObserver);
    }
  }

  public static class HandlerBlockingStub extends io.grpc.stub.AbstractStub<HandlerBlockingStub>
      implements HandlerBlockingClient {
    private HandlerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HandlerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HandlerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HandlerBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public org.thethingsnetwork.management.proto.BrokerOuterClass.ActivationChallengeResponse activationChallenge(org.thethingsnetwork.management.proto.BrokerOuterClass.ActivationChallengeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ACTIVATION_CHALLENGE, getCallOptions(), request);
    }

    @java.lang.Override
    public org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceActivationResponse activate(org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedDeviceActivationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ACTIVATE, getCallOptions(), request);
    }
  }

  public static class HandlerFutureStub extends io.grpc.stub.AbstractStub<HandlerFutureStub>
      implements HandlerFutureClient {
    private HandlerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HandlerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HandlerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HandlerFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.BrokerOuterClass.ActivationChallengeResponse> activationChallenge(
        org.thethingsnetwork.management.proto.BrokerOuterClass.ActivationChallengeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ACTIVATION_CHALLENGE, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceActivationResponse> activate(
        org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedDeviceActivationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ACTIVATE, getCallOptions()), request);
    }
  }

  private static final int METHODID_ACTIVATION_CHALLENGE = 0;
  private static final int METHODID_ACTIVATE = 1;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Handler serviceImpl;
    private final int methodId;

    public MethodHandlers(Handler serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ACTIVATION_CHALLENGE:
          serviceImpl.activationChallenge((org.thethingsnetwork.management.proto.BrokerOuterClass.ActivationChallengeRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.BrokerOuterClass.ActivationChallengeResponse>) responseObserver);
          break;
        case METHODID_ACTIVATE:
          serviceImpl.activate((org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedDeviceActivationRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceActivationResponse>) responseObserver);
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
      final Handler serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_ACTIVATION_CHALLENGE,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.BrokerOuterClass.ActivationChallengeRequest,
              org.thethingsnetwork.management.proto.BrokerOuterClass.ActivationChallengeResponse>(
                serviceImpl, METHODID_ACTIVATION_CHALLENGE)))
        .addMethod(
          METHOD_ACTIVATE,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.BrokerOuterClass.DeduplicatedDeviceActivationRequest,
              org.thethingsnetwork.management.proto.HandlerOuterClass.DeviceActivationResponse>(
                serviceImpl, METHODID_ACTIVATE)))
        .build();
  }
}
