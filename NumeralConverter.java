import java.util.LinkedHashMap;

final class NumeralConverter {
  private NumeralConverter() {}

  private final static LinkedHashMap<String, Integer> romanNumerals;

  static {
    romanNumerals = new LinkedHashMap<>();

    romanNumerals.put("M", 1000);
    romanNumerals.put("CM", 900);
    romanNumerals.put("D",  500);
    romanNumerals.put("CD", 400);
    romanNumerals.put("C",  100);
    romanNumerals.put("XC",  90);
    romanNumerals.put("L",   50);
    romanNumerals.put("XL",  40);
    romanNumerals.put("X",   10);
    romanNumerals.put("IX",   9);
    romanNumerals.put("V",    5);
    romanNumerals.put("IV",   4);
    romanNumerals.put("I",    1);
  }

  public static String romanToArabic(String romanNumeral) {
    int arabicNumeral = 0;

    while (romanNumeral.length() > 0) {
      String firstChar = romanNumeral.substring(0, 1);
      String firstPair = romanNumeral.substring(0, 2);

      if (romanNumerals.containsKey(firstPair)) {
        arabicNumeral += romanNumerals.get(firstPair);
        romanNumeral = romanNumeral.substring(2);
      } else if (romanNumerals.containsKey(firstChar)) {
        arabicNumeral += romanNumerals.get(firstChar);
        romanNumeral = romanNumeral.substring(1);
      }
    }

    return Integer.toString(arabicNumeral);
  }
}
