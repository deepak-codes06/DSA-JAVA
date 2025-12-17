//The Question is about you have given an board of nxn you have to find the ways to place the queen?

package Backtracking;

public class NQueens {


    public static void main(String[] args) {
        int n = 4;
        boolean board[][] = new boolean[n][n];
        int ways = queens(board , 0);
        System.out.println("Total ways : " + ways);
    }

    // we are doing this question via row vise obviously we can do this same question column vise as well
    static int queens(boolean board[][] , int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return  1;
        }

        int count = 0;         // taking count variable for counting the no. of ways
        // Placing the queen and checking for every row and column
        for(int col = 0; col < board.length; col++){
            // place the queen if it is safe
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count += queens(board , row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    // this function is basically checks that where we are placing the queen is it safe or not like vertically digonally
    private static boolean isSafe(boolean board[][] , int row , int col){
        // check vertical row
        for(int i = 0; i < row; i++){
            if(board[i][col]){     //board[i][col] == true
                return false;
            }

        }

        // check for left digonal
        int maxLeft = Math.min(row , col);
        for(int i = 1; i <= maxLeft; i++){
            if(board[row-i][col-i]){    // board[row-i][col-i] == true
                return false;
            }
        }

        // check for right digonal
        int maxRight = Math.min(row , board.length - col - 1);
        for(int i = 1; i <= maxRight; i++){
            if(board[row-i][col+i]){  // board[row-i][col+i] ==  true
                return false;
            }
        }



        return true;
    }

    private static void display(boolean board[][]){
        for(boolean[] row : board){
            for(boolean element : row){
                if(element){     //element == true
                    System.out.print("Q");
                }else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }





}
