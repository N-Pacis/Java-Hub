package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket serverSocket= new DatagramSocket(9000);
        while(true){
            byte[]  buffer = new byte[1024];
            DatagramPacket dpRequest = new DatagramPacket(buffer, buffer.length);
            serverSocket.receive(dpRequest);
            String clientRequest = new String(buffer,0, dpRequest.getLength());
            System.out.println(clientRequest);

            //sending back response
            InetAddress ip = dpRequest.getAddress();
            int clientPort = dpRequest.getPort();
            String responseToClient = "Received request";
            byte[] responseBytes = responseToClient.getBytes();
            DatagramPacket dpResponse = new DatagramPacket(responseBytes,responseBytes.length,ip,clientPort);
            serverSocket.send(dpResponse);
        }
    }
}
