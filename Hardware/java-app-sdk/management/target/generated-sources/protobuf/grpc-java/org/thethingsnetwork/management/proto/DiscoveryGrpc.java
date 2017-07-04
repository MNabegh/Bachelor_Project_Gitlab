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
 * The Discovery service is used to discover services within The Things Network.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.14.0)",
    comments = "Source: ttn/api/discovery/discovery.proto")
public class DiscoveryGrpc {

  private DiscoveryGrpc() {}

  public static final String SERVICE_NAME = "discovery.Discovery";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.DiscoveryOuterClass.Announcement,
      com.google.protobuf.Empty> METHOD_ANNOUNCE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "discovery.Discovery", "Announce"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.DiscoveryOuterClass.Announcement.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.DiscoveryOuterClass.GetServiceRequest,
      org.thethingsnetwork.management.proto.DiscoveryOuterClass.AnnouncementsResponse> METHOD_GET_ALL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "discovery.Discovery", "GetAll"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.DiscoveryOuterClass.GetServiceRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.DiscoveryOuterClass.AnnouncementsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.DiscoveryOuterClass.GetRequest,
      org.thethingsnetwork.management.proto.DiscoveryOuterClass.Announcement> METHOD_GET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "discovery.Discovery", "Get"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.DiscoveryOuterClass.GetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.DiscoveryOuterClass.Announcement.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.DiscoveryOuterClass.MetadataRequest,
      com.google.protobuf.Empty> METHOD_ADD_METADATA =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "discovery.Discovery", "AddMetadata"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.DiscoveryOuterClass.MetadataRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.thethingsnetwork.management.proto.DiscoveryOuterClass.MetadataRequest,
      com.google.protobuf.Empty> METHOD_DELETE_METADATA =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "discovery.Discovery", "DeleteMetadata"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.thethingsnetwork.management.proto.DiscoveryOuterClass.MetadataRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DiscoveryStub newStub(io.grpc.Channel channel) {
    return new DiscoveryStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DiscoveryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DiscoveryBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static DiscoveryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DiscoveryFutureStub(channel);
  }

  /**
   * <pre>
   * The Discovery service is used to discover services within The Things Network.
   * </pre>
   */
  public static interface Discovery {

    /**
     * <pre>
     * Announce a component to the Discovery server.
     * A call to `Announce` does not processes the `metadata` field, so you can safely leave this field empty.
     * Adding or removing Metadata should be done with the `AddMetadata` and `DeleteMetadata` methods.
     * </pre>
     */
    public void announce(org.thethingsnetwork.management.proto.DiscoveryOuterClass.Announcement request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver);

    /**
     * <pre>
     * Get all announcements for a specific service type
     * </pre>
     */
    public void getAll(org.thethingsnetwork.management.proto.DiscoveryOuterClass.GetServiceRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.DiscoveryOuterClass.AnnouncementsResponse> responseObserver);

    /**
     * <pre>
     * Get a specific announcement
     * </pre>
     */
    public void get(org.thethingsnetwork.management.proto.DiscoveryOuterClass.GetRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.DiscoveryOuterClass.Announcement> responseObserver);

    /**
     * <pre>
     * Add metadata to an announement
     * </pre>
     */
    public void addMetadata(org.thethingsnetwork.management.proto.DiscoveryOuterClass.MetadataRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver);

    /**
     * <pre>
     * Delete metadata from an announcement
     * </pre>
     */
    public void deleteMetadata(org.thethingsnetwork.management.proto.DiscoveryOuterClass.MetadataRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver);
  }

  @io.grpc.ExperimentalApi
  public static abstract class AbstractDiscovery implements Discovery, io.grpc.BindableService {

    @java.lang.Override
    public void announce(org.thethingsnetwork.management.proto.DiscoveryOuterClass.Announcement request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ANNOUNCE, responseObserver);
    }

