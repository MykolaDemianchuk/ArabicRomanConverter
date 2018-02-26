package converter;

import java.util.*;
import util.*;
import static util.NumeralUtil.*;

public class ArabicToRomanConverter implements NumeralConverter{
    
    @Override
    public String convert(String arabicValue) {
        StringBuilder romanValue = new StringBuilder();
        
        try{      
            int arabic = Integer.parseInt(arabicValue);
            if(arabic < 1 || arabic > 3999)
                throw new IllegalNumeralException();
                        
            for(Map.Entry<String,Integer> entry : VALUE_OF.entrySet())
                while(arabic >= entry.getValue()){
                    romanValue.append(entry.getKey());
                    arabic -= entry.getValue();
                }
        } 
        
        catch(NumberFormatException e){
            return "Invalid numeral";
        }
        
        return romanValue.toString();
    }
}
