package shail.misc;

public class NthPower {

    public static void main(String args[])
    {
        System.out.println(pow(5,12));
        System.out.println(pow(5,-2));
        System.out.println(pow(5,0));
    }

    public static double pow(double x, int n) {

        if(n == 0) return 1;

        return (n < 0)? (1/x) * pow(x,  n +1 ): x * pow(x , n -1);

    }
}
