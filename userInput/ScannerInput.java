package userInput;

import java.io.IOException;
import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) throws IOException{

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your names:");
        String names = scan.nextLine(); 
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        System.out.println("Enter your height:");
        Double height = scan.nextDouble();
        System.out.println("Age: "+age+" ,Height: "+height+" and names: "+names);
    }

}
