package shail.misc;

public class RecursiveFibo {

    public static void main(String args[])
    {
        System.out.println(fib(5));
    }

    public static int fib(int n) {


        if(n == 0 || n == 1 ) return n;

        int sum = fib(n -1)+fib(n-2);

        System.out.println(n +"->"+sum);

        return sum;


    }




}
