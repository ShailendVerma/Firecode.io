package shail.stringops;

public class IsIntPalidrome {


    public static void main(String args[])
    {
        System.out.println(isIntPalindrome(1214));
    }


    public static Boolean isIntPalindrome(int x) {

        if(x < 0) return false;
        int revInt = 0;
        int orig = x;
        while (x > 0)
        {
            revInt = revInt*10 + x%10;
            x = x/10;
        }

        return ((orig - revInt) == 0);

    }
}
