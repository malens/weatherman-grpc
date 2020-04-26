package edu.malens;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;
import java.util.Scanner;


public class WeatherServer {

    private Server server;

    private void start(int port) throws IOException {
        server = ServerBuilder.forPort(port)
                .addService(new WeatherImpl())
                .build()
                .start();
        System.out.println("Weather server started at: " + port);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("shutting down server after JVM shutdown");
            WeatherServer.this.stop();
            System.err.println("server shut down");
        }));
    }

    private void stop(){
        if (server != null){
            server.shutdown();
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null){
            server.awaitTermination();
        }
    }

    public static void main (String[] args) throws IOException, InterruptedException {
        final WeatherServer server = new WeatherServer();
        System.out.println("Provide server port");
        Scanner s = new Scanner(System.in);
        server.start(s.nextInt());
        server.blockUntilShutdown();
    }


}
