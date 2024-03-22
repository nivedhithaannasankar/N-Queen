package game;

import board.QueenBoard;

public class NQueenGame {
    QueenBoard q;

    public NQueenGame(QueenBoard q){
        this.q= q;
    }

    public void play(){
        if(q.size < 4 ){
            System.out.println("No possible configuration");
            return;
        } 

        nqueen(q.board, 0);
    }

    private void nqueen(char board[][], int row){
        if(row == board.length){
            System.out.println("Possible Configuration");
            printboard(board);
            
            return;
        }

        for(int col=0;col<board.length;col++){
            if(isSafe(board, row, col) == true){
                board[row][col] = 'Q';
                nqueen(board, row+1);
                board[row][col] = '-';
            }
        }
    }

    private boolean isSafe(char board[][], int row,int col){
        for(int i=row-1, j=col-1 ;i>=0 && j>=0 ;i-- ,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        for(int i = row-1, j=col+1;  j<board.length && i>=0 ;i--,j++){
              if(board[i][j] == 'Q'){
                return false;
              }
        }
        for(int i=row ;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        return true;
    }
    private void printboard(char board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
