package shail.searchsort;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {

    public static void main(String args[]) {
        int[] val = bubbleSortArray(new int[]{56,1, 2, 3, 2, 3, 43, 4, 54, 5, 6});
        for(int i=0; i < val.length ;i++)
        {
            System.out.print("["+val[i]+"]");
        }

    }

    public static int[] bubbleSortArray(int[] arr){

        boolean swapped = true;
        while(arr != null && swapped) {
            swapped = false;
            for (int i =0 ; i < arr.length - 1;i++){

                if(arr[i] > arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = true;
                }

            }
        }
        return arr;
    }

}
