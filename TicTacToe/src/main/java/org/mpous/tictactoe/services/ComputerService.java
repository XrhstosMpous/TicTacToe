/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mpous.tictactoe.services;

import java.util.Random;
import static org.mpous.tictactoe.validations.ValidMove.isValidMove;

/**
 *
 * @author PSO
 */
public class ComputerService {

    //Method for the move of the computer.
    public static void computerMove(char[][] gameBoard) {

        Random rand = new Random();
        int move = rand.nextInt(9) + 1;

        boolean result = isValidMove(move, gameBoard);

        while (!result) {
            move = rand.nextInt(9) + 1;
            result = isValidMove(move, gameBoard);
        }
        BoardService.updteBoard(move, 2, gameBoard);

    }
}
