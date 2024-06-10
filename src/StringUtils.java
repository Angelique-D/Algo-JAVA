import java.text.Normalizer;
import java.util.regex.Pattern;

public class StringUtils {
    public static String fizzBuzz(int value) {
       if (value == 0) return "0";
       if (value % 15 == 0) return "FizzBuzz";
       if (value % 3 == 0) return "Fizz";
       if (value % 5 == 0) return "Buzz";
       return String.valueOf(value);
    }

    public static String FirstName(String stringOfCaracters) {
        String firstName = stringOfCaracters.substring(0, 1).toUpperCase();

        for (int i = 1; i < stringOfCaracters.length(); i++) {
            String previousLetter = stringOfCaracters.substring(i - 1, i);

            if (" -".contains(previousLetter)) {
                firstName += stringOfCaracters.substring(i, i + 1);
            } else {
                firstName += stringOfCaracters.substring(i, i + 1);
            }
        }
        return firstName;
    }

    public static int NbVowel(String stringOfCaracters) {
        String vowel = "aeiouAEIOU";
        int sumOfVowels = 0;

        for (int i = 0; i < stringOfCaracters.length(); i++) {
            if (vowel.indexOf(stringOfCaracters.charAt(i)) != -1) {
                sumOfVowels++;
            }
        }
        return sumOfVowels;
    }

    public static int NbConsonant(String stringOfCaracters) {
        int sumOfConsonants = 0;
        String vowel = "aeiouAEIOU";
        for (int i = 0; i < stringOfCaracters.length(); i++) {
            if (vowel.indexOf(stringOfCaracters.charAt(i)) == -1 && stringOfCaracters.charAt(i) != '-') {
                sumOfConsonants++;
            }
        }
        return sumOfConsonants;
    }

    public static int NbLetter(String stringOfCaracters) {
        int sumOfLetters = 0;
        for (int i = 0; i < stringOfCaracters.length(); i++) {
            if (stringOfCaracters.charAt(i) != '-' && stringOfCaracters.charAt(i) != '.' && stringOfCaracters.charAt(i) != ' ') {
                sumOfLetters++;
            }
        }
        return sumOfLetters;
    }

    public static int NbSpace(String stringOfCaracters) {
        int sumOfSpaces = 0;

        for (int i = 0; i < stringOfCaracters.length(); i++) {
            char currentChar = stringOfCaracters.charAt(i);

            if (currentChar == ' ') {
                sumOfSpaces++;
            }
        }
        return sumOfSpaces;
    }

    public static int NbWord(String stringOfCaracters) {
        int sumOfWords = 0;
        boolean inWord = false;

        for (int i = 0; i < stringOfCaracters.length(); i++) {

            char currentChar = stringOfCaracters.charAt(i);

            if (Character.isLetter(currentChar) || currentChar == '-') {
                if (!inWord) {
                    sumOfWords++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        return sumOfWords;
    }

    private static boolean PalindromeWord(String stringOfCaracters) {
        String reversedString = new StringBuilder(stringOfCaracters).reverse().toString();
        return stringOfCaracters.equals(reversedString);
    }

    public static boolean IsPalindrome(String sentence) {
        sentence = sentence.trim();
        sentence = removeAccents(sentence);
        sentence = sentence.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        return PalindromeWord(sentence);

    }

    private static String removeAccents(String value) {
        String normalized = Normalizer.normalize(value, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(normalized).replaceAll("");
    }

}
