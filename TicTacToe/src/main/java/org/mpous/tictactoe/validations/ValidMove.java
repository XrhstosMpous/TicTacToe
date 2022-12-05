/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mpous.tictactoe.validations;

/**
 *
 * @author PSO
 */
public class ValidMove {

    //Method to check if the move is valid.
    public static boolean isValidMove(int move, char[][] gameboard) {
        switch (move) {
            case 1:
                if (gameboard[0][0] == '_') {
                    return true;
                } else {
                    return false;
                }
            case 2:
                if (gameboard[0][2] == '_') {
                    return true;
                } else {
                    return false;
                }
            case 3:
                if (gameboard[0][4] == '_') {
                    return true;
                } else {
                    return false;
                }
            case 4:
                if (gameboard[1][0] == '_') {
                    return true;
                } else {
                    return false;
                }
            case 5:
                if (gameboard[1][2] == '_') {
                    return true;
                } else {
                    return false;
                }
            case 6:
                if (gameboard[1][4] == '_') {
                    return true;
                } else {
                    return false;
                }
            case 7:
                if (gameboard[2][0] == '_') {
                    return true;
                } else {
                    return false;
                }
            case 8:
                if (gameboard[2][2] == '_') {
                    return true;
                } else {
                    return false;
                }
            case 9:
                if (gameboard[2][4] == '_') {
                    return true;
                } else {
                    return false;
                }
            default:
                return false;

        }

    }
}
