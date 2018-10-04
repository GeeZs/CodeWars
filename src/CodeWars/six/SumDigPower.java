package CodeWars.six;

import java.util.ArrayList;
import java.util.List;

public class SumDigPower {
    private static List<Long> sumDigPow(long a, long b) {

        List<Long> resultList = new ArrayList<>();

        for (long i = a; i < b; i++) {
            if (i / 10 == 0){
                resultList.add(i);
            }else {
                long sum = 0;
                char[] temp = Long.toString(i).toCharArray();

                for (int j = 0; j < temp.length; j++) {
                    sum += Math.pow(Long.parseLong(String.valueOf(temp[j])), j+1);
                }
                if (sum == i){
                    resultList.add(i);
                }
            }
        }
        return resultList;
    }

    public static void main(String[] args) {
        System.out.println(sumDigPow(1,150));

    }
}
