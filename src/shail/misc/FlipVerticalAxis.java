package shail.misc;

public class FlipVerticalAxis {

    public static void main(String args[])
    {
        flipVerticalAxis(new int[][]{{1,2,3},{2,3,4},{3,4,5},{4,5,6},{6,6,6}});

        flipVerticalAxis(new int[][]{{1,2,3,1},{2,3,4,1},{3,4,5,1},{4,5,6,1},{6,6,6,1}});
    }

    public static int[][] flipVerticalAxis(int[][] matrix) {

        printMatrix("-->",matrix);

        if(matrix[0] == null || matrix[0].length < 2) return matrix;

        int colLength = matrix[0].length;

        for(int col =0 ; col < colLength/2 ;col ++)
        {
            for(int row = 0 ; row < matrix.length;row++)
            {
                int temp = matrix[row][col];
                matrix[row][col]=matrix[row][colLength - col - 1];
                matrix[row][colLength - col -1] = temp;
            }
        }


        printMatrix("-->",matrix);

        return matrix;
    }

    private static void printMatrix(String title,int[][] matrix) {
        System.out.println(title);

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
