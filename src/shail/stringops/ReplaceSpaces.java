package shail.stringops;

import java.sql.Array;
import java.util.Arrays;

public class ReplaceSpaces {

    public static void main(String args[])
    {
        System.out.println(replace("Blaah bluee   bleee","ABC"));
    }

    public static String replace(String a, String b) {

        StringBuilder builder = new StringBuilder();

        Arrays.stream(a.split("\\s+")).forEach(e ->
        {   builder.append(e);
            builder.append(b);
        });

        return builder.toString().substring(0,builder.toString().length() - b.length());

    }
}
