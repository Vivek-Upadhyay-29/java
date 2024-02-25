import java.net.*;
public class address {
    public static void main(String[] args) {
        try{
            InetAddress ip = InetAddress.getByName("www.google.com");
            System.out.println("IP" + ip);
        }
        catch(UnknownHostException e){
            System.out.println(e);
        }
    }
    
}
