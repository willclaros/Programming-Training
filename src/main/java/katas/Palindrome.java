package katas;

public class Palindrome {

    /**
     * This method identifies if a word is palindrome.
     *
     * @param word any word that you need to check
     * @return the method returns a boolean value that indicate if the word is palindrome or not palindrome.
     */
    public boolean isPalindrome(String word) {
        return new StringBuilder(word.toLowerCase()).reverse().toString().equals(word.toLowerCase());
    }
}
