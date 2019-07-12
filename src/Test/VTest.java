package Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Time;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.io.OutputStream;


public class VTest {
    public static String[] Time1 = new String[250];
    public static String[] Time2 = new String[250];
    public static int Time2nd = 0;
    public static int Time1st = 0;
    public static int Time3rd = 0;
    String filePath = "Test.txt";

    public static void main (String[] args) throws IOException {
        System.out.println("1. 인강실명단 출력 2.인원추가 3.복사하기");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        if(input == 1){
            Copy();
        }
        if(input==2){
            System.out.println("원하는 타임을 입력해주세요");
            Scanner scan2 = new Scanner(System.in);
            System.out.println("추가할 학생의 이름을 입력해주세요");
            Scanner scan3 = new Scanner(System.in);
            Integer inputTime = scan2.nextInt();
            String inputName = scan3.toString();
            StudentAdd(inputTime,inputName);
        }
        if(input ==3){
            File file = new File("C:\\Users\\spide\\Desktop\\b.txt");
            FileWriter writer = null;

            try {
                // 기존 파일의 내용에 이어서 쓰려면 true를, 기존 내용을 없애고 새로 쓰려면 false를 지정한다.
                writer = new FileWriter(file, true);
                writer.write("1타임");
                for(int k=0;k<Time1st;k++){
                    writer.write(Time1[k]);
                }
                writer.flush();
                System.out.println("DONE");
            } catch(IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if(writer != null) writer.close();
                } catch(IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }
    public static void Copy() throws IOException {
        try {
            File file = new File("C:\\Users\\spide\\Desktop\\ingang.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            for(int j=0;j<Time1st;j++) {
                bw.write(Time1[j] + "\n");
            }
            bw.close();
        }
        catch (IOException e) {
        }

    }
    public static void StudentAdd(int inputTime, String inputName){
        if(inputTime==1){
            Time1[Time1st]= inputName;
            Time1st++;
        }
        else if(inputTime ==2){
            Time2[Time2nd]= inputName;
            Time2nd++;
        }

    }



    public static void ViewList(){
        HashMap<String, String> map = new HashMap<String, String>();
        String bearerToken = null;
        JsonObject Profile = new JsonObject();
        Profile.addProperty("id","ashley102");
        Profile.addProperty("password","home1125");
        OutputStream outStream = null;
        URLConnection uCon = null;
        InputStream is = null;


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
            String excelURL = "https://dev-api.dimigo.in/ingang/admin";
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

        }catch (Exception e){
            System.out.println(e);
        }

        try {
            String excelURL = "https://dev-api.dimigo.in/ingang/users/";
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
            System.out.println();
            String Response = response.toString();
            parseList(Response);
        }catch (Exception e){
            System.out.println(e);
        }

    }

    private static void parseList(String Response) throws Exception{
        //Integer Time3rd = 0;
        //String[] Time3 = null;

        int i = 0;
        Map<String, Object> map = new ObjectMapper().readValue(Response, Map.class);
        List<Map<String, Object>> list = (List<Map<String, Object>>) map.get("users");
        for (Map<String, Object> profile : list) {

            String name = ((String) profile.get("name")).replaceAll("\\<.*?>","");// 정규표현식을 사용하여 특수문자를 없애기
            Integer time = (Integer)profile.get("time");
            Integer grade = (Integer)profile.get("grade");
            if(grade == 1){
                if(time==1){
                    Time1[Time1st]= name;
                    Time1st++;
                }
                if(time==2){
                    Time2[Time2nd]= name;
                    Time2nd++;
                }
            }
        }



//            System.out.printf("<1타임 명단> 총 %d 명\n",Time1st);
//            for(int j=0;j<Time1st;j++){
//                System.out.println(Time1[j]);
//            }
//            System.out.printf("<2타임 명단> 총 %d 명\n",Time2nd);
//            for(int j=0;j<Time2nd;j++){
//                System.out.println(Time2[j]);
//            }


    }
}
