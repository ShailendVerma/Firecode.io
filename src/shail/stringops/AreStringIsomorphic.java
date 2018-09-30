package shail.stringops;

import java.util.HashMap;
import java.util.Map;

public class AreStringIsomorphic {

    public static void main(String args[])
    {
        System.out.println(isIsomorphic("BaaB","xAAw"));
    }

    public static boolean isIsomorphic(String input1, String input2) {

        if(input1 == null || input2 == null || input1.length() != input2.length()) return false;
        Map<Character,Character> mappings = new HashMap<>();
        Map<Character,Character> mappingsRev = new HashMap<>();

        for(int i = 0 ; i < input1.length() ; i++)
        {
            Character correspChar = mappings.get(input1.charAt(i));
            Character origChar = mappingsRev.get(input2.charAt(i));

            if(correspChar != null && correspChar != input2.charAt(i))
            {
                return false;
            }

            if(origChar != null && origChar != input1.charAt(i))
            {
                return false;
            }

            mappings.put(input1.charAt(i),input2.charAt(i));
            mappingsRev.put(input2.charAt(i),input1.charAt(i));

        }

        return true;

    }

}
