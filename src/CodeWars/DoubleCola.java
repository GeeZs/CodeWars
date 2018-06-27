package CodeWars;

public class DoubleCola {
    private static String WhoIsNext(String[] names, int n){
        // Your code is here...
        int nextIteration = names.length;
        int multiplier = 1;
        while (n - nextIteration > 0) {
            n -= nextIteration;
            nextIteration *= 2;
            multiplier *= 2;
        }
        return names[(n - 1) / multiplier];
    }

    public static void main(String[] args) {
        String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
        System.out.println(DoubleCola.WhoIsNext(names, 3));
        System.out.println(9/2);
    }
}
