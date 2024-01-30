
package katasTest;

import katas.ConvertNumberToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConvertNumberToArrayTest {

    private ConvertNumberToArray convertNumberToArray;

    @BeforeEach
    public void setUp() {
        convertNumberToArray = new ConvertNumberToArray();
    }

    @Test
    public void positiveTestConvertNumberToArray() {
        long number = 6892365;
        int[] actualResult = convertNumberToArray.digitize(number);
        int[] expectedResult = {5, 6, 3, 2, 9, 8, 6};
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void positiveTestConvertNumberToArray2() {
        long number = 0;
        int[] actualResult = convertNumberToArray.digitize(number);
        int[] expectedResult = {0};
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void positiveTestConvertNumberToArray3() {
        long number = 67238;
        int[] actualResult = convertNumberToArray.digitize(number);
        int[] expectedResult = {8, 3, 2, 7, 6};
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void negativeTestConvertNumberToArray() {
        long number = 68726;
        int[] actualResult = convertNumberToArray.digitize(number);
        int[] expectedResult = {6, 8, 7, 2, 6};
        Assertions.assertNotEquals(expectedResult, actualResult);
    }
}
