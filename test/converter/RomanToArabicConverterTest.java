package converter;

import junit.framework.*;
import util.ConverterUtil;

public class RomanToArabicConverterTest extends TestCase {
    
    private NumeralConverter converter;
    
    @Override
    public void setUp(){
        converter = new RomanToArabicConverter();        
    }
    
    public void testConvert(){
        assertEquals("15", converter.convert("XV"));
        assertEquals("21", converter.convert("XXI"));
        assertEquals("14", converter.convert("XIV"));
        assertEquals("9", converter.convert("IX"));      
        assertEquals("343", converter.convert("CCCXLIII"));
        
        System.out.println("lower");
        System.out.println(ConverterUtil.ROMANS.ceilingKey(453));
        System.out.println("higher");
        System.out.println(ConverterUtil.ROMANS.floorKey(453));
        
        
//        assertEquals("100", converter.convert("C"));

//        assertEquals("Invalid numeral", converter.convert(""));
//        assertEquals("Invalid numeral", converter.convert(" "));
//        assertEquals("Invalid numeral", converter.convert("e"));
//        assertEquals("Invalid numeral", converter.convert("12"));
    }    
}