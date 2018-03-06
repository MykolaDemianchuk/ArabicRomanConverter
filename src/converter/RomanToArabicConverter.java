package converter;

import exceptions.*;
import static util.ConverterUtil.*;

public class RomanToArabicConverter implements NumeralConverter {

    @Override
    public String convert(String value) {
        try {
            value = value.trim();
            if (value.isEmpty()) {
                throw new EmptyInputException();
            }
            String roman = getValidRoman(value);
            String arabic = getArabic(roman);
            return arabic;
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
