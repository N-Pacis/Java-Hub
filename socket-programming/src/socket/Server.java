package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        try{
            ServerSocket serverSocket = new ServerSocket(5000);
            while(true){
                Socket socket = serverSocket.accept();

                InputStream infromclient = socket.getInputStream();
                DataInputStream request =  new DataInputStream(infromclient);
                System.out.println(request.readUTF());

                OutputStream responsetoClient = socket.getOutputStream();
                DataOutputStream response = new DataOutputStream(responsetoClient);

                Scanner scan = new Scanner(System.in);
                String message;
                System.out.println("Enter the message to send:");
                message =  scan.nextLine();
                response.writeUTF(message);
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
