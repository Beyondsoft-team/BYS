package server.bys;

public class PasswordFormatException extends Exception {

    private boolean format = false;

    public PasswordFormatException(boolean format) {
        this.format = format;
    }

    public boolean isFormat() {
        return format;
    }
}
