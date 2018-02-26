package converter;

import junit.framework.TestCase;
import static util.NumeralUtil.*;
/**
 *
 * @author Nick
 */
public class NumeralConverterTest extends TestCase {
    
    public void testArabicToRoman(){
        NumeralConverter converter = new ArabicToRomanConverter();
        assertEquals("XV", converter.convert("15"));
        assertEquals("XXX", converter.convert("30"));
        assertEquals("Invalid numeral", converter.convert("s"));
        assertEquals("MMXLIV", converter.convert("2044"));
        assertEquals("MMMCMXCVIII", converter.convert("3998"));
    }
     
    public void testRomanToArabic(){                
        NumeralConverter converter = new RomanToArabicConverter();        

        assertEquals("15", converter.convert("XV"));
        assertEquals("21", converter.convert("XXI"));
        assertEquals("14", converter.convert("XIV"));
        assertEquals("9", converter.convert("IX"));      
        assertEquals("343", converter.convert("CCCXLIII"));
        assertEquals("100", converter.convert("C"));        
    }    
}
