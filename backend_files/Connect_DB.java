package backend_files;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
        
public class Connect_DB {
    
        // Connection parameters
    String url = "jdbc:mysql://localhost:3306/koopi_kade_copy?zeroDateTimeBehavior=CONVERT_TO_NULL";
    String username = "root";
    String password = "";
    
   public Connection getConnection(){
        Connection conn = null;

        try {
                // Connect to database
            conn = DriverManager.getConnection(url, username, password);

            
        } catch (SQLException e) {
            e.printStackTrace();

        }        
        return conn;  
   }    
}
