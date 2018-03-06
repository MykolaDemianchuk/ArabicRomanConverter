package exceptions;

public class IllegalPositioningException extends Exception {

    private static final String ERR_MSG = "Illegal numeral";

    public IllegalPositioningException() {
        super(ERR_MSG);
    }
}
