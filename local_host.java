import java.net.*;
public class local_host {
    public static void main(String[] args) {
        try{
            var hostName = InetAddress.getLocalHost();
            System.out.println("Local Host" + hostName);
        }
        catch(UnknownHostException e){
            System.out.println(e);
        }
    }
    
}
