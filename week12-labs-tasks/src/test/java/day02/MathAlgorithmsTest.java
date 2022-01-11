package day02;

import day01.MathAlgorithms;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {

    @Test
    void testGetGreatestCommonDivisor() {
        assertEquals(5, MathAlgorithms.greatestCommonDivisor(20, 15));
        assertEquals(10, MathAlgorithms.greatestCommonDivisor(20, 30));
        assertEquals(10, MathAlgorithms.greatestCommonDivisor(20, 10));
    }

    @Test
    void testGetGreatestCommonDivisorNoCommonDivisor() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> MathAlgorithms.greatestCommonDivisor(20, 0));
        assertEquals("No common divisor", e.getMessage());
        e = assertThrows(IllegalArgumentException.class, () -> MathAlgorithms.greatestCommonDivisor(20, -1));
        assertEquals("No common divisor", e.getMessage());
    }
}
