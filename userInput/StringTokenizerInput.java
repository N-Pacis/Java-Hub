package userInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringTokenizerInput {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        StringTokenizer tokens = new StringTokenizer(text);
        String token = tokens.nextToken();
        String text2 = reader.readLine();
    
        System.out.println("Text 1: "+ text + " and text 2:"+text2);
    }
}
