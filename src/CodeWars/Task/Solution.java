package CodeWars.Task;

import java.util.*;
import java.util.stream.Collectors;

/**
 * The case is the sorting checkList from:
 * 8 5 5 3 3 1 3
 * to
 * 1 8 5 5 3 3 3
 */

public class Solution {
    private static List<Integer> checkList = Arrays.asList(8, 5, 5, 3, 3, 1, 3);

    private static void customSort(List<Integer> arr){
        Set<Integer> mySet = new HashSet<>(arr);
        Map<Integer, List<Integer>> myMap = new HashMap<>();

        mySet = mySet.stream().sorted(Comparator.comparing(Integer::valueOf)).collect(Collectors.toSet());
        mySet.forEach(System.out::print);

        System.out.println();

        for (Integer i : mySet) {
            myMap.put(i, arr.stream().filter(x -> x.equals(i)).collect(Collectors.toList()));
        }
        List<Integer> tmp = new ArrayList<>();

        myMap = myMap.entrySet().stream()
                .sorted(Comparator.comparingInt(x -> x.getValue().size()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a,b) -> {
                            throw new AssertionError();
                        }, LinkedHashMap::new
                ));

        for (Map.Entry<Integer, List<Integer>> map: myMap.entrySet()){
            tmp.addAll(map.getValue());
        }

        tmp.forEach(System.out::print);
    }

    public static void printArr(List<Integer> arr){
        for (Integer anArr : arr) {
            System.out.print(anArr + " ");
        }
    }


    public static void main(String[] args) {
        customSort(checkList);
    }
}
