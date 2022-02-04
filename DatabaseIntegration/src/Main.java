import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Main {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/javaDatabaseConnection";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "pacis123";
    private static Connection conn = null;

    private static Boolean createTable(){
        try{
            Statement statement = conn.createStatement();
            boolean passed = statement.execute("CREATE TABLE students(id PRIMARY KEY AUTO_INCREMENT, firstname VARCHAR(50) NOT NULL, lastname VARCHAR(50) NOT NULL, gender VARCHAR(50)");
            if(passed){
                System.out.println("Table created successfully!");
                return true;
            }
            return false;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    private static void insertIntoStudents(String firstname, String lastname,String gender){
        try{
            Statement statement = conn.createStatement();
            statement.executeUpdate("INSERT INTO students(firstname,lastname,gender) VALUES('"+firstname+"','"+lastname+"','"+gender+"')");

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void displayStudents(){
        try{
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM students");
            while (result.next()){
                System.out.println("Id: "+result.getInt(1)+", Firstname: "+result.getString(2)+", Lastname: "+result.getString(3)+", Gender: "+result.getString(4));
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    private static void connectToDatabase(){
        try{
            conn = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
            if(conn != null) System.out.println("Connected to the database successfully!");
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        connectToDatabase();
        if(createTable()){
            insertIntoStudents("pacis","Nkubito","MALE");
        }
        displayStudents();
    }
}
