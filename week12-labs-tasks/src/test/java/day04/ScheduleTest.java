package day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class ScheduleTest {

    Schedule schedule = new Schedule();

    @BeforeEach
    void setUp() {
        schedule.addLessonsFromFile(Path.of("src/test/resources/beosztas.txt"));
    }

    @Test
    void testAddLessonsFromFile() {
        assertEquals(3, schedule.getLessons().size());
    }

    @Test
    void testAddLessonsFromFileInvalidPath() {
        Exception e = assertThrows(IllegalStateException.class, () -> schedule.addLessonsFromFile(Path.of("src/test/resources/beosztas_.txt")));
        assertEquals("Cannot read file", e.getMessage());
    }

    @Test
    void testTotalLessonsPerWeek() {
        assertEquals(3, schedule.totalLessonsPerWeek("Albatrosz Aladin"));
        assertEquals(2, schedule.totalLessonsPerWeek("Csincsilla Csilla"));
    }
}
