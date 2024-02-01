/*
 *   @(#) DescendingOrder.java
 *
 *   Copyright (c) 2024 Training Foundation.
 *   1945 Av America, Zona Norte, Cochabamba, Bolivia.
 *   All rights reserved.
 *
 *   This software is the confidential and proprietary information of
 *   Training Foundation, ("Confidential Information").  You shall not
 *   disclose such Confidential Information and shall use it only in
 *   accordance with the terms of the license agreement you entered into
 *   with Training Foundation.
 *
 *   @author Will Claros
 *   @version 01 February 2024
 *
 */

package katas;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {

    /**
     * make a function that can take any non-negative integer as an argument and return it with its digits in
     * descending order. Essentially, rearrange the digits to create the highest possible number.
     * EXAMPLES: Input: 42145 Output: 54421
     *           Input: 123456789 Output: 987654321
     *
     * @param number this a random number.
     * @return this method returns an int that represents the same number with their digits in descending order.
     */
    public int descendingOrder(int number) {
        String numberAux = String.valueOf(number);
        Integer[] arrayNumbers = new Integer[numberAux.length()];

        for (int i = 0; i < numberAux.length(); i++) {
            arrayNumbers[i] = Character.getNumericValue(numberAux.charAt(i));
        }
        Arrays.sort(arrayNumbers, Collections.reverseOrder());

        String answer = "";
        for (Integer integer : arrayNumbers) {
            answer = answer.concat(String.valueOf(integer));
        }
        return Integer.parseInt(answer);
    }
}
