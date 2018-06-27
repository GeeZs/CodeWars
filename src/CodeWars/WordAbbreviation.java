package CodeWars;
//Word a10n (abbreviation)

public class WordAbbreviation {
    public String abbreviate(String s) {
        String[] words = s.split("[^a-zA-Z]+");
        String[] separators = s.split("[a-zA-Z]+");
        StringBuilder result = new StringBuilder();

        int i = 1;
        for (String word : words) {
            result.append(processWord(word));
            if (i < separators.length) {
                result.append(separators[i++]);
            }
        }
        return result.toString();
    }

    private String processWord(String word) {
        if (word.length() < 4) return word;
        int n = word.length() - 2;
        return "" + word.charAt(0) + n + word.charAt(word.length() - 1);
    }
}
