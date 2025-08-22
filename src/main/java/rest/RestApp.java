package main.java.rest;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.grizzly.http.server.HttpServer;

import java.net.URI;

public class RestApp {
    public static final String BASE_URI = "http://localhost:8081/api/";

    public static HttpServer startServer() {
        final ResourceConfig rc = new ResourceConfig(CourseResource.class);
        return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), rc);
    }

    public static void main(String[] args) {
        final HttpServer server = startServer();
        System.out.println("REST service started at " + BASE_URI);
        System.out.println("Press Enter to stop...");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
        server.shutdownNow();
    }
}
