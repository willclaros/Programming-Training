package katasTest;

import katas.Palindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PalindromeTest {

    public Palindrome wordPalindrome;

    @BeforeEach
    public void setUp() {
        wordPalindrome = new Palindrome();
    }

    @Test
    public void positiveTestPalindrome() {
        String word = "level";
        boolean actualResult = wordPalindrome.isPalindrome(word);
        Assertions.assertTrue(actualResult);
    }

    @Test
    public void negativeTestPalindrome() {
        String word = "library";
        boolean actualResult = wordPalindrome.isPalindrome(word);
        Assertions.assertFalse(actualResult);
    }

}