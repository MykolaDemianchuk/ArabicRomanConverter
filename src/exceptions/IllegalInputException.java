package exceptions;

public class IllegalInputException extends Exception {

    public static final String ERR_MSG = "Invalid input";

    public IllegalInputException() {
        super(ERR_MSG);
    }

}
