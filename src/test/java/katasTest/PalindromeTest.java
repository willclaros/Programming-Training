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
        String word = "oruro";
        boolean actualResult = wordPalindrome.isPalindrome(word);
        Assertions.assertTrue(actualResult);
    }

    @Test
    public void negativeTestPalindrome() {
        String word = "biblioteca";
        boolean actualResult = wordPalindrome.isPalindrome(word);
        Assertions.assertFalse(actualResult);
    }

}