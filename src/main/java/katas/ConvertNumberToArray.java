/*
 *   @(#)" ".java
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
 *   @version 26 January 2024
 *
 */

package katas;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class ConvertNumberToArray {

    public static int[] digitize(long n) {
        String newNumber = String.valueOf(new StringBuilder(String.valueOf(n)).reverse());
        int [] arrayAux = new int[newNumber.length()];
        for (int i = 0; i<newNumber.length();i++){
            arrayAux[i]= Character.getNumericValue(newNumber.charAt(i));
        }
        return arrayAux;
    }

    public static void main(String[] args) {
        long number = 4161;
        System.out.println(Arrays.toString(ConvertNumberToArray.digitize(number)));
    }
}
