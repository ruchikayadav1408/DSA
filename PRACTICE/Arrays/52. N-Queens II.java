class Solution {
     public static int count=0;
    public int totalNQueens(int n) {
        count=0;
         char board[][]=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for (int j = 0; j < n; j++) 
            {
                board[i][j] = 'x';
            }
        }
        nqueen(board,0);
        return count;
    }

     public static boolean issafe(char board[][], int row, int col){

        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //diagonal left up
          for(int i=row-1, j=col-1;i>=0&&j>=0;i--, j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //daigonal right up
          for(int i=row-1, j=col+1;i>=0 && j<board.length;i--, j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
return true;
    }
    public static void nqueen(char board[][], int row){

        
        if(row== board.length){
            count++;
            return;
        }



        for(int j=0;j<board.length;j++){
            if(issafe(board , row, j)){
                board[row][j]='Q';
                nqueen(board, row+1);
                board[row][j]='x';
            }
        }
    }



   
}
