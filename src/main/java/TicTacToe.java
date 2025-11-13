package main.java;
public class TicTacToe {
    private char[][] board = new char[3][3];
    private int moves = 0;
    private char winner = '\0';

    public TicTacToe() {
        for (int i=0;i<3;i++)
            for (int j=0;j<3;j++)
                board[i][j]=' ';
    }

    public boolean set(int row,int col,char player){
        if(row<0||row>2||col<0||col>2) return false;
        if(board[row][col]!=' ') return false;
        if(player!='O'&&player!='X') return false;
        board[row][col]=player;
        moves++;
        evaluate();
        return true;
    }

    private void evaluate(){
        for(int i=0;i<3;i++){
            if(board[i][0]!=' '&&board[i][0]==board[i][1]&&board[i][1]==board[i][2]) winner=board[i][0];
            if(board[0][i]!=' '&&board[0][i]==board[1][i]&&board[1][i]==board[2][i]) winner=board[0][i];
        }
        if(board[0][0]!=' '&&board[0][0]==board[1][1]&&board[1][1]==board[2][2]) winner=board[0][0];
        if(board[0][2]!=' '&&board[0][2]==board[1][1]&&board[1][1]==board[2][0]) winner=board[0][2];
        if(winner=='\0'&&moves==9) winner='D';
    }

    public char getWinner(){ return winner; }
}
