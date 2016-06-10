import java.util.LinkedHashMap;
import java.util.Map;

final class NumeralConverter {
  private NumeralConverter() {}

  private final static LinkedHashMap<String, Integer> numeralMap;

  static {
    numeralMap = new LinkedHashMap<>();

    numeralMap.put("M", 1000);
    numeralMap.put("CM", 900);
    numeralMap.put("D",  500);
    numeralMap.put("CD", 400);
    numeralMap.put("C",  100);
    numeralMap.put("XC",  90);
    numeralMap.put("L",   50);
    numeralMap.put("XL",  40);
    numeralMap.put("X",   10);
    numeralMap.put("IX",   9);
    numeralMap.put("V",    5);
    numeralMap.put("IV",   4);
    numeralMap.put("I",    1);
  }

  public static String arabicToRoman(String arabicNumeral) {
    if (!isArabicNumeral(arabicNumeral)) {
      throw new IllegalArgumentException(
        "NumeralConverter.arabicToRoman() expects a valid Arabic numeral."
      );
    }

    return arabicToRoman(Integer.parseInt(arabicNumeral));
  }

  private static boolean isArabicNumeral(String string) {
    return string.matches("^0|[1-9]\\d*$");
  }

  public static String arabicToRoman(int arabicNumeral) {
    if (!isInRange(arabicNumeral)) {
      throw new IllegalArgumentException(
        "NumeralConverter.arabicToRoman() expects an Arabic numeral " +
        "with a value greater than 0 and less than 4000."
      );
    }

    String romanNumeral = "";

    for (Map.Entry<String, Integer> entry : numeralMap.entrySet()) {
      String key = entry.getKey();
      Integer value = entry.getValue();

      while (arabicNumeral / value >= 1) {
        romanNumeral += key;
        arabicNumeral -= value;
      }
    }

    return romanNumeral;
  }

  private static boolean isInRange(int arabicNumeral) {
    return arabicNumeral > 0 && arabicNumeral < 4000;
  }

  public static String romanToArabic(String romanNumeral) {
    if (!isRomanNumeral(romanNumeral)) {
      throw new IllegalArgumentException(
        "NumeralConverter.romanToArabic() expects a valid Roman numeral."
      );
    }

    romanNumeral = romanNumeral.toUpperCase();
    int arabicNumeral = 0;

    while (romanNumeral.length() > 0) {
      String firstPair = romanNumeral.substring(0, 2);

      if (numeralMap.containsKey(firstPair)) {
        arabicNumeral += numeralMap.get(firstPair);
        romanNumeral = romanNumeral.substring(2);
      } else {
        String firstChar = romanNumeral.substring(0, 1);
        arabicNumeral += numeralMap.get(firstChar);
        romanNumeral = romanNumeral.substring(1);
      }
    }

    return Integer.toString(arabicNumeral);
  }

  private static boolean isRomanNumeral(String string) {
    String romanNumeral =
      "(?i)" +               // Case-insensitive
      "^(?=.)" +             // Don't match empty string
      "M{0,3}" +             // Thousands
      "(?:D?C{0,3}|CM|CD)" + // Hundreds
      "(?:L?X{0,3}|XC|XL)" + // Tens
      "(?:V?I{0,3}|IX|IV)$"  // Ones
    ;

    return string.matches(romanNumeral);
  }
}
