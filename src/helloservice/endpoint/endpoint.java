package helloservice.endpoint;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class endpoint {
    private String message = new String("Hello, ");

    public void Hello() {}

    @WebMethod
    public String sayHello(String name) {
        return message + name + ".";
    }

    @WebMethod
    public String sayTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String result = dateFormat.format(date);
        return result;
    }

}
