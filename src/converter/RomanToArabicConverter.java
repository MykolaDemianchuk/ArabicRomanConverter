package converter;


import java.util.Map;
import static util.NumeralUtil.*;

public class RomanToArabicConverter implements NumeralConverter{

    @Override
    public String convert(String romanNumeral) {
        romanNumeral = romanNumeral.toUpperCase();
        int arabicNumeral = 0;
        
        for(Map.Entry<String, Integer> entry : VALUE_OF.entrySet()){
            for(int i = 0; i < 3; i++)
                if(romanNumeral.startsWith(entry.getKey())){
                    arabicNumeral += entry.getValue();
                    romanNumeral = romanNumeral.substring(entry.getKey().length());
                }   
        }
        
        if(! romanNumeral.isEmpty())
            return "Invalid numeral";
        
        else
            return String.valueOf(arabicNumeral);
    }
}
