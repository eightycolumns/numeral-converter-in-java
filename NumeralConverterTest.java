import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class NumeralConverterTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void romanToArabicConverterThrowsExceptionWhenPassedEmptyString() {
    thrown.expect(IllegalArgumentException.class);

    thrown.expectMessage(
      "NumeralConverter.romanToArabic() expects a valid Roman numeral."
    );

    NumeralConverter.romanToArabic("");
  }

  @Test
  public void numeralConverterThrowsExceptionWhenPassedIVXLCDM() {
    thrown.expect(IllegalArgumentException.class);

    thrown.expectMessage(
      "NumeralConverter.romanToArabic() expects a valid Roman numeral."
    );

    NumeralConverter.romanToArabic("IVXLCDM");
  }

  @Test
  public void numeralConverterThrowsExceptionWhenPassedMMMM() {
    thrown.expect(IllegalArgumentException.class);

    thrown.expectMessage(
      "NumeralConverter.romanToArabic() expects a valid Roman numeral."
    );

    NumeralConverter.romanToArabic("MMMM");
  }

  @Test
  public void numeralConverterThrowsExceptionWhenPassedDD() {
    thrown.expect(IllegalArgumentException.class);

    thrown.expectMessage(
      "NumeralConverter.romanToArabic() expects a valid Roman numeral."
    );

    NumeralConverter.romanToArabic("DD");
  }

  @Test
  public void numeralConverterThrowsExceptionWhenPassedCCCC() {
    thrown.expect(IllegalArgumentException.class);

    thrown.expectMessage(
      "NumeralConverter.romanToArabic() expects a valid Roman numeral."
    );

    NumeralConverter.romanToArabic("CCCC");
  }

  @Test
  public void numeralConverterThrowsExceptionWhenPassedLL() {
    thrown.expect(IllegalArgumentException.class);

    thrown.expectMessage(
      "NumeralConverter.romanToArabic() expects a valid Roman numeral."
    );

    NumeralConverter.romanToArabic("LL");
  }

  @Test
  public void numeralConverterThrowsExceptionWhenPassedXXXX() {
    thrown.expect(IllegalArgumentException.class);

    thrown.expectMessage(
      "NumeralConverter.romanToArabic() expects a valid Roman numeral."
    );

    NumeralConverter.romanToArabic("XXXX");
  }

  @Test
  public void numeralConverterThrowsExceptionWhenPassedVV() {
    thrown.expect(IllegalArgumentException.class);

    thrown.expectMessage(
      "NumeralConverter.romanToArabic() expects a valid Roman numeral."
    );

    NumeralConverter.romanToArabic("VV");
  }

  @Test
  public void numeralConverterThrowsExceptionWhenPassedIIII() {
    thrown.expect(IllegalArgumentException.class);

    thrown.expectMessage(
      "NumeralConverter.romanToArabic() expects a valid Roman numeral."
    );

    NumeralConverter.romanToArabic("IIII");
  }

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
  public void arabicToRomanConverterThrowsExceptionWhenPassedEmptyString() {
    thrown.expect(IllegalArgumentException.class);

    thrown.expectMessage(
      "NumeralConverter.arabicToRoman() expects a valid Arabic numeral."
    );

    NumeralConverter.arabicToRoman("");
  }

  @Test
  public void numeralConverterThrowsExceptionWhenPassedInvalidArabicNumeral() {
    thrown.expect(IllegalArgumentException.class);

    thrown.expectMessage(
      "NumeralConverter.arabicToRoman() expects a valid Arabic numeral."
    );

    NumeralConverter.arabicToRoman("Invalid Arabic Numeral");
  }

  @Test
  public void numeralConverterThrowsExceptionWhenPassedArabicNumeral0() {
    thrown.expect(IllegalArgumentException.class);

    thrown.expectMessage(
      "NumeralConverter.arabicToRoman() expects an Arabic numeral " +
      "with a value greater than 0 and less than 4000."
    );

    NumeralConverter.arabicToRoman("0");
  }

  @Test
  public void numeralConverterThrowsExceptionWhenPassedArabicNumeral4000() {
    thrown.expect(IllegalArgumentException.class);

    thrown.expectMessage(
      "NumeralConverter.arabicToRoman() expects an Arabic numeral " +
      "with a value greater than 0 and less than 4000."
    );

    NumeralConverter.arabicToRoman("4000");
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
