package converter;

import exceptions.*;
import java.util.*;
import static util.ConverterUtil.*;

public class RomanToArabicConverter implements NumeralConverter {

    @Override
    public String convert(String value) throws Exception {
        String roman = getValidRoman(value);
        String arabic = getArabic(roman);
        return arabic;
    }

    private static String getValidRoman(String roman) throws Exception {
        String validRoman = roman.toUpperCase();
        checkPositioning(splitRoman(validRoman));
        return validRoman;
    }

    private static String getArabic(String value) throws Exception {
        int arabic = 0;
        List<String> romans = splitRoman(value);
        for (String roman : romans) {
            arabic += getArabicRepresentation(roman);
        }
        return String.valueOf(arabic);
    }

    private static List<String> splitRoman(String roman) throws Exception {
        List<String> romans = new ArrayList<>();
        boolean found;
        while (!roman.isEmpty()) {
            found = false;
            for (String value : getRomanValues()) {
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

    private static void checkPositioning(List<String> romans) throws Exception {
        int repCount = 0;

        for (int i = 0; i < romans.size() - 1; i++) {
            String roman = romans.get(i);
            String nextRoman = romans.get(i + 1);
            int value = getArabicRepresentation(roman);
            int nextValue = getArabicRepresentation(nextRoman);

            if (value == nextValue && isLegalToRepeat(value) && ++repCount < 3) {
                continue;
            }

            if (value > nextValue) {
                if (isSameBase(value, nextValue)
                        && (!startsWithFive(value) || !startsWithOne(nextValue))) {
                    throw new IllegalRomanException();
                }
                repCount = 0;
                continue;
            }
            throw new IllegalRomanException();
        }
    }
}
