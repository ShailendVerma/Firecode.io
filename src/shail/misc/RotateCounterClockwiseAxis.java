package shail.misc;

public class RotateCounterClockwiseAxis {

    public static void main(String args[])
    {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        rotateSquareImageCCW(matrix);
        printMatrix(matrix);
    }

    public static void rotateSquareImageCCW(int[][] matrix) {

        System.out.println("original:");
        printMatrix(matrix);

        transpose(matrix);
        System.out.println("transpose:");
        printMatrix(matrix);

        flipHorizontal(matrix);
        System.out.println("flip horiz:");
    }

    private static void flipHorizontal(int[][] matrix) {

        for(int row =0 ; row < matrix.length/2 ;row++)
        {
            for(int col =0; col < matrix[0].length;col ++)
            {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[matrix.length - row -1][col];
                matrix[matrix.length - row -1][col] = temp;
            }
        }
    }

    private static void transpose(int[][] matrix) {
        for(int row =0 ; row < matrix.length;row++)
        {
            for(int col =row; col < matrix[0].length;col ++)
            {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }

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
