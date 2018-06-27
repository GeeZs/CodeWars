package CodeWars;

public class JosephusSurvivor {
    private static int josephusSurvivor(final int n, final int k) {
        if (n == 1) {
            return 1;
        }
        return (josephusSurvivor(n - 1, k) + k - 1) % n + 1;
    }

    public static void main(String[] args) {
        System.out.println(josephusSurvivor(7, 3));
    }
}
