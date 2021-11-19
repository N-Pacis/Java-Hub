import java.io.IOException;

public class HelloWorld{
    public static void main(String[] args) throws IOException{
        String argValue;
        for(int i=0;i<args.length;i++){
            argValue = args[i];
            System.out.println("Hello :"+argValue);
        }   
    }
}