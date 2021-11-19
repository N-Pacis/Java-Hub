package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileProcesor{
    public static void main(String args[]) throws IOException{
        FileInputStream myInput = null;
        FileOutputStream myOutput = null;
        try {
            File myFile = new File("persons.txt");
            File newFile = new File("output.txt");
            myInput = new FileInputStream(myFile);
            int c;
            if(!newFile.exists()){
                newFile.createNewFile();
            }
            myOutput = new FileOutputStream(newFile);
            while((c =myInput.read()) != -1){
                System.out.print((char)c);
                myOutput.write(c);
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        finally{
            if(myInput != null) myInput.close();
        }
    }
}