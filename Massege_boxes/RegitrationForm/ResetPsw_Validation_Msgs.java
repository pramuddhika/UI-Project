package Massege_boxes.RegitrationForm;

import backend_files.Connect_DB;
import backend_files.Encrypter;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ResetPsw_Validation_Msgs {
    
    String PASSWORD_DOESNT_MATCH = "Password doesn\'t match";
    
     public String resetPswValidatedStatus(String user, String psw){
     
        try{

            Connect_DB cdb = new Connect_DB();
            Encrypter enc = new Encrypter();
                    
                //Execute the query
            Connection connection = cdb.getConnection();
            String sql = "SELECT username,status FROM users WHERE users.username = ? AND users.password = ?"; 
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, user);
            statement.setString(2, enc.secure(psw));
            ResultSet result = statement.executeQuery();
                
            if(result.next()){
                return "";
            }      
        }catch (SQLException e) {        
            System.out.println(("Error: " + e.getMessage()));               
        } catch (NoSuchAlgorithmException ex) { 
            Logger.getLogger(AdminAccount_Msgs.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        return PASSWORD_DOESNT_MATCH;
     }
}
