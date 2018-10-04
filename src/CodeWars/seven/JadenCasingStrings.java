package CodeWars.seven;

public class JadenCasingStrings {
    private String toJadenCase(String phrase) {

        if (phrase == null || phrase.equals("")){
            return null;
        }else {
            char[] charArray = phrase.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] != ' ' && i == 0) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                } else if (charArray[i - 1] == ' ') {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                }
            }
            return String.valueOf(charArray);
        }
    }

    public static void main(String[] args) {
        System.out.println(new JadenCasingStrings().toJadenCase("most trees are blue"));
    }
}
