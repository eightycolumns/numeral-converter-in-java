import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumeralConverterTest {
  @Test
  public void romanNumeralMMMCMXCIXConvertsToArabicNumeral3999() {
    assertEquals("3999", NumeralConverter.romanToArabic("MMMCMXCIX"));
  }
}
