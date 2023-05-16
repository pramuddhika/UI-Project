package Massege_boxes.RegitrationForm;

import backend_files.Connect_DB;
//import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OneAdminRerquired_Msgs {
    
    private final String NO_MORE_ADMINS = "At least one admin required.";
    private final String ERROR          = "Error";

    public String adminAvailability(){
        
        
        try{
            Connect_DB cdb = new Connect_DB();
                //Execute the query
            Connection connection = cdb.getConnection();
            String sql = "SELECT COUNT(*) AS rowcount FROM users WHERE users.status = ?"; 
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, "A");
            ResultSet result = statement.executeQuery();
            
            result.next();
            int rowCount = result.getInt("rowcount");
            System.out.println(rowCount);
            if(rowCount > 1){
                
                return "";
                
            }else{
                return NO_MORE_ADMINS;
            }
            
   
        }catch (SQLException e) {        
            System.out.println(("Error: " + e.getMessage())); 
            return ERROR;
        }
        
    }
}
