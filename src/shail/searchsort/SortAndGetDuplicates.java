package shail.searchsort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SortAndGetDuplicates {


    public static void main(String args[])
    {
        System.out.println(duplicate(new int[]{1,1,1,3,5,5,4,2,2,2}));
    }

    public static String duplicateStream(int[] numbers){

        Map<String,Long> numCounts =  Arrays.stream(numbers).mapToObj(Integer::toString)
                .collect(Collectors.groupingBy(String::toString,Collectors.counting()));

        System.out.println(numCounts);

        List<String> result = numCounts.entrySet().stream().filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey).sorted().collect(Collectors.toList());

        System.out.println(result);

        return result.toString();
    }

    public static String duplicate(int[] numbers){

        TreeSet<Integer> treeSet = new TreeSet<>();

        Arrays.sort(numbers);

        for(int i=1; i < numbers.length;i++ )
        {
            if(numbers[i -1] == numbers[i])
            {
                treeSet.add(numbers[i]);
            }
        }

        return treeSet.toString();
    }

}
