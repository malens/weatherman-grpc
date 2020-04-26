package edu.malens;

import edu.malens.grpc.City;
import edu.malens.grpc.WeatherGrpc;
import edu.malens.grpc.WeatherResponse;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.BlockingQueue;


public class WeatherImpl extends WeatherGrpc.WeatherImplBase {

    @Override
    public void testget(City request, StreamObserver<WeatherResponse> responseObserver) {
        responseObserver.onNext(WeatherResponse.newBuilder().setCity(request.getName()).build());
        responseObserver.onCompleted();
    }

    @Override
    public void subscribe(City request, StreamObserver<WeatherResponse> responseObserver) {
        System.err.println(request);
        BlockingQueue<WeatherResponse> q = WeatherData.getInstance().subscribe(request.getName());
        while(true){
            try {
                WeatherResponse response = q.take();
                responseObserver.onNext(response);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
        responseObserver.onCompleted();
    }
}
