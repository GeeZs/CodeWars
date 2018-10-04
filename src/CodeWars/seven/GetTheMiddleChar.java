package CodeWars.seven;

public class GetTheMiddleChar {
    private static String getMiddle(String word){
        int position;
        if (word.length() % 2 == 0){
            position = word.length() / 2 - 1;
            return word.substring(position, position + 2);
        }else {
            position = word.length() / 2;
            return word.substring(position, position + 1);
        }
    }

    public static void main(String[] args) {
        String eva = "fingerstyle";
        System.out.println(getMiddle(eva));
    }
}
