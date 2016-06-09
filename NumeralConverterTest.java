import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumeralConverterTest {
  @Test
  public void upperCaseRomanNumeralXLIXConvertsToArabicNumeral49() {
    assertEquals("49", NumeralConverter.romanToArabic("XLIX"));
  }

  @Test
  public void lowerCaseRomanNumeralXLIXConvertsToArabicNumeral49() {
    assertEquals("49", NumeralConverter.romanToArabic("xlix"));
  }

  @Test
  public void upperCaseRomanNumeralMCMLXXIXConvertsToArabicNumeral1979() {
    assertEquals("1979", NumeralConverter.romanToArabic("MCMLXXIX"));
  }

  @Test
  public void lowerCaseRomanNumeralMCMLXXIXConvertsToArabicNumeral1979() {
    assertEquals("1979", NumeralConverter.romanToArabic("mcmlxxix"));
  }

  @Test
  public void upperCaseRomanNumeralMMMCMXCIXConvertsToArabicNumeral3999() {
    assertEquals("3999", NumeralConverter.romanToArabic("MMMCMXCIX"));
  }

  @Test
  public void lowerCaseRomanNumeralMMMCMXCIXConvertsToArabicNumeral3999() {
    assertEquals("3999", NumeralConverter.romanToArabic("mmmcmxcix"));
  }
}
