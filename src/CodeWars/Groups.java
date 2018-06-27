package CodeWars;

import java.util.LinkedList;

public class Groups {
    private static boolean groupCheck(String s){
        if (s.isEmpty()){ return true;}
        if (s.length()%2 != 0){ return false;}

        LinkedList<Character> correctSequence = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                correctSequence.addLast(s.charAt(i));
            }else if (s.charAt(i) == ']' || s.charAt(i) == ')' || s.charAt(i) == '}'){
                switch (s.charAt(i)){
                    case ']': if (correctSequence.getLast() != '['){ return false;} break;
                    case ')': if (correctSequence.getLast() != '('){ return false;} break;
                    case '}': if (correctSequence.getLast() != '{'){ return false;} break;
                }
                correctSequence.removeLast();
            }
        }
        return correctSequence.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(groupCheck("{{]}"));

    }
}
    /*public static boolean groupCheck(String s) {
        int len;
        do {
            len = s.length();
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        } while (len != s.length());
        return s.length() == 0;
    }*/