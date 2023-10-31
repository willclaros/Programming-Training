package katas;

public class Palindrome {

    public boolean isPalindrome(String word) {
        return new StringBuilder(word.toLowerCase()).reverse().toString().equals(word.toLowerCase());
    }
}
