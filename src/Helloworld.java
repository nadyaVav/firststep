import helloservice.endpoint.endpoint;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class HelloWorld {
    public static void main(String[] args) throws IOException {
      getData();
      URL url = new URL("https://firststep.website.yandexcloud.net");
      HttpURLConnection con = (HttpURLConnection) url.openConnection();
      con.setRequestMethod("GET");

      //endpoint();

    }



   public static String getData(){
       DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
       Date date = new Date();
       String result = dateFormat.format(date);
       System.out.println(result);
       return result;
   }
}