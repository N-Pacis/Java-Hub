package UDP;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your message");
        String requestStr = scan.nextLine();
        byte[] requestBytes = requestStr.getBytes();

        InetAddress ip = InetAddress.getLocalHost();
        DatagramPacket dprequest = new DatagramPacket(requestBytes,requestBytes.length,ip,9000);
        socket.send(dprequest);

        //ReceiveResponse
        byte[] buffer = new byte[1024];
        DatagramPacket dbresponse = new DatagramPacket(buffer,buffer.length);
        socket.receive(dbresponse);
        String response = new String(buffer,0,dbresponse.getLength());
        System.out.println(response);
    }
}
