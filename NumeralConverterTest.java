import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class NumeralConverterTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

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

  @Test
  public void numeralConverterThrowsExceptionWhenPassedArabicNumeral0() {
    thrown.expect(IllegalArgumentException.class);
    NumeralConverter.arabicToRoman("0");
  }

  @Test
  public void arabicNumeral49ConvertsToRomanNumeralXLIX() {
    assertEquals("XLIX", NumeralConverter.arabicToRoman("49"));
  }

  @Test
  public void arabicNumeral1979ConvertsToRomanNumeralMCMLXXIX() {
    assertEquals("MCMLXXIX", NumeralConverter.arabicToRoman("1979"));
  }

  @Test
  public void arabicNumeral3999ConvertsToRomanNumeralMMMCMXCIX() {
    assertEquals("MMMCMXCIX", NumeralConverter.arabicToRoman("3999"));
  }
}
