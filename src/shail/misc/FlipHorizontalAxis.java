package shail.misc;

import java.util.ArrayList;
import java.util.Arrays;

public class FlipHorizontalAxis {

    public static void main(String args[])
    {
        flipHorizontalAxis(new int[][]{{1,1,1},{2,2,2},{3,3,3},{4,4,4},{5,5,5}});
    }

    public static int[][] flipHorizontalAxis(int[][] matrix) {

        printMatrix(matrix);


        System.out.println("________________________________");
        for(int row = 0; row < matrix.length/2; row++)
        {
            int mirRow = matrix.length - row - 1;
            System.out.println(row +","+mirRow);
            for (int col =0 ; col < matrix[row].length; col++)
            {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[mirRow][col];
                matrix[mirRow][col] = temp;
            }
        }

        printMatrix(matrix);

        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for(int r =0 ; r < matrix.length;r++)
        {
            System.out.print("[");
            for(int c =0; c < matrix[r].length; c++)
            {
                System.out.print(matrix[r][c]+" ");
            }
            System.out.println("]");
        }
    }
}
