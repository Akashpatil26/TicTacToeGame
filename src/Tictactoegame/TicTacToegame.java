package Tictactoegame;

import java.util.Random;
import java.util.Scanner;

public class TicTacToegame{
    char [][] board = new char[3][3];
  //  TicTacToegame ticTacToegame = new TicTacToegame();

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to the TicTacToeGame");
        createBoard();
        inputLetter();
        char [][] board = new char[3][3];
        int row =0;
        int column =0;
        /*getting row and column from user
         */
        System.out.println("Enter a row (0,1,2): ");
        row=scanner.nextInt();
        System.out.println("Enter a row (0,1,2): ");
        column=scanner.nextInt();
        if (row <0 || column <0 || row >2 || column >2){
            System.out.println("Invalid Number ,Enter 0,1,2");
        else if(board[row][column] !='-'){
                System.out.println("A move has been already made ");
            }
        else {

            }
        }
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
                System.out.println(board[i][j]=' ');
            }
            System.out.println();
        }
    }





}
