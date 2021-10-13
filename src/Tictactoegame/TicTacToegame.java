package Tictactoegame;

import java.util.Random;
import java.util.Scanner;

public class TicTacToegame {
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




}
