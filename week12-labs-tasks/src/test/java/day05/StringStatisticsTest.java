package day05;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StringStatisticsTest {

    @Test
    void testCountChars() {
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 2);
        expected.put('l', 1);
        expected.put('m', 1);
        assertEquals(expected, StringStatistics.countChars("alma"));

        expected = new HashMap<>();
        expected.put('A', 1);
        expected.put('p', 2);
        expected.put('l', 1);
        expected.put('e', 1);
        assertEquals(expected, StringStatistics.countChars("Apple"));
    }
}
