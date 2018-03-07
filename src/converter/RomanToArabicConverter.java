package converter;

import exceptions.*;
import java.util.*;
import static util.ConverterUtil.*;

public class RomanToArabicConverter implements NumeralConverter {

    @Override
    public String convert(String value) throws Exception {
        value = value.trim();
        if(value.isEmpty())
            throw new EmptyInputException();
        String roman = getValidRoman(value);
        String arabic = getArabic(roman);
        return arabic;
    }

    private static String getArabic(String value) throws Exception {
        int arabic = 0;
        List<String> numerals = splitRoman(value);
        for (String numeral : numerals) {
            arabic += ARABICS.get(numeral);
        }
        return String.valueOf(arabic);
    }

    private static String getValidRoman(String roman) throws Exception {
        String validRoman = roman.toUpperCase();
        checkPositioning(splitRoman(validRoman));
        return validRoman;
    }

    private static List<String> splitRoman(String roman) throws Exception {
        List<String> romans = new ArrayList<>();
        boolean found;
        while (!roman.isEmpty()) {
            found = false;
            for (String value : ROMANS.values()) {
                if (roman.startsWith(value)) {
                    romans.add(value);
                    roman = roman.substring(value.length());
                    found = true;
                }
            }
            if (!found) {
                throw new IllegalInputException();
            }
        }
        return romans;
    }

    private static void checkPositioning(List<String> list) throws Exception {
        int repCount = 0;

        for (int i = 0; i < list.size() - 1; i++) {
            int value = ARABICS.get(list.get(i));
            int nextValue = ARABICS.get(list.get(i + 1));

            if (value > nextValue) {
                if (String.valueOf(value).length() == String.valueOf(nextValue).length()
                        && (!isFiveBased(value) || !isOneBased(nextValue))) {
                    throw new IllegalRomanException();
                }

                repCount = 0;
                continue;
            }
            if (value == nextValue && isOneBased(value) && ++repCount < 3) {
                continue;
            }

            throw new IllegalRomanException();
        }
    }

    private static boolean isOneBased(int value) {
        return String.valueOf(value).startsWith("1");
    }

    private static boolean isFiveBased(int value) {
        return String.valueOf(value).startsWith("5");
    }
}
