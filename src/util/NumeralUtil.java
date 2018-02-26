package util;

import java.util.*;

public class NumeralUtil {
    public static final Map<String, Integer> VALUE_OF;
    
    static{
        VALUE_OF = new LinkedHashMap<String, Integer>();
        VALUE_OF.put("M", 1000);
        VALUE_OF.put("CM", 900);
        VALUE_OF.put("D", 500);
        VALUE_OF.put("CD", 400);
        VALUE_OF.put("C", 100);
        VALUE_OF.put("XC", 90);
        VALUE_OF.put("L", 50);
        VALUE_OF.put("XL", 40);
        VALUE_OF.put("X", 10);
        VALUE_OF.put("IX", 9);
        VALUE_OF.put("V", 5);
        VALUE_OF.put("IV", 4);
        VALUE_OF.put("I", 1);   
    }    
}
