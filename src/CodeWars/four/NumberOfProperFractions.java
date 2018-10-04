package CodeWars.four;

import java.util.*;

public class NumberOfProperFractions {
    public static long properFractions(long n) {
        if (n == 1){
            return 0;
        }

        List<Long> arr = new ArrayList<>();
        for (long i = 2; i < n; i++) {
            if (n % i == 0){
                arr.add(i);
            }
        }
        if (n > 1) {
            arr.add(n);
        }

        for (Long num : arr) {
            n -= n/num;
        }

        return n ;
    }

    public static void main(String[] args) {
        System.out.println(properFractions(15));
    }
}
