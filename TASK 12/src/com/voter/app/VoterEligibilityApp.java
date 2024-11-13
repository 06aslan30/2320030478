package com.voter.app;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.OutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.stream.Collectors;

public class VoterEligibilityApp {
    public static void main(String[] args) throws IOException {
        // Create an HTTP server on port 8080
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.createContext("/checkEligibility", new VoterEligibilityHandler());
        server.setExecutor(null); // Use default executor
        server.start();
        System.out.println("Server started on http://localhost:8080/checkEligibility");
    }

    static class VoterEligibilityHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            if ("POST".equalsIgnoreCase(exchange.getRequestMethod())) {
                // Parse the form data
                String formData = new String(exchange.getRequestBody().readAllBytes(), StandardCharsets.UTF_8);
                Map<String, String> params = parseFormData(formData);

                String name = params.get("name").replace("+", " "); // Replace '+' with space
                name = URLDecoder.decode(name, StandardCharsets.UTF_8); // Decode URL-encoded characters
                String ageStr = params.get("age");
                String response;

                try {
                    int age = Integer.parseInt(ageStr);
                    if (age >= 18) {
                        response = "Hello " + name + ", you are eligible to vote!";
                    } else {
                        response = "Hello " + name + ", you are not eligible to vote yet.";
                    }
                } catch (NumberFormatException e) {
                    response = "Invalid age input. Please enter a valid number.";
                }

                // Send response
                exchange.sendResponseHeaders(200, response.getBytes().length);
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            } else {
                String form = "<html><body>" +
                        "<form method='POST' action='/checkEligibility'>" +
                        "Name: <input type='text' name='name'><br>" +
                        "Age: <input type='text' name='age'><br>" +
                        "<input type='submit' value='Check Eligibility'>" +
                        "</form>" +
                        "</body></html>";

                exchange.sendResponseHeaders(200, form.getBytes().length);
                OutputStream os = exchange.getResponseBody();
                os.write(form.getBytes());
                os.close();
            }
        }

        private Map<String, String> parseFormData(String formData) {
            return java.util.Arrays.stream(formData.split("&"))
                    .map(s -> s.split("="))
                    .collect(Collectors.toMap(
                            pair -> pair[0],
                            pair -> pair.length > 1 ? pair[1] : ""));
        }
    }
}
