package Tictactoegame;

public class TicTacToegame {
    public static void main(String[] args) {
        System.out.println("Welcome to the TicTacToeGame");

    }

    char[] board = {' ','0','0','0','0','0','0','0','0','0'};
    /*   creating char array board

     */

    public static void Createboard(){
        /*char[] board = {' ','0','0','0','0','0','0','0','0','0'};/*

         */
        char[]board = new char[10];
        for(int i=1;i<board.length;i++){
            board[i]=' ';
        }
    }
}