    @java.lang.Override
    public void getAll(org.thethingsnetwork.management.proto.DiscoveryOuterClass.GetServiceRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.DiscoveryOuterClass.AnnouncementsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL, responseObserver);
    }

    @java.lang.Override
    public void get(org.thethingsnetwork.management.proto.DiscoveryOuterClass.GetRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.DiscoveryOuterClass.Announcement> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET, responseObserver);
    }

    @java.lang.Override
    public void addMetadata(org.thethingsnetwork.management.proto.DiscoveryOuterClass.MetadataRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD_METADATA, responseObserver);
    }

    @java.lang.Override
    public void deleteMetadata(org.thethingsnetwork.management.proto.DiscoveryOuterClass.MetadataRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_METADATA, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return DiscoveryGrpc.bindService(this);
    }
  }

  /**
   * <pre>
   * The Discovery service is used to discover services within The Things Network.
   * </pre>
   */
  public static interface DiscoveryBlockingClient {

    /**
     * <pre>
     * Announce a component to the Discovery server.
     * A call to `Announce` does not processes the `metadata` field, so you can safely leave this field empty.
     * Adding or removing Metadata should be done with the `AddMetadata` and `DeleteMetadata` methods.
     * </pre>
     */
    public com.google.protobuf.Empty announce(org.thethingsnetwork.management.proto.DiscoveryOuterClass.Announcement request);

    /**
     * <pre>
     * Get all announcements for a specific service type
     * </pre>
     */
    public org.thethingsnetwork.management.proto.DiscoveryOuterClass.AnnouncementsResponse getAll(org.thethingsnetwork.management.proto.DiscoveryOuterClass.GetServiceRequest request);

    /**
     * <pre>
     * Get a specific announcement
     * </pre>
     */
    public org.thethingsnetwork.management.proto.DiscoveryOuterClass.Announcement get(org.thethingsnetwork.management.proto.DiscoveryOuterClass.GetRequest request);

    /**
     * <pre>
     * Add metadata to an announement
     * </pre>
     */
    public com.google.protobuf.Empty addMetadata(org.thethingsnetwork.management.proto.DiscoveryOuterClass.MetadataRequest request);

    /**
     * <pre>
     * Delete metadata from an announcement
     * </pre>
     */
    public com.google.protobuf.Empty deleteMetadata(org.thethingsnetwork.management.proto.DiscoveryOuterClass.MetadataRequest request);
  }

  /**
   * <pre>
   * The Discovery service is used to discover services within The Things Network.
   * </pre>
   */
  public static interface DiscoveryFutureClient {

    /**
     * <pre>
     * Announce a component to the Discovery server.
     * A call to `Announce` does not processes the `metadata` field, so you can safely leave this field empty.
     * Adding or removing Metadata should be done with the `AddMetadata` and `DeleteMetadata` methods.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> announce(
        org.thethingsnetwork.management.proto.DiscoveryOuterClass.Announcement request);

    /**
     * <pre>
     * Get all announcements for a specific service type
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.DiscoveryOuterClass.AnnouncementsResponse> getAll(
        org.thethingsnetwork.management.proto.DiscoveryOuterClass.GetServiceRequest request);

    /**
     * <pre>
     * Get a specific announcement
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.DiscoveryOuterClass.Announcement> get(
        org.thethingsnetwork.management.proto.DiscoveryOuterClass.GetRequest request);

    /**
     * <pre>
     * Add metadata to an announement
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> addMetadata(
        org.thethingsnetwork.management.proto.DiscoveryOuterClass.MetadataRequest request);

    /**
     * <pre>
     * Delete metadata from an announcement
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteMetadata(
        org.thethingsnetwork.management.proto.DiscoveryOuterClass.MetadataRequest request);
  }

  public static class DiscoveryStub extends io.grpc.stub.AbstractStub<DiscoveryStub>
      implements Discovery {
    private DiscoveryStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DiscoveryStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiscoveryStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DiscoveryStub(channel, callOptions);
    }

    @java.lang.Override
    public void announce(org.thethingsnetwork.management.proto.DiscoveryOuterClass.Announcement request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ANNOUNCE, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getAll(org.thethingsnetwork.management.proto.DiscoveryOuterClass.GetServiceRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.DiscoveryOuterClass.AnnouncementsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ALL, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void get(org.thethingsnetwork.management.proto.DiscoveryOuterClass.GetRequest request,
        io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.DiscoveryOuterClass.Announcement> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void addMetadata(org.thethingsnetwork.management.proto.DiscoveryOuterClass.MetadataRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD_METADATA, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void deleteMetadata(org.thethingsnetwork.management.proto.DiscoveryOuterClass.MetadataRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_METADATA, getCallOptions()), request, responseObserver);
    }
  }

  public static class DiscoveryBlockingStub extends io.grpc.stub.AbstractStub<DiscoveryBlockingStub>
      implements DiscoveryBlockingClient {
    private DiscoveryBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DiscoveryBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiscoveryBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DiscoveryBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.protobuf.Empty announce(org.thethingsnetwork.management.proto.DiscoveryOuterClass.Announcement request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ANNOUNCE, getCallOptions(), request);
    }

    @java.lang.Override
    public org.thethingsnetwork.management.proto.DiscoveryOuterClass.AnnouncementsResponse getAll(org.thethingsnetwork.management.proto.DiscoveryOuterClass.GetServiceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ALL, getCallOptions(), request);
    }

    @java.lang.Override
    public org.thethingsnetwork.management.proto.DiscoveryOuterClass.Announcement get(org.thethingsnetwork.management.proto.DiscoveryOuterClass.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET, getCallOptions(), request);
    }

    @java.lang.Override
    public com.google.protobuf.Empty addMetadata(org.thethingsnetwork.management.proto.DiscoveryOuterClass.MetadataRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD_METADATA, getCallOptions(), request);
    }

    @java.lang.Override
    public com.google.protobuf.Empty deleteMetadata(org.thethingsnetwork.management.proto.DiscoveryOuterClass.MetadataRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_METADATA, getCallOptions(), request);
    }
  }

  public static class DiscoveryFutureStub extends io.grpc.stub.AbstractStub<DiscoveryFutureStub>
      implements DiscoveryFutureClient {
    private DiscoveryFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DiscoveryFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiscoveryFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DiscoveryFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> announce(
        org.thethingsnetwork.management.proto.DiscoveryOuterClass.Announcement request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ANNOUNCE, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.DiscoveryOuterClass.AnnouncementsResponse> getAll(
        org.thethingsnetwork.management.proto.DiscoveryOuterClass.GetServiceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ALL, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.thethingsnetwork.management.proto.DiscoveryOuterClass.Announcement> get(
        org.thethingsnetwork.management.proto.DiscoveryOuterClass.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> addMetadata(
        org.thethingsnetwork.management.proto.DiscoveryOuterClass.MetadataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD_METADATA, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteMetadata(
        org.thethingsnetwork.management.proto.DiscoveryOuterClass.MetadataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_METADATA, getCallOptions()), request);
    }
  }

  private static final int METHODID_ANNOUNCE = 0;
  private static final int METHODID_GET_ALL = 1;
  private static final int METHODID_GET = 2;
  private static final int METHODID_ADD_METADATA = 3;
  private static final int METHODID_DELETE_METADATA = 4;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Discovery serviceImpl;
    private final int methodId;

    public MethodHandlers(Discovery serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ANNOUNCE:
          serviceImpl.announce((org.thethingsnetwork.management.proto.DiscoveryOuterClass.Announcement) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_ALL:
          serviceImpl.getAll((org.thethingsnetwork.management.proto.DiscoveryOuterClass.GetServiceRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.DiscoveryOuterClass.AnnouncementsResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((org.thethingsnetwork.management.proto.DiscoveryOuterClass.GetRequest) request,
              (io.grpc.stub.StreamObserver<org.thethingsnetwork.management.proto.DiscoveryOuterClass.Announcement>) responseObserver);
          break;
        case METHODID_ADD_METADATA:
          serviceImpl.addMetadata((org.thethingsnetwork.management.proto.DiscoveryOuterClass.MetadataRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_METADATA:
          serviceImpl.deleteMetadata((org.thethingsnetwork.management.proto.DiscoveryOuterClass.MetadataRequest) request,
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
      final Discovery serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_ANNOUNCE,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.DiscoveryOuterClass.Announcement,
              com.google.protobuf.Empty>(
                serviceImpl, METHODID_ANNOUNCE)))
        .addMethod(
          METHOD_GET_ALL,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.DiscoveryOuterClass.GetServiceRequest,
              org.thethingsnetwork.management.proto.DiscoveryOuterClass.AnnouncementsResponse>(
                serviceImpl, METHODID_GET_ALL)))
        .addMethod(
          METHOD_GET,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.DiscoveryOuterClass.GetRequest,
              org.thethingsnetwork.management.proto.DiscoveryOuterClass.Announcement>(
                serviceImpl, METHODID_GET)))
        .addMethod(
          METHOD_ADD_METADATA,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.DiscoveryOuterClass.MetadataRequest,
              com.google.protobuf.Empty>(
                serviceImpl, METHODID_ADD_METADATA)))
        .addMethod(
          METHOD_DELETE_METADATA,
          asyncUnaryCall(
            new MethodHandlers<
              org.thethingsnetwork.management.proto.DiscoveryOuterClass.MetadataRequest,
              com.google.protobuf.Empty>(
                serviceImpl, METHODID_DELETE_METADATA)))
        .build();
  }
}
