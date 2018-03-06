package converter;

import exceptions.*;
import static util.ConverterUtil.*;

public class ArabicToRomanConverter implements NumeralConverter {

    @Override
    public String convert(String value) {
        try {
            value = value.trim();
            if (value.isEmpty()) {
                throw new EmptyInputException();
            }
            int arabic = getValidArabic(value);
            String roman = getRoman(arabic);
            return roman;
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
    private static int getValidArabic(String value) throws Exception {
        int arabic = Integer.parseInt(value);
        if(arabic < MIN_VALUE || arabic  > MAX_VALUE)
            throw new IllegalNumberException();
        return arabic;
    }
    
    private static String getRoman(int value) {
        int closestValue = ROMANS.ceilingKey(value);
        if (closestValue == value)
            return ROMANS.get(value);
        int residualValue = value - closestValue;
        return ROMANS.get(closestValue) + getRoman(residualValue);
    }   
}
