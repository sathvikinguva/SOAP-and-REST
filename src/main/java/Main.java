package main.java;

import javax.xml.ws.Endpoint;
import soap.CourseSOAPService;

public class Main {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/ws/course", new CourseSOAPService());
        System.out.println("SOAP Service is running at http://localhost:8080/ws/course?wsdl");
        System.out.println("Press Enter to stop...");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}
