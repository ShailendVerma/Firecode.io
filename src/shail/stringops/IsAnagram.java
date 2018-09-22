package shail.stringops;

import java.util.Arrays;

public class IsAnagram {

    public static void main(String args[])
    {
        System.out.println(isAnagram("hello","helal"));
    }

    public static boolean isAnagram(String input1, String input2) {

        if(input1 == null || input2 == null || input1.length() == 0 || input2.length() == 0) return false;

        int[] buffer = new int[26];

         for(int i =0; i< input1.length();i++)
         {
             buffer[input1.charAt(i) - 'a'] ++;
             buffer[input2.charAt(i) - 'a'] --;
         }

        return !Arrays.stream(buffer).filter(i -> i !=0).findAny().isPresent();
    }
}
