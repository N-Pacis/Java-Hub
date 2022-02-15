import java.net.*;
    public class HostName {
        public static void main(String[] args) throws UnknownHostException  {
            InetAddress obj = InetAddress.getByName("cisco.com");
            System.out.print(obj.getHostName());
        }
    }

