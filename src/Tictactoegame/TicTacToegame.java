package Tictactoegame;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class TicTacToegame {
 //   char[][] board=new char[3][3];
    //  TicTacToegame ticTacToegame = new TicTacToegame();

    public static void main(String[] args) {
        System.out.println("Welcome to the TicTacToeGame");
        Scanner scanner=new Scanner(System.in);
        char[][] board=new char[3][3];
        for (int i=0; i < 3; i++) {
            for (int j=0; j < 3; j++) {
                System.out.println(board[i][j]='-');
            }
        }
        showBoard(board);
        boolean isPlayer=true;
        char symbol=' ';
        if (isPlayer) {
            symbol='x';
        } else {
            symbol='O';
        }
        int row=0;
        int column=0;
        /*getting row and column from user
         */
        while (true) {
            System.out.println("Enter a row (0,1,2): ");
            row=scanner.nextInt();
            System.out.println("Enter a row (0,1,2): ");
            column=scanner.nextInt();

            if (row < 0 || column < 0 || row > 2 || column > 2) {
                System.out.println("Invalid Number ,Enter 0,1,2");
            } else if (board[row][column] != '-') {
                System.out.println("A move has been already made ");
            } else
            {
                break;
            }
        }
        board[row][column]=symbol;
    }



    /*   creating char array board*/

    //public static void inputLetter() {
    //  Scanner scanner=new Scanner(System.in);
    // System.out.println("Enter X or O :");
    //String input=scanner.next();
    // }
    private static void showBoard(char[][] board) {
        for (int i=0; i < 3; i++) {
            for (int j=0; j < 3; j++) {
                System.out.println(board[i][j]);
            }
            System.out.println();
        }
    }
}

