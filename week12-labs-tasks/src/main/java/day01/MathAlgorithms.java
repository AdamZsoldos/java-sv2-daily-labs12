package day01;

public interface MathAlgorithms {

    static int getGreatestCommonDivisor(int a, int b) {
        for (int i = Integer.min(a, b) / 2; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        throw new IllegalArgumentException("No common divisor");
    }
}
