package CodeWars.five;

import java.util.*;

public class JosephusPermutation {
    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        List<T> result = new ArrayList<>();
        int index = 0;
        List<Integer> people = new ArrayList<>(items.size());
        for(int i = 0;i < items.size();i++){
            people.add(i);
        }

        while(people.size() > 0){
            index = (index + k - 1) % people.size();
            result.add(items.get(people.get(index)));
            people.remove(index);
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
