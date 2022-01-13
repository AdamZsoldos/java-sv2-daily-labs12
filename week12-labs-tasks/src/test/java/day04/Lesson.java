package day04;

public class Lesson {

    private final String tutorName;
    private final String courseName;
    private final String className;
    private final int lessonsPerWeek;

    public Lesson(String tutorName, String courseName, String className, int lessonsPerWeek) {
        this.tutorName = tutorName;
        this.courseName = courseName;
        this.className = className;
        this.lessonsPerWeek = lessonsPerWeek;
    }

    public String getTutorName() {
        return tutorName;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getClassName() {
        return className;
    }

    public int getLessonsPerWeek() {
        return lessonsPerWeek;
    }
}
