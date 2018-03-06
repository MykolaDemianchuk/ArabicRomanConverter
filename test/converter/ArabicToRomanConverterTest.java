package converter;

import junit.framework.*;
import static converter.ArabicToRomanConverter.*;
import java.util.ArrayList;
import java.util.List;

public class ArabicToRomanConverterTest extends TestCase {
    
    private NumeralConverter converter;
    private NumeralConverter RAconverter;
    
    @Override
    public void setUp(){
        converter = new ArabicToRomanConverter();     
        RAconverter = new RomanToArabicConverter();
    }
    
    public void testConvert(){
        
        assertEquals("XV", converter.convert("0"));
        assertEquals("XV", converter.convert("15"));
        assertEquals("XXX", converter.convert("30"));        
        assertEquals("MMXLIV", converter.convert("2044"));
        assertEquals("MMMCMXCVIII", converter.convert("3998"));
        
        List<String> convertedToRoman = new ArrayList<String>();
        for(int i = 1; i < 4000; i++){
            convertedToRoman.add(converter.convert(String.valueOf(i)));
            System.out.println(i + "\t\t" + convertedToRoman.get(i - 1) );
        }
        
        System.out.println("list size is " + convertedToRoman.size());
        
        
        for(int i = 0; i < 3999; i++){
           assertEquals(String.valueOf(i+1), RAconverter.convert(convertedToRoman.get(i)));
        }
        
    }    
}
