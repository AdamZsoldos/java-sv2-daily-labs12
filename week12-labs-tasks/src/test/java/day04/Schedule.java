package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Schedule {

    private final List<Lesson> lessons = new ArrayList<>();

    public List<Lesson> getLessons() {
        return lessons;
    }

    public int totalLessonsPerWeek(String tutorName) {
        int sum = 0;
        for (Lesson lesson : lessons) {
            if (lesson.getTutorName().equals(tutorName)) {
                sum += lesson.getLessonsPerWeek();
            }
        }
        return sum;
    }

    public void addLessonsFromFile(Path path) {
        try {
            addLessonsFromFileLines(Files.readAllLines(path));
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file", e);
        }
    }

    private void addLessonsFromFileLines(List<String> lines) {
        for (int i = 0; i + 3 < lines.size(); i += 4) {
            lessons.add(new Lesson(
                    lines.get(i),
                    lines.get(i + 1),
                    lines.get(i + 2),
                    Integer.parseInt(lines.get(i + 3))
            ));
        }
    }
}
