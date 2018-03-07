package exceptions;

public class IllegalArabicException extends Exception {

    public static final String ERR_MSG = "Number out of range";

    public IllegalArabicException() {
        super(ERR_MSG);
    }
}
