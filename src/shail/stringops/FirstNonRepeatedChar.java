package shail.stringops;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {

    public static void main(String args[])
    {
        System.out.println(firstNonRepeatedCharacter("aaaa"));
    }


    public static Character firstNonRepeatedCharacter(String str) {

        Map<Character,Boolean> seqMap = new LinkedHashMap<>();

        for(char c: str.toCharArray())
        {
            seqMap.put(c, ( seqMap.get(c) == null));
        }

        return seqMap.entrySet().stream().filter(Map.Entry::getValue).map(Map.Entry::getKey).findFirst().orElse(null);

    }
}
