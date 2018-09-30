package shail.stringops;

public class InsertPairStar {

    public static void main(String args[]){

        System.out.println(insertPairStarAlt("Bubblaaah"));
        System.out.println(insertPairStarAlt(null));
        System.out.println(insertPairStarAlt("c"));
    }


    public static String insertPairStar(String s) {

        if(s == null ||  "".equals(s) || s.length() ==1)  return s;
        StringBuilder builder = new StringBuilder();
         insertPairRec(s,0,builder);
         return builder.toString();
    }

    public static void insertPairRec(String s, int currIndex,   StringBuilder builder )
    {
        char currentChar = s.charAt(currIndex);

        if(currIndex == s.length()-1)
        {
            builder.append(currentChar);
            return;
        }

        if(currentChar == s.charAt(currIndex+1))
        {
            builder.append(currentChar);
            builder.append("*");

        }else{
            builder.append(currentChar);
        }
        insertPairRec(s,currIndex+1,builder);

    }

    public static String insertPairStarAlt(String s) {

        if(s == null ||  "".equals(s) || s.length() ==1)  return s;

        return s.substring(0,1)
                + ((s.charAt(0) == s.charAt(1))?"*":"")
                + insertPairStarAlt(s.substring(1));
    }
}
