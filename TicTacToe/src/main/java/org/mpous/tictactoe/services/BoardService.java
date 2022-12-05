/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mpous.tictactoe.services;

/**
 *
 * @author PSO
 */
public class BoardService {

    //Method to print the board and display board.
    public static void printBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char i : row) {
                System.out.print(i);
            }
            System.out.println();
        }

    }

    //Method to check if the game is over.
    public static boolean isGameOver(char[][] gameboard) {

        //Horizontal Win
        if (gameboard[0][0] == 'X' && gameboard[0][2] == 'X' && gameboard[0][4] == 'X') {
            System.out.println("Player wins");
            return true;
        }
        if (gameboard[0][0] == 'O' && gameboard[0][2] == 'O' && gameboard[0][4] == 'O') {
            System.out.println("Computer Wins");
            return true;
        }
        if (gameboard[1][0] == 'X' && gameboard[1][2] == 'X' && gameboard[1][4] == 'X') {
            System.out.println("Player Wins");
            return true;
        }
        if (gameboard[2][0] == 'X' && gameboard[2][2] == 'X' && gameboard[2][4] == 'X') {
            System.out.println("Player Wins");
            return true;
        }
        if (gameboard[2][0] == 'O' && gameboard[2][2] == 'O' && gameboard[2][4] == 'O') {
            System.out.println("Computer Wins");
            return true;
        }
        //Vertical Wins
        if (gameboard[0][0] == 'X' && gameboard[1][0] == 'X' && gameboard[2][0] == 'X') {
            System.out.println("Player Wins");
            return true;
        }
        if (gameboard[0][0] == 'O' && gameboard[1][0] == 'O' && gameboard[2][0] == 'O') {
            System.out.println("Computer Wins");
            return true;
        }
        if (gameboard[0][2] == 'X' && gameboard[1][2] == 'X' && gameboard[2][2] == 'X') {
            System.out.println("Player Wins");
            return true;
        }
        if (gameboard[0][2] == 'O' && gameboard[1][2] == 'O' && gameboard[2][2] == 'O') {
            System.out.println("Computer Wins");
            return true;
        }
        if (gameboard[0][4] == 'X' && gameboard[1][4] == 'X' && gameboard[2][4] == 'X') {
            System.out.println("Player Wins");
            return true;
        }
        if (gameboard[0][4] == 'O' && gameboard[1][4] == 'O' && gameboard[2][4] == 'O') {
            System.out.println("Computer Wins");
            return true;
        }
        //Diagonla Wins
        if (gameboard[0][0] == 'X' && gameboard[1][2] == 'X' && gameboard[2][4] == 'X') {
            System.out.println("Player Wins");
            return true;
        }
        if (gameboard[0][0] == 'O' && gameboard[1][2] == 'O' && gameboard[2][4] == 'O') {
            System.out.println("Computer Wins");
            return true;
        }
        if (gameboard[2][0] == 'X' && gameboard[1][2] == 'X' && gameboard[0][4] == 'X') {
            System.out.println("Player Wins");
            return true;
        }
        if (gameboard[2][0] == 'O' && gameboard[1][2] == 'O' && gameboard[0][4] == 'O') {
            System.out.println("Computer Wins");
            return true;
        }
        if (gameboard[0][0] != '_' && gameboard[0][2] != '_' && gameboard[0][4] != '_' && gameboard[1][0] != '_'
                && gameboard[1][2] != '_' && gameboard[1][4] != '_' && gameboard[2][0] != '_' && gameboard[2][2] != '_'
                && gameboard[2][4] != '_') {
            System.out.println("its a tie");

        }
        return false;
    }

    //Method to update the board after every move.
    public static void updteBoard(int position, int player, char[][] gameboard) {

        char character;

        if (player == 1) {
            character = 'X';
        } else {
            character = 'O';
        }

        switch (position) {
            case 1:
                gameboard[0][0] = character;
                printBoard(gameboard);
                break;
            case 2:
                gameboard[0][2] = character;
                printBoard(gameboard);
                break;
            case 3:
                gameboard[0][4] = character;
                printBoard(gameboard);
                break;
            case 4:
                gameboard[1][0] = character;
                printBoard(gameboard);
                break;
            case 5:
                gameboard[1][2] = character;
                printBoard(gameboard);
                break;
            case 6:
                gameboard[1][4] = character;
                printBoard(gameboard);
                break;
            case 7:
                gameboard[2][0] = character;
                printBoard(gameboard);
                break;
            case 8:
                gameboard[2][2] = character;
                printBoard(gameboard);
                break;
            case 9:
                gameboard[2][4] = character;
                printBoard(gameboard);
                break;
            default:
                break;
        }

    }

}
