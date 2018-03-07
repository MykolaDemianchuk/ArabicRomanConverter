package converter;

import exceptions.*;
import static util.ConverterUtil.*;

public class ArabicToRomanConverter implements NumeralConverter {

    @Override
    public String convert(String value) throws Exception{
        value = value.trim();
        if(value.isEmpty())
            throw new EmptyInputException();
        int arabic = getValidArabic(value);
        String roman = getRoman(arabic);
        return roman;
    }
    
    private static int getValidArabic(String value) throws Exception {
        int arabic = 0;
        try{
            arabic = Integer.parseInt(value);
        }
        catch(NumberFormatException e){
            throw new IllegalInputException();
        }
        if(arabic < MIN_VALUE || arabic  > MAX_VALUE)
            throw new IllegalArabicException();
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
