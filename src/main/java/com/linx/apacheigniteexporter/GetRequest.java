package com.linx.apacheigniteexporter;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetRequest {
  static private final String USER_AGENT = "ApacheIgniteExporter/0.1";

  public static int get(String url, StringBuffer response) throws Exception {
    URL obj = new URL(url);
    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
    con.setRequestMethod("GET");
    con.setRequestProperty("User-Agent", USER_AGENT);
    int responseCode = con.getResponseCode();

    BufferedReader in = new BufferedReader(
            new InputStreamReader(con.getInputStream()));
    String inputLine;

    while ((inputLine = in.readLine()) != null) {
      response.append(inputLine);
    }
    in.close();
    return responseCode;
  }
}
