package Tictactoegame;

import java.util.Random;
import java.util.Scanner;

public class TicTacToegame{

    char [][] board = new char[3][3];
    public static void main(String[] args) {
        System.out.println("Welcome to the TicTacToeGame");
        createBoard();
        inputLetter();
    }

    /*   creating char array board*/
    public static void createBoard(){
        char[] board = new char[10];
        for(int i=1;i<board.length;i++){
            board[i]=' ';
        }
    }
    public static void inputLetter() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter X or O :");
        String input=scanner.next();
    }
    public static void showBoard(char[][] board){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(board[i][j]);
            }
        }
    }




}
