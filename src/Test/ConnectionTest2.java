package Test;

import com.google.gson.JsonObject;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.HashMap;


public class ConnectionTest2 {
    public static void main(String[] args) {

        String bearerToken = null;
        JsonObject Profile = new JsonObject();
        Profile.addProperty("id","ashley102");
        Profile.addProperty("password","home1125");
        OutputStream outStream = null;
        URLConnection uCon = null;
        InputStream is = null;
        HashMap<String, String> map = new HashMap<String, String>();


        try {
                String apiURL = "https://dev-api.dimigo.in/auth"; // json 결과
                URL url = new URL(apiURL);

                HttpURLConnection con = (HttpURLConnection)url.openConnection();
                con.setRequestMethod("POST");
                con.setRequestProperty("content-type", "application/json; utf-8");
                con.setDoOutput(true);
                con.setRequestProperty("Accept", "application/json");

                OutputStreamWriter wr = new OutputStreamWriter(con.getOutputStream());
                wr.write(Profile.toString());
                wr.flush();

            int responseCode = con.getResponseCode();
                BufferedReader br;
                if(responseCode==200) { // 정상 호출
                    br = new BufferedReader(new InputStreamReader(con.getInputStream()));
                } else {  // 에러 발생
                    br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
                }
                String inputLine;
                StringBuffer response = new StringBuffer();
                while ((inputLine = br.readLine()) != null) {
                    response.append(inputLine);
                }
                br.close();
           int k = response.indexOf("refresh_token") -3;
            bearerToken = response.substring(11,k-1);



        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            String excelURL = "https://dev-api.dimigo.in/ingang/excel/2/";
            URL url2 = new URL(excelURL);
            HttpURLConnection conn = (HttpURLConnection)url2.openConnection();
            conn.setRequestProperty("content-type", "application/json; utf-8");
            conn.setRequestProperty("Authorization", "Bearer " + bearerToken);
            conn.setDoOutput(true);
            conn.setRequestMethod("GET");

            int responseCode = conn.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { // 정상 호출
                br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else {  // 에러 발생
                br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
            br.close();
            System.out.println(" ");
//            byte[] utf = URLEncoder.encode(response.toString(),java.nio.charset.StandardCharsets.UTF_8.toString()).getBytes("UTF-8");
//            System.out.println(new String(utf, "UTF-8"));

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
