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
        System.out.println("Player turn:");
        String player = scanner.next();
        System.out.println("Computer turn:");
        String computer = scanner.next();
        char[][] board=new char[3][3];

        for (int i=0; i < 3; i++) {
            for (int j=0; j < 3; j++) {
                System.out.println(board[i][j]='-');
            }
        }

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
            } else {
                break;
            }
        }
        board[row][column]=symbol;

        //checking if player has won
        if (hasWon(board)=='x'){
            System.out.println(player+ "has won!!");
        }
        else if(hasWon(board)=='O'){
            System.out.println(computer+ "has won!!");
        }
        else {
            if (hasTied(board)){
                System.out.println("It is a tie");
            }else {

            }
        }
    }

    private static void showBoard(char[][] board) {
        for (int i=0; i < 3; i++) {
            for (int j=0; j < 3; j++) {
                System.out.println(board[i][j]);
            }
            System.out.println();
        }
    }

    /* To check after every move if a player wins or not/*
     */
    public static char hasWon(char[][] board) {
        for (int i=0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
                return board[i][0];
            }
        }
        for (int j=0; j < 3; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '-') {
                return board[0][j];
            }
        }
        if(board[0][0] == board[1][1] && board[1][1]==board[2][2] && board[1][1]!='-'){
            return board[0][0];
        }
        if(board[2][0] == board[1][1] && board[1][1]==board[0][2] && board[2][0]!='-'){
            return board[2][0];
        }
        return '-';


    }

}
