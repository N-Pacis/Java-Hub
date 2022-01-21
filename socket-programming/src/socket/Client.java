package socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.0.110",5000);

        OutputStream outToServer = socket.getOutputStream();
        DataOutputStream requestToSend = new DataOutputStream(outToServer);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the message to send");
        String message = scan.nextLine();
        requestToSend.writeUTF(message);
        InputStream inFromServer = socket.getInputStream();
        DataInputStream response = new DataInputStream(inFromServer);
        System.out.println("Server responded with: "+response.readUTF());

        socket.close();
    }
}
