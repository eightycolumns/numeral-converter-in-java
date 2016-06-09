import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumeralConverterTest {
  @Test
  public void upperCaseRomanNumeralMMMCMXCIXConvertsToArabicNumeral3999() {
    assertEquals("3999", NumeralConverter.romanToArabic("MMMCMXCIX"));
  }

  @Test
  public void lowerCaseRomanNumeralMMMCMXCIXConvertsToArabicNumeral3999() {
    assertEquals("3999", NumeralConverter.romanToArabic("mmmcmxcix"));
  }
}
