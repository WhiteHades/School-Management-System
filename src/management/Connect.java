package management;
import java.sql.*;

public class Connect {

    Connection c;
    Statement s;

    public Connect()
    {
        try
        {
            // registering the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///universitymanagementsystem", "root", "elteEFAZ");
            s = c.createStatement();
        } catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}