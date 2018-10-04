package CodeWars.six;

public class FindOutlier {
    private static int find(int[] integers){
        int odd = 0, even = 0, temporary = 0;

        for (int integer : integers) {
            if (integer % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        if (even > odd){
            for (int integer : integers) {
                if (integer % 2 != 0) {
                    temporary = integer;
                }
            }
        }else {
            for (int integer : integers) {
                if (integer % 2 == 0) {
                    temporary = integer;
                }
            }
        }

        return temporary;
    }

    public static void main(String[] args) {
        int[] exampleTest1 =  {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781};
        System.out.println(find(exampleTest1));
    }
}
