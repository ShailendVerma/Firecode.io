package shail.misc;

import java.util.ArrayList;

public class FindSpiralMatrix {
    public static void main(String args[])
    {
        System.out.println(findSpiral(new int[][]{{1,1,1},{2,2,2},{3,3,3}}));
    }

    public static ArrayList<Integer> findSpiral(int[][] arr){

        ArrayList<Integer> spiral = new ArrayList<>();

        int rowMin =0,colMin =0;
        int rowMax = arr.length -1, colMax = arr[0].length-1;

        while(colMin <= colMax && rowMin <= rowMax)
        {
            span(arr,rowMin,colMin,rowMin,colMax,spiral);
            rowMin++;
            if(colMin > colMax || rowMin > rowMax) break;
            span(arr,rowMin,colMax,rowMax,colMax, spiral);
            colMax--;
            if(colMin > colMax || rowMin > rowMax) break;
            span(arr,rowMax,colMax,rowMax,colMin, spiral);
            rowMax--;
            if(colMin > colMax || rowMin > rowMax) break;
            span(arr,rowMax,colMin,rowMin,colMin, spiral);
            colMin++;
        }

        return spiral;
    }


    public static void span(int[][] arr, int rowStart, int colStart, int rowEnd, int colEnd, ArrayList<Integer> spiral)
    {
        System.out.println(">>"+rowStart+","+colStart+"->"+rowEnd+","+colEnd);
        if(rowEnd - rowStart == 0)//Go column wise
        {
           while (colStart != colEnd) {
               System.out.println(rowStart + ":" + colStart + "-" + arr[rowStart][colStart]);
               spiral.add(arr[rowStart][colStart]);
               colStart = colStart + (colStart < colEnd ? 1:-1);
           }
           spiral.add(arr[rowStart][colStart]);

        }else{//Go row wise
            while (rowStart != rowEnd) {
                System.out.println(rowStart + ":" + colStart + "-" + arr[rowStart][colStart]);
                spiral.add(arr[rowStart][colStart]);
                rowStart = rowStart + (rowStart < rowEnd ? 1:-1);
            }
            spiral.add(arr[rowStart][colStart]);
        }

    }



}
