package shail.stringops;

public class ReverseInt {
    public static void main(String args[])
    {
        System.out.println(reverseInt(1214));
        System.out.println(reverseInt(-1214));
    }


    public static int reverseInt(int x)  {
        int revInt = 0;


        while (x != 0)
        {
            revInt = revInt*10 + x%10;
            x = x/10;
        }

        return revInt;

    }
}
