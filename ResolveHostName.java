import java.net.InetAddress;
import java.util.Scanner;

public class ResolveHostName {
    public static void main(String[] args) {
       try{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your host name is :");
        String hostName = scanner.nextLine();
        scanner.close();
          
        var ip = InetAddress.getByName(hostName);

        System.out.println("Your host name is" + hostName);
        System.out.println("Your address is: " + ip);
        
       } 
       catch(Exception e){
           e.printStackTrace();
       }
    }
    
}
