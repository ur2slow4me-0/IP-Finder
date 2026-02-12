import java.net.InetAddress;

public class ipfinder{
    public static void main(String[] args){
        try {
            String url = "contoh.com"; //can be changed
            InetAddress inet = InetAddress.getByName(url);
            System.out.println("Host: " + url);
            System.out.println("IP Address: " + inet.getHostAddress());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
