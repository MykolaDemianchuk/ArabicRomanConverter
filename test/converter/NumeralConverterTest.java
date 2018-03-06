package converter;

import junit.framework.*;

public class NumeralConverterTest extends TestCase {
    public static TestSuite suite(){
        TestSuite suite = new TestSuite();
        suite.addTestSuite(ArabicToRomanConverterTest.class);
        suite.addTestSuite(RomanToArabicConverterTest.class);
        return suite;
    }   
}
