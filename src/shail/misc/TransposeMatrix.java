package shail.misc;

public class TransposeMatrix {

    public static void main(String args[])
    {
        transposeMatrix(new int[][]{{1,1,1},{2,2,2},{3,3,3}});
    }

    public static void transposeMatrix(int[][] matrix) {

        printMatrix(matrix);


        System.out.println("________________________________");
        for(int row = 0; row < matrix.length; row++)
        {
            for (int col = row; col < matrix[row].length; col++)
            {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }

        printMatrix(matrix);

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
