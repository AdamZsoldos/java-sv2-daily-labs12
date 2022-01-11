package day02;

import day01.MathAlgorithms;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {

    @Test
    void testGetGreatestCommonDivisor() {
        assertEquals(5, MathAlgorithms.getGreatestCommonDivisor(20, 15));
    }

    @Test
    void testGetGreatestCommonDivisorNoCommonDivisor() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> MathAlgorithms.getGreatestCommonDivisor(20, 1));
        assertEquals("No common divisor", e.getMessage());
    }
}
