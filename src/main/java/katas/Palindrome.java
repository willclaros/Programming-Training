/*
 *
 *  * @(#)Palindrome.java
 *  *
 *  * Copyright (c) 2018 Training Foundation.
 *  * 1234 Av America, Colquiri Sud, Cochabamba, Bolivia.
 *  * All rights reserved.
 *  *
 *  * This software is the confidential and proprietary information of
 *  * Jala Foundation, ("Confidential Information").  You shall not
 *  * disclose such Confidential Information and shall use it only in
 *  * accordance with the terms of the license agreement you entered into
 *  * with Training Foundation.
 *
 */

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
