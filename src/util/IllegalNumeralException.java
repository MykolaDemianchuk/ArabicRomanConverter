package util;

/**
 *
 * @author Nick
 */
public class IllegalNumeralException extends NumberFormatException {
    private static final String ERROR_MESSAGE = "Invalid Numeral";
    public IllegalNumeralException(){
        super(ERROR_MESSAGE);
    }
}
