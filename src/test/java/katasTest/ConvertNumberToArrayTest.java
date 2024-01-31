
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
        long number = 59;
        int[] actualResult = convertNumberToArray.digitize(number);
        int[] expectedResult = {9, 5};
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
