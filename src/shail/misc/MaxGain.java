package shail.misc;

import java.util.Arrays;

public class MaxGain {

    public static void main(String args[])
    {
        System.out.println(maxGain(new int[]{6,7,1,2,12}));
        System.out.println(maxGain(new int[]{7,9,2,2,3,6}));
        System.out.println(maxGain(new int[]{1,2,2,3,6}));
        System.out.println(maxGain(new int[]{}));
        System.out.println(maxGain(null));
        System.out.println(maxGain(new int[]{8,1}));
        System.out.println(maxGain(new int[]{0,50,10,100,30}));

    }

    public static int maxGain(int[] a) {

        if(a == null || a.length < 2) return 0;

        int maxGain = 0;
        int lastMin = a[0];

        for(int i = 0; i < a.length; i++)
        {
            //If max gain is less than current - last min reset
            if(maxGain < (a[i] -  lastMin)) {
                maxGain = (a[i] - lastMin);
            }

            //if last min < current - set to current
            if(lastMin > a[i])
            {
                lastMin = a[i];
            }

        }

        return  maxGain;


    }
}
