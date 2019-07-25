package com.linx.apacheigniteexporter;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class Main {
  static private final int PORT = 9701;

  public static void main(String[] args) {
    try {
      HttpServer server = HttpServer.create(new InetSocketAddress(PORT), 0);
      server.createContext("/metrics", new Metrics());
      server.setExecutor(null);
      server.start();
      System.out.println("Server started at port " + PORT);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  static class Metrics implements HttpHandler {
    private String getRequestHost(HttpExchange t) {
      String hostWithPort = t.getRequestHeaders().get("Host").get(0);
      return hostWithPort.split(":")[0];
    }

    private String getRequestUrl(HttpExchange t) {
      String igniteHost = "127.0.0.1";
      String requestHost = getRequestHost(t);
      return "http://" + igniteHost + ":8080/ignite?cmd=node&mtr=true&ip=" + requestHost;
    }

    private String getPrometeusMetrics(IgniteNodeMetrics metrics) {
      PrometheusMetrics prometheusMetrics = new PrometheusMetrics(metrics);
      return prometheusMetrics.parseMetrics();
    }

    private String getResponse(HttpExchange t) throws Exception{
      String url = getRequestUrl(t);
      StringBuffer responseRestApi = new StringBuffer();
      try {
        int code = GetRequest.get(url, responseRestApi);
      } catch (Exception e) {
        e.printStackTrace();
        throw e;
      }

      Gson gson = new Gson();
      JsonObject jobj = gson.fromJson(responseRestApi.toString(), JsonObject.class);
      IgniteNodeMetrics metrics = gson.fromJson(jobj.get("response").getAsJsonObject().get("metrics"), IgniteNodeMetrics.class);

      return getPrometeusMetrics(metrics);
    }

    @Override
    public void handle(HttpExchange t) throws IOException {
      try {
        String response = getResponse(t);
        t.sendResponseHeaders(200, response.length());
        OutputStream os = t.getResponseBody();
        os.write(response.getBytes());
        os.close();
      } catch (Exception e) {
        e.printStackTrace();
        String response = "Apache Ignite REST API Request error";
        t.sendResponseHeaders(500, response.length());
        OutputStream os = t.getResponseBody();
        os.write(response.getBytes());
        os.close();
      }
    }
  }
}
