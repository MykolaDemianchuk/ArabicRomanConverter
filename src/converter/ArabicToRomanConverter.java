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
}
