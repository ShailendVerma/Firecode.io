package shail.misc;

public class IsPowerOfTwo {
    public static void main(String args[])
    {
        System.out.println(isPowOfTwo(12));
        System.out.println(isPowOfTwo(5));
        System.out.println(isPowOfTwo(8));
    }

    //Since o(1) time and o(1) space
    public static boolean isPowOfTwo(int num) {
        return ((num & num-1) == 0 );
    }
}
