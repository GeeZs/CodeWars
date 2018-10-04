package CodeWars.four;

import java.util.regex.Pattern;

public class BinaryMultipleOfThree {
    public static Pattern multipleOf3() {
        // Regular expression that matches binary inputs that are multiple of 3
        return Pattern.compile("(1(01*0)*1|0)*");
    }
}
