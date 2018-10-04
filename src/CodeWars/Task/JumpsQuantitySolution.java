package CodeWars.Task;

public class JumpsQuantitySolution {

    private static int calculateJumps(int jumpSize, int distance){
        int result = 0;
        while (distance >= jumpSize){
            distance -= jumpSize;
            result++;
        }
        return distance + result;
    }

    public static void main(String[] args) {
        System.out.println(calculateJumps(5,14));
    }
}
