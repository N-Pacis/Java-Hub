package userInput;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderInput {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your firstname:");
        String firstname = reader.readLine();
        System.out.println("Enter your age:");
        String ageInput = reader.readLine();
        int age = Integer.parseInt(ageInput);

        System.out.println("----------------------------------------");
        System.out.println("Firstname: "+firstname + " and age: "+age);
    }
}
