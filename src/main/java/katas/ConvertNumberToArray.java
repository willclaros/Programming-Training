/*
 *   @(#) ConvertNumberToArray.java
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
 *   @version 30 January 2024
 *
 */

package katas;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class ConvertNumberToArray {

    /**
     * Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
     * Example: 35231 --> [1,3,2,5,3]
     *
     * @param number this a random number.
     * @return this method returns an array from int type
     */
    public int[] digitize(long number) {
        String newNumber = String.valueOf(new StringBuilder(String.valueOf(number)).reverse());
        int [] arrayAux = new int[newNumber.length()];
        for (int i = 0; i<newNumber.length();i++){
            arrayAux[i]= Character.getNumericValue(newNumber.charAt(i));
        }
        return arrayAux;
    }
}
