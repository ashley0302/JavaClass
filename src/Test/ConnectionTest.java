package Test;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class ConnectionTest {


    String ClientId = "ashley102";
    String ClientPw = "home1125";
    String myResult;
    public void HttpPostData(){
        try {

            URL url = new URL("https://dev-api.dimigo.in/auth");
            HttpURLConnection http = (HttpURLConnection) url.openConnection();

            http.setDoInput(true);
            http.setDoOutput(true);
            http.setRequestMethod("POST");

            http.setRequestProperty("content-type", "application/json");
            http.setRequestProperty("Accept","application/json");


            StringBuffer buffer = new StringBuffer();
            buffer.append("id").append("=").append(ClientId).append("&");
            buffer.append("password").append("=").append(ClientPw);

            OutputStreamWriter outstream = new OutputStreamWriter(http.getOutputStream(),"UTF-8");
            PrintWriter writer = new PrintWriter(outstream);
            writer.write(buffer.toString());
            writer.flush();


            InputStreamReader tmp = new InputStreamReader(http.getInputStream(), "UTF-8");
            BufferedReader reader = new BufferedReader(tmp);
            StringBuilder builder = new StringBuilder();
            String str;
            while ((str = reader.readLine()) != null) {
                builder.append(str + "\n");
            }
            myResult = builder.toString();
            System.out.print(myResult);
        } catch (MalformedURLException e) {
            //
        } catch (IOException e) {
        }


    }
}

