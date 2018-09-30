package shail.searchsort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String args[])
    {
        System.out.println(Arrays.toString(merge(new int[]{1,2}, new int[]{1, 4, 7})));
        System.out.println(Arrays.toString(merge(new int[]{1,2,2,3,6}, new int[]{1, 4, 7})));
        System.out.println(Arrays.toString(merge(new int[]{1, 4, 7},new int[]{1,2,2,3,6})));
        System.out.println(Arrays.toString(merge(new int[]{}, new int[]{1, 4, 7})));
        System.out.println(Arrays.toString(merge(null, new int[]{1, 4, 7})));
        System.out.println(Arrays.toString(merge(new int[]{1, 4, 7},null)));
    }


    public static int[] merge(int[] arrLeft, int[] arrRight){

        if(arrLeft == null) return arrRight;
        if(arrRight == null) return arrLeft;

        int arrResult[] = new int[arrLeft.length + arrRight.length];
        int lIndex = 0, rIndex = 0;

        for(int i = 0 ;i < arrResult.length;i++)
        {
            if(lIndex >= arrLeft.length || (rIndex < arrRight.length && (arrLeft[lIndex] > arrRight[rIndex])))
            {
                arrResult[i] = arrRight[rIndex];
                rIndex++;
            } else if(rIndex >= arrRight.length ||  arrLeft[lIndex] <= arrRight[rIndex])
            {
                arrResult[i] = arrLeft[lIndex];
                lIndex++;
            }

        }

        return arrResult;


    }
}
