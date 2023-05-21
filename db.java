import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
public class db {
    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:hr@//localhost:1521/xepdb1","hr","hr");
        System.out.println("connection sucee");
        con.close();
    }
}
