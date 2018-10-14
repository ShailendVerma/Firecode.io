package shail.misc;

import java.util.ArrayList;

public class PrintPaths {

    public static void main(String args[])
    {
        //System.out.println(printPaths(new char[][]{{'A','B','C'},{'D','E','F'},{'G','H','I'}}));

        System.out.println(printPaths(new char[][]{{'A','B','C','D'},{'E','F','G','H'},{'I','J','K','L'},
                {'M','N','O','P'},{'Q','R','S','T'}}));
    }

    public static ArrayList<String> printPaths(char[][] board){

        ArrayList<String> out = new ArrayList<>();
        if(board == null || board.length ==0) return out;

        searchPath(board,new int[]{0,0},new StringBuilder(),out);

        return out;
    }

    public static void searchPath(char[][] board, int[] currentCell, StringBuilder builder, ArrayList<String> out){

        System.out.println(board[currentCell[0]][currentCell[1]]+":"+currentCell[0]+","+currentCell[1] +"->"+(board.length -1)+","+(board[0].length -1));
        if(currentCell[0] == board.length -1  && currentCell[1] == board[0].length -1){

            builder.append(board[currentCell[0]][currentCell[1]]);
            out.add(builder.toString());
            builder.deleteCharAt(builder.length() -1);
            //System.out.println("Reached target");
            return;
        }

        //Search right
        if(currentCell[0] < board.length -1)
        {
            //System.out.println("Move left");
            searchPath(board,new int[]{currentCell[0] +1,currentCell[1]},builder.append(board[currentCell[0]][currentCell[1]]),out);
            builder.deleteCharAt(builder.length() -1);
        }


        //Search down
        if(currentCell[1] < board[0].length -1) {
            //System.out.println("Move down");
            searchPath(board, new int[]{currentCell[0], currentCell[1] + 1}, builder.append(board[currentCell[0]][currentCell[1]]), out);
            builder.deleteCharAt(builder.length() -1);
        }
    }



}

