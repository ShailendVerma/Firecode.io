package shail.misc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HappyNumber {

    public static void main(String args[]) {
       System.out.println(isHappyNumber(45));
        System.out.println(isHappyNumber(451));
        System.out.println(isHappyNumber(19));

    }

    public static boolean isHappyNumber(int n) {

        Set<Integer> visitedNumbers = new HashSet<>();
        int sum = 0;

        while (!visitedNumbers.contains(n)) {
            visitedNumbers.add(sum);
            System.out.println("N =" + n + ", sum ="+sum+ ","+visitedNumbers);

            sum = 0;
            while (n != 0) {
                sum += (n % 10) * (n % 10);
                n = n / 10;
                //System.out.println("-->"+sum);
            }

            //System.out.println("->"+sum);
            if (sum == 1) {
                return true;
            }

            n = sum;
        }

        return false;
    }
}
