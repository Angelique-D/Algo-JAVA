import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void testFizzBuzz() {
        Assertions.assertEquals("0", StringUtils.fizzBuzz(0));
        Assertions.assertEquals("1", StringUtils.fizzBuzz(1));
        Assertions.assertEquals("2", StringUtils.fizzBuzz(2));
        Assertions.assertEquals("Fizz", StringUtils.fizzBuzz(3));
        Assertions.assertEquals("4", StringUtils.fizzBuzz(4));
        Assertions.assertEquals("Buzz", StringUtils.fizzBuzz(5));
        Assertions.assertEquals("Fizz", StringUtils.fizzBuzz(6));
        Assertions.assertEquals("Buzz", StringUtils.fizzBuzz(10));
        Assertions.assertEquals("FizzBuzz", StringUtils.fizzBuzz(15));
    }

    @Test
    void testFirstName() {
        Assertions.assertEquals("Jean", StringUtils.FirstName("jean"));
        Assertions.assertEquals("Jean", StringUtils.FirstName("JEAN"));
        Assertions.assertEquals("Jean Pierre", StringUtils.FirstName("jean pierre"));
        Assertions.assertEquals("Jean-Pierre", StringUtils.FirstName("JEAN-PIERRE"));
    }

    @Test
    void testNbVowel() {
        Assertions.assertEquals(1, StringUtils.NbVowel("a"));
        Assertions.assertEquals(2, StringUtils.NbVowel("JAMBON"));
        Assertions.assertEquals(4, StringUtils.NbVowel("Alexandre"));
    }

    @Test
    void NbConsonants() {
        Assertions.assertEquals(1, StringUtils.NbConsonant("b"));
        Assertions.assertEquals(6, StringUtils.NbConsonant("Jean-Michel"));
        Assertions.assertEquals(3, StringUtils.NbConsonant("BANANE"));
    }

    @Test
    void NbLetter() {
        Assertions.assertEquals(1, StringUtils.NbLetter("b"));
        Assertions.assertEquals(10, StringUtils.NbLetter("Jean-Michel"));
        Assertions.assertEquals(6, StringUtils.NbLetter("BANANE"));
    }

    @Test
    void NbSpace() {
        Assertions.assertEquals(0, StringUtils.NbSpace("b"));
        Assertions.assertEquals(1, StringUtils.NbSpace("Jean Michel"));
        Assertions.assertEquals(6, StringUtils.NbSpace("P E A N U T S"));
    }

    @Test
    void NbWord() {
        Assertions.assertEquals(1, StringUtils.NbWord("b"));
        Assertions.assertEquals(2, StringUtils.NbWord("Jean Michel"));
        Assertions.assertEquals(1, StringUtils.NbWord("Jean-Michel"));
        Assertions.assertEquals(5, StringUtils.NbWord("Aweille Julian fait ton test"));
    }

    @Test
    void PalindromeWord() {
        Assertions.assertTrue(StringUtils.IsPalindrome("b"));
        Assertions.assertTrue(StringUtils.IsPalindrome("Kayak"));
        Assertions.assertFalse(StringUtils.IsPalindrome("Jean-Michel"));
        Assertions.assertTrue(StringUtils.IsPalindrome("été"));
        Assertions.assertTrue(StringUtils.IsPalindrome("A man, a plan, a canal, Panama"));
        Assertions.assertFalse(StringUtils.IsPalindrome("J'ai fait du kayak cet été"));
    }

}