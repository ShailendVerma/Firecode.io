package shail.searchsort;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GetNonDuplicates {


    public static void main(String args[])
    {
        System.out.println(getNonDuplicate(new int[]{1,1,1,3,3,5,5,4,2,2,2,6}));
    }

    @SuppressWarnings("ConstantConditions")
    public static int getNonDuplicate(int[] A){

        return Arrays.stream(A).boxed()
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1).map(Map.Entry::getKey)
                .findFirst().orElse(null);

    }

}
