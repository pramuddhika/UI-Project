package Massege_boxes.LoginForm;

public class Login_Msgs{
    
    final private String USER_NAME_EMPTY_MESSEGE = "Please enter the username.";
    final private String PASSWORD_EMPTY_MESSEGE = "Please enter the password.";
    final private String BOTH_EMPTY_MESSEGE = "Please enter the username and password.";
    final private String USER_NAME_OR_PASSWORD_INCORRECT_MESSEGE = "Please enter the correct username and password.";
    
    public String getUserEmptyMsg(){
        return USER_NAME_EMPTY_MESSEGE;
    }
    
    public String getPswEmptyMsg(){
        return PASSWORD_EMPTY_MESSEGE;
    }
    
    public String getBothEmptyMsg(){
        return BOTH_EMPTY_MESSEGE;
    }
    
    public String getBothIncorrectMsg(){
        return USER_NAME_OR_PASSWORD_INCORRECT_MESSEGE;
    }
        
}
