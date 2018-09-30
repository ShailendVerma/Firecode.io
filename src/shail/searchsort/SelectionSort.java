package shail.searchsort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String args[])
    {
        System.out.println(Arrays.toString(selectionSortArray(new int[]{6,7,1,2})));
        System.out.println(Arrays.toString(selectionSortArray(new int[]{7,9,2,2,3,6})));
        System.out.println(Arrays.toString(selectionSortArray(new int[]{1,2,2,3,6})));
        System.out.println(Arrays.toString(selectionSortArray(new int[]{})));
        System.out.println(Arrays.toString(selectionSortArray(null)));
        System.out.println(Arrays.toString(selectionSortArray(new int[]{8,1, 4, 7})));
    }

    public static int[] selectionSortArray(int[] arr){
        if(arr == null || arr.length < 2) return arr;

        for(int i =0 ; i < arr.length; i ++)
        {
            //Find value smallest from current point and swap
            int minIndex = i;
            for(int j =i +1; j < arr.length ;j++ )
            {
                if(arr[minIndex] > arr[j])
                {
                    minIndex = j;
                }

            }
            //Swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}
