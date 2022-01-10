package day01;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class RunningOperationsTest {

    RunningOperations operations = new RunningOperations();

    @Test
    void testGetTotalDistanceByMonth() {
        assertEquals(41.2, operations.getTotalDistanceByMonth(2021, Month.DECEMBER, Path.of("src/test/resources/running.csv")));
    }

    @Test
    void testGetTotalDistanceByMonthWithInvalidPath() {
        assertThrows(IllegalStateException.class, () -> operations.getTotalDistanceByMonth(2021, Month.DECEMBER, Path.of("src/test/resources/running_.csv")), "Cannot read file");
    }
}
