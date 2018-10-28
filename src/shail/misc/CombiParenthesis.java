package shail.misc;

import java.util.ArrayList;

public class CombiParenthesis {

    public static void main(String args[]){
        System.out.println(combParenthesis(3));
    }


    public static ArrayList<String> combParenthesis(int pairs) {

        ArrayList<String> val = new ArrayList<>();
        StringBuilder build = new StringBuilder();
        for(int i = 0; i < pairs; i++)
        {
            build.append("()");
        }
        val.add(build.toString());

        if(pairs >=2) {
            swapRec(build, 1, build.length() - 2, val);
        }
        return val;

    }

    public static StringBuilder swapRec(StringBuilder builder,int start,int end, ArrayList<String> val)
    {
        if(start > end) return builder;

        if(builder.charAt(start) != builder.charAt(end))
        {
            char temp = builder.charAt(end);
            builder.setCharAt(end,builder.charAt(start));
            builder.setCharAt(start,temp);
            System.out.println(start+","+end+" : " +builder.toString());
            if(!val.contains(builder.toString())){
                val.add(builder.toString());
            }

        }

        swapRec(builder,start+1,end,val);
        swapRec(builder,start,end-1,val);
        return builder;
    }



}
