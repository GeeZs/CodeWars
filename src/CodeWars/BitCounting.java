package CodeWars;

public class BitCounting {
    private static int countBits(int n){
        // Show me the code!
        int count = 0;
        char[] binRepresentation = Integer.toBinaryString(n).toCharArray();
        for (char aBinRepresentation : binRepresentation) {
            if (aBinRepresentation == '1') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countBits(4));
    }

}
