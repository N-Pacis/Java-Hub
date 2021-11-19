package variableScope;

import java.io.IOException;

import enumerations.Person;


public class VariableScopeDemo {
    //global variable declaration
    String message;
    static int status;
    public static void main(String[] args) throws IOException{
        //local variable declaration
        String response;

        //class Instatioation
        VariableScopeDemo S1 = new VariableScopeDemo();
        S1.message ="Hello 1";
        S1.status= 200;
        response = "{message="+S1.message+", Status:"+S1.status+"}";
        System.out.println(response);
        
        VariableScopeDemo S2 = new VariableScopeDemo();
        S2.message ="Hello 2";
        S2.status= 300;
        response = "{message="+S1.message+", Status:"+S1.status+"}";
        System.out.println(response);

        //class Data Type Demo
        Person p1 = new Person();
        p1.setFirstName("Pacis");
        p1.getFirstName();
    }
}
