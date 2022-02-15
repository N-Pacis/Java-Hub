import java.sql.*;

public class InsertDatabase {
    try{
        Connection conn = DriverManager.getConnection(""); Statement stmt ​=
    conn​.​createStatement()) {
        conn.setAutoCommit(false);
        stmt.executeUpdate("insert into colors values ('red')");
        stmt.executeUpdate("insert into colors values ('blue')");
        conn.commit();
        conn.setAutoCommit(true);
        stmt.executeUpdate("insert into colors values ('green')");
    }
}
