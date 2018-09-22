package shail.stringops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class RemoveDuplicatesAndSort {

    public static void main(String args[])
    {
        System.out.println(removeDuplicates(Arrays.asList("Red", "Yellow", "Red", "Red", "Yellow")));

        System.out.println(removeDuplicatesAlt(Arrays.asList("Red", "Yellow", "Red", "Red", "Yellow")));
    }


    public static ArrayList<String> removeDuplicates(List<String> input) {

        return input.stream().distinct().sorted().collect(Collectors.toCollection(ArrayList::new));
    }

    public static ArrayList<String> removeDuplicatesAlt(List<String> input) {

        return new ArrayList<>(new TreeSet<>(input));
    }
}
