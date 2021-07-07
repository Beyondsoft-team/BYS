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
}
