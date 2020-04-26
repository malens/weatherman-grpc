package edu.malens.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.27.0)",
    comments = "Source: proto/weather.proto")
public final class WeatherGrpc {

  private WeatherGrpc() {}

  public static final String SERVICE_NAME = "Weather";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<edu.malens.grpc.City,
      edu.malens.grpc.WeatherResponse> getSubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "subscribe",
      requestType = edu.malens.grpc.City.class,
      responseType = edu.malens.grpc.WeatherResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<edu.malens.grpc.City,
      edu.malens.grpc.WeatherResponse> getSubscribeMethod() {
    io.grpc.MethodDescriptor<edu.malens.grpc.City, edu.malens.grpc.WeatherResponse> getSubscribeMethod;
    if ((getSubscribeMethod = WeatherGrpc.getSubscribeMethod) == null) {
      synchronized (WeatherGrpc.class) {
        if ((getSubscribeMethod = WeatherGrpc.getSubscribeMethod) == null) {
          WeatherGrpc.getSubscribeMethod = getSubscribeMethod =
              io.grpc.MethodDescriptor.<edu.malens.grpc.City, edu.malens.grpc.WeatherResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "subscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.malens.grpc.City.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.malens.grpc.WeatherResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WeatherMethodDescriptorSupplier("subscribe"))
              .build();
        }
      }
    }
    return getSubscribeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.malens.grpc.City,
      edu.malens.grpc.WeatherResponse> getTestgetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "testget",
      requestType = edu.malens.grpc.City.class,
      responseType = edu.malens.grpc.WeatherResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.malens.grpc.City,
      edu.malens.grpc.WeatherResponse> getTestgetMethod() {
    io.grpc.MethodDescriptor<edu.malens.grpc.City, edu.malens.grpc.WeatherResponse> getTestgetMethod;
    if ((getTestgetMethod = WeatherGrpc.getTestgetMethod) == null) {
      synchronized (WeatherGrpc.class) {
        if ((getTestgetMethod = WeatherGrpc.getTestgetMethod) == null) {
          WeatherGrpc.getTestgetMethod = getTestgetMethod =
              io.grpc.MethodDescriptor.<edu.malens.grpc.City, edu.malens.grpc.WeatherResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "testget"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.malens.grpc.City.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.malens.grpc.WeatherResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WeatherMethodDescriptorSupplier("testget"))
              .build();
        }
      }
    }
    return getTestgetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WeatherStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WeatherStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WeatherStub>() {
        @java.lang.Override
        public WeatherStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WeatherStub(channel, callOptions);
        }
      };
    return WeatherStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WeatherBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WeatherBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WeatherBlockingStub>() {
        @java.lang.Override
        public WeatherBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WeatherBlockingStub(channel, callOptions);
        }
      };
    return WeatherBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WeatherFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WeatherFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WeatherFutureStub>() {
        @java.lang.Override
        public WeatherFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WeatherFutureStub(channel, callOptions);
        }
      };
    return WeatherFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class WeatherImplBase implements io.grpc.BindableService {

    /**
     */
    public void subscribe(edu.malens.grpc.City request,
        io.grpc.stub.StreamObserver<edu.malens.grpc.WeatherResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeMethod(), responseObserver);
    }

    /**
     */
    public void testget(edu.malens.grpc.City request,
        io.grpc.stub.StreamObserver<edu.malens.grpc.WeatherResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTestgetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSubscribeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                edu.malens.grpc.City,
                edu.malens.grpc.WeatherResponse>(
                  this, METHODID_SUBSCRIBE)))
          .addMethod(
            getTestgetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                edu.malens.grpc.City,
                edu.malens.grpc.WeatherResponse>(
                  this, METHODID_TESTGET)))
          .build();
    }
  }

  /**
   */
  public static final class WeatherStub extends io.grpc.stub.AbstractAsyncStub<WeatherStub> {
    private WeatherStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WeatherStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WeatherStub(channel, callOptions);
    }

    /**
     */
    public void subscribe(edu.malens.grpc.City request,
        io.grpc.stub.StreamObserver<edu.malens.grpc.WeatherResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSubscribeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void testget(edu.malens.grpc.City request,
        io.grpc.stub.StreamObserver<edu.malens.grpc.WeatherResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTestgetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WeatherBlockingStub extends io.grpc.stub.AbstractBlockingStub<WeatherBlockingStub> {
    private WeatherBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WeatherBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WeatherBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<edu.malens.grpc.WeatherResponse> subscribe(
        edu.malens.grpc.City request) {
      return blockingServerStreamingCall(
          getChannel(), getSubscribeMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.malens.grpc.WeatherResponse testget(edu.malens.grpc.City request) {
      return blockingUnaryCall(
          getChannel(), getTestgetMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WeatherFutureStub extends io.grpc.stub.AbstractFutureStub<WeatherFutureStub> {
    private WeatherFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WeatherFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WeatherFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.malens.grpc.WeatherResponse> testget(
        edu.malens.grpc.City request) {
      return futureUnaryCall(
          getChannel().newCall(getTestgetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBSCRIBE = 0;
  private static final int METHODID_TESTGET = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WeatherImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WeatherImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBSCRIBE:
          serviceImpl.subscribe((edu.malens.grpc.City) request,
              (io.grpc.stub.StreamObserver<edu.malens.grpc.WeatherResponse>) responseObserver);
          break;
        case METHODID_TESTGET:
          serviceImpl.testget((edu.malens.grpc.City) request,
              (io.grpc.stub.StreamObserver<edu.malens.grpc.WeatherResponse>) responseObserver);
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

  private static abstract class WeatherBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WeatherBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return edu.malens.grpc.WeatherProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Weather");
    }
  }

  private static final class WeatherFileDescriptorSupplier
      extends WeatherBaseDescriptorSupplier {
    WeatherFileDescriptorSupplier() {}
  }

  private static final class WeatherMethodDescriptorSupplier
      extends WeatherBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WeatherMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WeatherGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WeatherFileDescriptorSupplier())
              .addMethod(getSubscribeMethod())
              .addMethod(getTestgetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
