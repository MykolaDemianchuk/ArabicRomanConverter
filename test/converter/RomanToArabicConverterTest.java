package converter;

import exceptions.*;
import junit.framework.*;

public class RomanToArabicConverterTest extends TestCase {

    private NumeralConverter RAconverter;

    @Override
    public void setUp() {
        RAconverter = new RomanToArabicConverter();
    }

    public void testConvert() {
        try {
            assertEquals("15", RAconverter.convert("XV"));
            assertEquals("21", RAconverter.convert("XXI"));
            assertEquals("14", RAconverter.convert("XIV"));
            assertEquals("9", RAconverter.convert("IX"));
            assertEquals("343", RAconverter.convert("CCCXLIII"));
        } catch (Exception e) {
        }
    }

    public void testEmptyInput() {
        try {
            assertEquals(EmptyInputException.ERR_MSG, RAconverter.convert("  "));
            assertEquals(EmptyInputException.ERR_MSG, RAconverter.convert(""));
            assertEquals("3007", RAconverter.convert("  MMMVII "));
            assertEquals("2944", RAconverter.convert("MMCMXLIV   "));
        } catch (Exception e) {
        }
    }

    public void testIllegalRoman() {
        try {
            assertEquals(IllegalRomanException.ERR_MSG, RAconverter.convert("XXXX"));
            assertEquals(IllegalRomanException.ERR_MSG, RAconverter.convert("VV"));
            assertEquals(IllegalRomanException.ERR_MSG, RAconverter.convert("XLXL"));
            assertEquals(IllegalRomanException.ERR_MSG, RAconverter.convert("XCC"));
            assertEquals(IllegalRomanException.ERR_MSG, RAconverter.convert("IVX"));
            assertEquals("15", RAconverter.convert("xv"));
            assertEquals("37", RAconverter.convert("xXxViI"));
            assertEquals("3999", RAconverter.convert("MmMcmXciX"));
        } catch (Exception e) {
        }
    }

    public void testIllegalInput() {
        try {
            assertEquals(IllegalInputException.ERR_MSG, RAconverter.convert("XY"));
            assertEquals(IllegalInputException.ERR_MSG, RAconverter.convert("M CM"));
            assertEquals(IllegalInputException.ERR_MSG, RAconverter.convert("15"));
            assertEquals(IllegalInputException.ERR_MSG, RAconverter.convert("-X"));
        } catch (Exception e) {
        }
    }
}
