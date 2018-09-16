package shail.searchsort;

import static javafx.scene.input.KeyCode.T;

public class BinarySearchAlg {
    public static void main(String args[]) {
        System.out.println(binarySearch(new int[]{1, 1, 1, 2, 2, 2, 3, 5, 8, 9}, 11));
    }

    public static boolean binarySearch(int[] arr, int n) {

        int lIndex = 0;
        int rIndex = arr.length - 1;

        while (lIndex <= rIndex) {

            int m = (int) Math.floor((lIndex + rIndex) / 2);

            if (arr[m] < n) {
                lIndex = m + 1;
            } else if (arr[m] > n) {
                rIndex = m - 1;
            } else {
                return true;
            }

        }

        return false;
    }
}