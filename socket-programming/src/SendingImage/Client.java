package SendingImage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("192.168.0.96",5000);
        OutputStream outputStream = socket.getOutputStream();

        BufferedImage image = ImageIO.read(new File("C:\\Users\\pacis\\Pictures\\Saved Pictures\\IMG-20211123-WA0001 (2).jpg"));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ImageIO.write(image,"jpg",byteArrayOutputStream);
        byte[] size = ByteBuffer.allocate(4).putInt(byteArrayOutputStream.size()).array();
        outputStream.write(size);
        outputStream.write(byteArrayOutputStream.toByteArray());
        outputStream.flush();
        System.out.println("Flushed: " + System.currentTimeMillis());

        Thread.sleep(120000);
        System.out.println("Closing: " + System.currentTimeMillis());
        socket.close();
    }
}
