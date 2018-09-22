package shail.stringops;

import java.util.Map;
import java.util.stream.Collectors;

public class StringIsPermutation {

    public static void main(String args[])
    {
        System.out.println(permutation("Hello","Helol"));
    }

    public static boolean permutation(String str1, String str2){

        Map<Integer,Long> map1 = str1.chars().boxed().
                collect(Collectors.groupingBy(Integer::new, Collectors.counting()));

        Map<Integer,Long> map2 = str2.chars().boxed().
                collect(Collectors.groupingBy(Integer::new, Collectors.counting()));


        return map1.equals(map2);
    }
}
