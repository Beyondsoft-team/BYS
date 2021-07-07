package server.bys;

public class CheckPsw {

    private String psw;

    private boolean checkpsw;

    public CheckPsw(){

    }

    public CheckPsw(String psw){
        try {

            CheckingPassword p = new CheckingPassword(psw);
            
        } catch (PasswordFormatException e) {
            //TODO: handle exception
            this.checkpsw = false;
        }
    }

}
