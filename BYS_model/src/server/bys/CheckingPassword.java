package server.bys;

import java.util.ArrayList;

public class CheckingPassword {

    private Integer length;

    private String Psw;

    private boolean p;

    public CheckingPassword(String psw) throws PasswordFormatException{
        this.length = psw.length();
        if (this.length <= 7 || this.length >= 14){
            throw new PasswordFormatException(false);
        }
    }
    
    char[] pswchar = psw.toCharArray();
        for (char c : pswchar) {
            if ( 57< c || c <65 || 90< c || c <97 || c < 48 || c > 122){
            throw new PasswordFormatException(false);
            }
            
        }
        
}
