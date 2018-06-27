package CodeWars;

public class Positive {
    public static int sum(int[] arr){
        int res = 0;
        for (int anArr : arr) {
            if (anArr > 0) {
                res += anArr;
            }
        }
        return res;
    }
}
