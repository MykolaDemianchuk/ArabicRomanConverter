package util;

import exceptions.*;
import java.util.*;

public class ConverterUtil {

    public static final NavigableMap<Integer, String> ROMANS;
    public static final NavigableMap<String, Integer> ARABICS;

    public static final int MIN_VALUE = 1;
    public static final int MAX_VALUE = 3999;

    static {
        ROMANS = new TreeMap<>(Collections.reverseOrder());
        ROMANS.put(1000, "M");
        ROMANS.put(900, "CM");
        ROMANS.put(500, "D");
        ROMANS.put(400, "CD");
        ROMANS.put(100, "C");
        ROMANS.put(90, "XC");
        ROMANS.put(50, "L");
        ROMANS.put(40, "XL");
        ROMANS.put(10, "X");
        ROMANS.put(9, "IX");
        ROMANS.put(5, "V");
        ROMANS.put(4, "IV");
        ROMANS.put(1, "I");

        ARABICS = new TreeMap<>(Collections.reverseOrder());
        ROMANS.entrySet().forEach((entry) -> {
            ARABICS.put(entry.getValue(), entry.getKey());
        });
    }

    public static int getValidArabic(String value) throws Exception {
        int arabic = Integer.parseInt(value);
        if(arabic < MIN_VALUE || arabic  > MAX_VALUE)
            throw new IllegalNumberException();
        return arabic;
    }

    public static String getArabic(String value) throws Exception {
        int arabic = 0;
        List<String> numerals = splitRoman(value);
        for (String numeral : numerals) 
            arabic += ARABICS.get(numeral);
        return String.valueOf(arabic);
    }

    public static String getRoman(int value) {
        int closestValue = ROMANS.ceilingKey(value);
        if (closestValue == value)
            return ROMANS.get(value);
        int residualValue = value - closestValue;
        return ROMANS.get(closestValue) + getRoman(residualValue);
    }

    public static String getValidRoman(String roman) throws Exception {
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
            if (!found)
                throw new IllegalInputException();
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
                    throw new IllegalPositioningException();
                }

                repCount = 0;
                continue;
            }
            if (value == nextValue && isOneBased(value) && ++repCount < 3) {
                continue;
            }

            throw new IllegalPositioningException();
        }
    }

    private static boolean isOneBased(int value) {
        return String.valueOf(value).startsWith("1");
    }

    private static boolean isFiveBased(int value) {
        return String.valueOf(value).startsWith("5");
    }
}
