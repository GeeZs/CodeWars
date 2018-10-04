package CodeWars.four;

public class StripComments {

    public static String stripComments(String text, String[] commentSymbols) {
        String[] lines = text.split("\n");
        int f;
        for (int i = 0; i < lines.length; i++) {
            for (String commentSymbol : commentSymbols) {
                if ((f = lines[i].indexOf(commentSymbol)) != -1) {
                    lines[i] = lines[i].substring(0, f);
                }
                lines[i]=lines[i].replaceAll("\\s+$", "");
            }
        }
        return String.join("\n", lines);
    }

}