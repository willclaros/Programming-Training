/*
 *   @(#) SimpleMultiplication.java
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

public class SimpleMultiplication {
    /**
     * @param number is a random number.
     * @return is a product to multiply 8 or 9 by number.
     */
    public int simpleMultiplication(int number) {
        return (number % 2 == 0) ? number * 8 : number * 9;
    }
}
