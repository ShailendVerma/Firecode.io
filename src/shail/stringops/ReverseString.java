package shail.stringops;

public class ReverseString {

    public static void main(String args[])
    {
        System.out.println(reverseString("Blaah bluee   bleeeABC"));
    }

    public static String reverseString(String str){
        String inputString = str;
        String outputString = null;

        if(str == null || str.length() == 0) return str;


        int len = str.length();
        char[] arr = new char[len];

        for(int i = len-1; i >=0 ; i--)
        {
            arr[len - i - 1] =  str.charAt(i);
        }

        outputString = new String(arr);

        return outputString;
    }
}
