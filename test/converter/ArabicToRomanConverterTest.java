package converter;

import junit.framework.*;
import exceptions.*;
import java.util.*;
import static util.ConverterUtil.*;

public class ArabicToRomanConverterTest extends TestCase {

    private NumeralConverter ARconverter;
    private NumeralConverter RAconverter;

    @Override
    public void setUp() {
        ARconverter = new ArabicToRomanConverter();
        RAconverter = new RomanToArabicConverter();
    }

    public void testConvert() {
        try {
            List<String> romans = new ArrayList<>();
//
//            for (int i = MIN_VALUE; i <= MAX_VALUE; i++) {
//                String arabic = String.valueOf(i);
//                romans.add(ARconverter.convert(arabic));
//            }
//
//            assertTrue(MAX_VALUE == romans.size());

//            for (int i = MIN_VALUE; i <= MAX_VALUE; i++) {
//                assertEquals(String.valueOf(i), RAconverter.convert(romans.get(i - 1)));
//            }
        } catch (Exception e) {
            fail("Exception thrown " + e.getMessage());
        }
    }

    public void testEmptyInput() {
        try {
            assertEquals("MMXLVII", ARconverter.convert("   2047"));
            assertEquals("MMXLIV", ARconverter.convert("2044   "));
            ARconverter.convert("  ");
        } catch (Exception e) {
            assertEquals(EmptyInputException.ERR_MSG, e.getMessage());
        }
    }

    public void testIllegalArabic() {
        try {
            assertEquals("XV", ARconverter.convert("0015"));
            assertEquals("MMMCMXCVIII", ARconverter.convert("3998"));
            ARconverter.convert("0");
            ARconverter.convert("4000");
        } catch (Exception e) {
            assertEquals(IllegalArabicException.ERR_MSG, e.getMessage());
        }
    }

    public void testIllegalInput() {
        try {
            assertEquals("XXX", ARconverter.convert("  30"));
            ARconverter.convert("XV");
            ARconverter.convert("a2");
            ARconverter.convert("0.2");
            ARconverter.convert("1.3");
            ARconverter.convert("11-2");
        } catch (Exception e) {
            assertEquals(IllegalInputException.ERR_MSG, e.getMessage());
        }
    }
}
