package converter;

import junit.framework.*;
import exceptions.*;
import java.util.*;
import util.ConverterUtil;
import static util.ConverterUtil.*;

public class ArabicToRomanConverterTest extends TestCase {
    
    private NumeralConverter ARconverter;
    private NumeralConverter RAconverter;
    
    @Override
    public void setUp(){
        ARconverter = new ArabicToRomanConverter();     
        RAconverter = new RomanToArabicConverter();
    }
    
    public void testConvert(){
        List<String> romans = new ArrayList<>();
        
        for(int i = MIN_VALUE; i <= MAX_VALUE; i++){
            String arabic = String.valueOf(i);
            romans.add(ARconverter.convert(arabic));
        }
        
        assertTrue(MAX_VALUE == romans.size());
        
        for(int i = MIN_VALUE; i <= MAX_VALUE; i++)
           assertEquals(String.valueOf(i), RAconverter.convert(romans.get(i-1)));
    }
    
    public void testEmptyInput(){
        assertEquals(EmptyInputException.ERR_MSG, ARconverter.convert("  "));
        assertEquals(EmptyInputException.ERR_MSG, ARconverter.convert(""));
        assertEquals("MMXLVII", ARconverter.convert("   2047"));
        assertEquals("MMXLIV", ARconverter.convert("2044   "));
        
    }
    
    public void testIllegalArabic(){
        assertEquals(IllegalArabicException.ERR_MSG, ARconverter.convert("0"));
        assertEquals(IllegalArabicException.ERR_MSG, ARconverter.convert("4000"));
        assertEquals("XV", ARconverter.convert("0015"));
        assertEquals("MMMCMXCVIII", ARconverter.convert("3998"));
    }
    
    public void testIllegalInput(){
        assertEquals(IllegalInputException.ERR_MSG, ARconverter.convert("XV"));
        assertEquals(IllegalInputException.ERR_MSG, ARconverter.convert("a2"));
        assertEquals(IllegalInputException.ERR_MSG, ARconverter.convert("0.2"));
        assertEquals(IllegalInputException.ERR_MSG, ARconverter.convert("1.3"));
        assertEquals(IllegalInputException.ERR_MSG, ARconverter.convert("11-2"));
        assertEquals("XXX", ARconverter.convert("  30"));      
    }
}