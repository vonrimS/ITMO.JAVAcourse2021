package com.company.Lesson13_Practice;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

public class PlainWikiReq {
    private static HttpURLConnection connection;

    public static void main(String[] args) throws IOException {
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What are you looking for?");
        String req = scanner.nextLine().replace(" ","_");
        String reqClreared = URLEncoder.encode(req, "UTF-8");
        String reqWiki = "https://en.wikipedia.org/api/rest_v1/page/summary/";
        String fullReq = reqWiki + req;

        try {
            URL url = new URL(fullReq);
            //URL url = new URL("https://en.wikipedia.org/api/rest_v1/page/summary/");
            //URL url = new URL ("https://jsonplaceholder.typicode.com/albums");
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();
            System.out.println("Response Code: " + status);

            if (status > 299) {
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            } else {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            }

            //System.out.println(responseContent.toString());
            parse(responseContent.toString());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            connection.disconnect();
        }

//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/albums")).build();
//        //HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/albums")).build();
//        client.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body).thenApply(Main::parse).join();
//        System.out.println(connection.getResponseCode());
    }

    public static String parse(String responseBody) {

//        JSONArray albums = new JSONArray(responseBody);
//        for (int i = 0; i < albums.length(); i++) {
//            JSONObject album = albums.getJSONObject(i);
//            int id = album.getInt("id");
//            int userId = album.getInt("userId");
//            String title = album.getString("title");
//            System.out.println(id + " - " + title + " " + userId);
//        }

//        JSONArray array = new JSONArray(responseBody);
//        for (int i = 0; i < array.length(); i++) {
//            JSONObject object = array.getJSONObject(i);
//            int id = object.getInt("id");
//            System.out.println(id);
//        }

        JSONObject obj = new JSONObject(responseBody);
        System.out.println();
        System.out.println(obj.getString("displaytitle"));
        System.out.println("-----------------------------------");
        System.out.println(obj.getString("extract"));
        System.out.println();

        return null;
    }
}
