import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/javaDatabaseConnection";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "pacis123";
    private static Connection conn = null;

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
    }
}
