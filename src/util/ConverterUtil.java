package util;

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
}