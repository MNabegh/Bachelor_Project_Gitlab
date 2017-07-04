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
 * The DiscoveryManager service provides configuration and monitoring functionality
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.14.0)",
    comments = "Source: ttn/api/discovery/discovery.proto")
public class DiscoveryManagerGrpc {

  private DiscoveryManagerGrpc() {}

  public static final String SERVICE_NAME = "discovery.DiscoveryManager";

  // Static method descriptors that strictly reflect the proto.

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DiscoveryManagerStub newStub(io.grpc.Channel channel) {
    return new DiscoveryManagerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DiscoveryManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DiscoveryManagerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static DiscoveryManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DiscoveryManagerFutureStub(channel);
  }

  /**
   * <pre>
   * The DiscoveryManager service provides configuration and monitoring functionality
   * </pre>
   */
  public static interface DiscoveryManager {
  }

  @io.grpc.ExperimentalApi
  public static abstract class AbstractDiscoveryManager implements DiscoveryManager, io.grpc.BindableService {

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return DiscoveryManagerGrpc.bindService(this);
    }
  }

  /**
   * <pre>
   * The DiscoveryManager service provides configuration and monitoring functionality
   * </pre>
   */
  public static interface DiscoveryManagerBlockingClient {
  }

  /**
   * <pre>
   * The DiscoveryManager service provides configuration and monitoring functionality
   * </pre>
   */
  public static interface DiscoveryManagerFutureClient {
  }

  public static class DiscoveryManagerStub extends io.grpc.stub.AbstractStub<DiscoveryManagerStub>
      implements DiscoveryManager {
    private DiscoveryManagerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DiscoveryManagerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiscoveryManagerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DiscoveryManagerStub(channel, callOptions);
    }
  }

  public static class DiscoveryManagerBlockingStub extends io.grpc.stub.AbstractStub<DiscoveryManagerBlockingStub>
      implements DiscoveryManagerBlockingClient {
    private DiscoveryManagerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DiscoveryManagerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiscoveryManagerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DiscoveryManagerBlockingStub(channel, callOptions);
    }
  }

  public static class DiscoveryManagerFutureStub extends io.grpc.stub.AbstractStub<DiscoveryManagerFutureStub>
      implements DiscoveryManagerFutureClient {
    private DiscoveryManagerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DiscoveryManagerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiscoveryManagerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DiscoveryManagerFutureStub(channel, callOptions);
    }
  }


  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DiscoveryManager serviceImpl;
    private final int methodId;

    public MethodHandlers(DiscoveryManager serviceImpl, int methodId) {
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final DiscoveryManager serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .build();
  }
}
