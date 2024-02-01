/*
 *   @(#) DescendingOrderTest.java
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

package katasTest;

import katas.DescendingOrder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DescendingOrderTest {
    private DescendingOrder descendingOrder;

    @BeforeEach
    public void setUp() {
        descendingOrder = new DescendingOrder();
    }

    @Test
    public void positiveTestDescendingOrder() {
        int number = 594338;
        int actualResult = descendingOrder.descendingOrder(number);
        int expectedResult = 985433;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void positiveTestDescendingOrder2() {
        int number = 791346825;
        int actualResult = descendingOrder.descendingOrder(number);
        int expectedResult = 987654321;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void positiveTestDescendingOrder3() {
        int number = 13579;
        int actualResult = descendingOrder.descendingOrder(number);
        int expectedResult = 97531;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void positiveTestDescendingOrder4() {
        int number = 12121212;
        int actualResult = descendingOrder.descendingOrder(number);
        int expectedResult = 22221111;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void negativeTestDescendingOrder() {
        int number = 1592648;
        int actualResult = descendingOrder.descendingOrder(number);
        int expectedResult = 156491;
        Assertions.assertNotEquals(expectedResult, actualResult);
    }
}
