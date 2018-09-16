package shail.searchsort;

public class FindMissingNumber {

    public static void main(String args[]) {
        System.out.println(findMissingNumber(new int[]{1,2,3,5,6,7,8,9,10}));
    }

    public static int findMissingNumber(int[] arr) {

        int total = 0;
        int sum = 0;

        for (int i =0; i<= 10; i++)
        {
            total += i;
        }

        for(int i=0; i< arr.length;i++)
        {
            sum += arr[i];
        }


        return total - sum;


    }

}
