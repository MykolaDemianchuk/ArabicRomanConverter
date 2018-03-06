package exceptions;

public class IllegalNumberException extends Exception {

    private static final String ERR_MSG = "Out of scopes number";

    public IllegalNumberException() {
        super(ERR_MSG);
    }
}
