package CodeWars.eight;

import java.util.Objects;

public class ANeedleInTheHaystack {
    public static String findNeedle(Object[] haystack) {
        String needle = "needle";
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] != null) {
                if (Objects.equals(haystack[i].toString(), needle)) {
                    return "found the needle at position " + i;
                }
            }
        }
        return null;
    }

}
