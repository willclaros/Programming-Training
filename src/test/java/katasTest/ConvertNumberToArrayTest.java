
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
    public void positiveTestPalindrome() {
        long number = 6892365;
        int[] actualResult = convertNumberToArray.digitize(number);
        int[] expectedResult = {5, 6, 3, 2, 9, 8, 6};
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void negativeTestPalindrome() {
        long number = 159;
        int[] actualResult = convertNumberToArray.digitize(number);
        int[] expectedResult = {9, 5, 1};
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}
