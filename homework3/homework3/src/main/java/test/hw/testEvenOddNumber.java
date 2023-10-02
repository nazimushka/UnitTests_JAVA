package test.hw;

import hw.MainHW;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testEvenOddNumber {
    private MainHW mainHW;
    @BeforeEach
    public void beforeEach() {
        mainHW = new MainHW();
    }

    @Test
    public void testEvenNumber() {
        assertTrue(mainHW.evenOddNumber(4));
    }

    @Test
    public void testOddNumber() {
        assertFalse(mainHW.evenOddNumber(5));
    }
}