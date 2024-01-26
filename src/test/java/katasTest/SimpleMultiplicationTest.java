package katasTest;

import katas.SimpleMultiplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimpleMultiplicationTest {

    public SimpleMultiplication simpleMultiplication;

    @BeforeEach
    public void setUp() {
        simpleMultiplication = new SimpleMultiplication();
    }

    @Test
    public void evenTestSimpleMultiplication() {
        int number = 4;
        int actualResult = simpleMultiplication.simpleMultiplication(number);
        Assertions.assertEquals(32, actualResult);
    }

    @Test
    public void oddTestSimpleMultiplication() {
        int number = 5;
        int actualResult = simpleMultiplication.simpleMultiplication(number);
        Assertions.assertEquals(45, actualResult);
    }
}
