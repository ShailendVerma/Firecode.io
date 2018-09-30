package shail.misc;

public class BetterFibo {

    public static void main(String args[]){
        System.out.println(betterFibonacci(3));
        System.out.println(betterFibonacci(2));
        System.out.println(betterFibonacci(1));
        System.out.println(betterFibonacci(0));
    }


    public static int betterFibonacci(int n) {
        if(n < 2 ) return n;
        int nMinTwo = 0;
        int nMinOne = 1;
        for(int i = 1; i  < n ;i++)
        {
            int current = nMinOne +nMinTwo;
            nMinTwo = nMinOne;
            nMinOne = current;

        }

        return nMinOne;
    }
}
