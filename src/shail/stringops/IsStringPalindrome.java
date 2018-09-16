package shail.stringops;

public class IsStringPalindrome {

    public static void main(String args[])
    {
        System.out.println(isStringPalindrome("BaaB"));
    }

    public static boolean isStringPalindrome(String str){

        if(str == null || str.length() == 0) return true;

        int len = str.length();

        for(int i = 0 ; i < len /2 ; i++)
        {
            System.out.println(str.charAt(i)+","+str.charAt(len - i -1));
            if(str.charAt(i) != str.charAt(len -i -1))
            {
                return false;
            }
        }

        return true;

    }

}
