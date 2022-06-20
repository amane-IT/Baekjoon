import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;


public class Main {
    
	static String HOST_URL = "http://13.125.222.176/quiz/";

    public static void main(String[] args) {

    	String strUrl = "alpha";
    	String answer =
    			"hellossafy";
//    			"dfs";
//    			"ssafycial";
//    			"protocol";
//    			"json";
//    			"singleton";
//    			"cookie";
//    			"redis";
//    			"MVVM";
//    			"pandas";
//    			"bluetooth";
//    			"FittyMon";
//    			"memoization";
//    			"IoC";
//    			"dfs";
//    			"bloom";
//    			"a";
//    			"quick";
//    			"kubernete";
    
    	
    	try {
			apiTestPost(strUrl, answer);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    }
    

    
    public static void apiTestPost(String strUrl, String answer) throws Exception 
    {
        URL url = null;
        String readLine = null;
        StringBuilder buffer = null;
        OutputStream outputStream = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        HttpURLConnection urlConnection = null;
    	
        int connTimeout = 5000;
        int readTimeout = 3000;
    	
        String sendData = "{" + "\"nickname\":\"구미 공통 1반 이주은\" , "
                + "\"yourAnswer\":\""+ answer + "\""
                + "}";		
        // 대다수의 경우 JSON 데이터 사용  
        String apiUrl = "http://13.125.222.176/quiz/" + strUrl;	// 각자 상황에 맞는 IP & url 사용 
    	
        try 
        {
            url = new URL(apiUrl);
    		
            urlConnection = (HttpURLConnection)url.openConnection();
            urlConnection.setRequestMethod("POST");
            urlConnection.setConnectTimeout(connTimeout);
            urlConnection.setReadTimeout(readTimeout);
            urlConnection.setRequestProperty("Content-Type", "application/json;");
            urlConnection.setRequestProperty("Accept", "application/json;");
            urlConnection.setDoOutput(true);
            urlConnection.setInstanceFollowRedirects(true);
    		
            outputStream = urlConnection.getOutputStream();
    		
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream,"UTF-8"));
            bufferedWriter.write(sendData);
            bufferedWriter.flush();
    		
            buffer = new StringBuilder();
            if(urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK) 
            {
                bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(),"UTF-8"));
                while((readLine = bufferedReader.readLine()) != null) 
                {
                    buffer.append(readLine).append("\n");
                }
            }
            else 
            {
                buffer.append("\"code\" : \""+urlConnection.getResponseCode()+"\"");
                buffer.append(", \"message\" : \""+urlConnection.getResponseMessage()+"\"");
            }
        }
        catch(Exception ex) 
        {
            ex.printStackTrace();
        }
        finally 
        {
            try 
            {
                if (bufferedWriter != null) { bufferedWriter.close(); }
                if (outputStream != null) { outputStream.close(); }
                if (bufferedReader != null) { bufferedReader.close(); }
            }
            catch(Exception ex) 
            { 
                ex.printStackTrace();
            }
        }

        System.out.println(buffer.toString());
    }
}
