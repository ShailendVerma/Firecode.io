package shail.stringops;

public class CompressString {

    public static void main(String args[]){
        System.out.println(compressString("GaaabbbbbccccDEF"));
    }

    public static String compressString(String text) {

        Character lastUniqChar = 0;
        int count = 0;
        StringBuilder build = new StringBuilder();

        for(char c: text.toCharArray())
        {
            if(lastUniqChar != c)
            {
                if(lastUniqChar != 0) {
                    build.append(lastUniqChar.toString());
                    if(count > 1)build.append(count);
                }
                lastUniqChar = c;
                count = 1;

            }else{
                count++;
            }

        }


        build.append(lastUniqChar.toString());
        if(count > 1)build.append(count);


        return build.toString();

    }
}
