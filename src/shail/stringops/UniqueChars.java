package shail.stringops;

import java.util.*;
import java.util.stream.Collectors;

public class UniqueChars {

    public static void main(String args[])
    {
        System.out.println(areAllCharactersUnique("Blaah bluee   bleeeABC"));
        System.out.println(areAllCharactersUnique("ABC"));
        System.out.println(areAllCharactersUnique(""));
    }

    public static boolean areAllCharactersUnique(String str){

        if(str == null || str.length()==0) return true;

        boolean arr[] = new boolean[256];

        for(int i =0 ; i < str.length();i++)
        {
            if(arr[str.charAt(i)])
            {
                return false;
            }
            arr[str.charAt(i)] = true;

        }

        return true;

    }
}
