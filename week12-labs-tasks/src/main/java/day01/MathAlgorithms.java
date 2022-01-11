package day01;

public class MathAlgorithms {

    private MathAlgorithms() {}

    public static int greatestCommonDivisor(int a, int b) {
        for (int i = Integer.min(a, b); i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        throw new IllegalArgumentException("No common divisor");
    }
}
