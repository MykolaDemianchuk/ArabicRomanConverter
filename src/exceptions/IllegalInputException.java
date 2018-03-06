package exceptions;

public class IllegalInputException extends Exception {

    private static final String ERR_MSG = "Invalid input";

    public IllegalInputException() {
        super(ERR_MSG);
    }

}
