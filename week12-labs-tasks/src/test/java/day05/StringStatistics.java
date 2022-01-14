package day05;

import java.util.HashMap;
import java.util.Map;

public class StringStatistics {

    private StringStatistics() {}

    public static Map<Character, Integer> countChars(String s) {
        Map<Character, Integer> result = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (result.containsKey(c)) {
                result.put(c, result.get(c) + 1);
            } else {
                result.put(c, 1);
            }
        }
        return result;
    }
}
