package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        try{
            ServerSocket serverSocket = new ServerSocket(6000);
            Socket socket = serverSocket.accept();

            InputStream infromclient = socket.getInputStream();
            DataInputStream request =  new DataInputStream(infromclient);
            System.out.println(request.readUTF());

            OutputStream responsetoClient = socket.getOutputStream();
            DataOutputStream response = new DataOutputStream(responsetoClient);
            response.writeUTF("Your request is received");
        }
        catch(Exception ex){

        }
    }
}
