package day01;

import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class RunningOperations {

    public double getTotalDistanceByMonth(int year, Month month, Path path) {
        try (Scanner scanner = new Scanner(path)) {
            return getTotalDistanceByMonthFromScanner(year, month, scanner);
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file", e);
        }
    }

    private double getTotalDistanceByMonthFromScanner(int year, Month month, Scanner scanner) {
        double sum = 0;
        scanner.nextLine();
        while (scanner.hasNextLine()) {
            sum += getDistanceByMonth(year, month, scanner.nextLine());
        }
        return sum;
    }

    private double getDistanceByMonth(int year, Month month, String line) {
        String[] parts = line.split(";");
        if (matchesMonth(year, month, parts[1])) {
            return Double.parseDouble(parts[0].split(" ")[0]);
        }
        return 0;
    }

    private boolean matchesMonth(int year, Month month, String dateString) {
        LocalDate date = LocalDate.parse(dateString);
        return date.getYear() == year && date.getMonth() == month;
    }
}
