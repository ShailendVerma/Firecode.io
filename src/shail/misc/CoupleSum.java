package shail.misc;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CoupleSum {

    public static void main(String args[])
    {
        System.out.println(Arrays.toString(coupleSum(new int[]{6,7,1,2},9)));
        System.out.println(Arrays.toString(coupleSum(new int[]{7,9,2,2,3,6},4)));
        System.out.println(Arrays.toString(coupleSum(new int[]{1,2,2,3,6},8)));
        System.out.println(Arrays.toString(coupleSum(new int[]{},0)));
        System.out.println(Arrays.toString(coupleSum(null,0)));
        System.out.println(Arrays.toString(coupleSum(new int[]{8,1},9)));
    }

    public static int[] coupleSum(int[] numbers, int target) {
        if(numbers == null || numbers.length < 2) return new int[2];

        Map<Integer,Integer> revIndex = new HashMap<>();

        //iterate over map values
        for(int firstIndex = 0 ; firstIndex < numbers.length ;firstIndex ++)
        {
            int remainder = target - numbers[firstIndex];
            Integer secondIndex = revIndex.get(remainder);
            if (secondIndex != null) {
                return new int[]{secondIndex +1,firstIndex+1};
            }else{
                revIndex.put(numbers[firstIndex],firstIndex);
            }
        }

        return new int[2];
    }
}
