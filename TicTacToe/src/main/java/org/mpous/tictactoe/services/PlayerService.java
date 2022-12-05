/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mpous.tictactoe.services;

import java.util.Scanner;
import org.mpous.tictactoe.validations.InputValidation;
import static org.mpous.tictactoe.validations.ValidMove.isValidMove;

/**
 *
 * @author PSO
 */
public class PlayerService {

    //Method that asks the user to make a move.
    public static void playerMove(char[][] gameBoard) {
        Scanner input = new Scanner(System.in);
        int move = InputValidation.checkInput(input);
        boolean result = isValidMove(move, gameBoard);
        while (!result) {
            System.out.println("Invalid Move.Try again");
            move = InputValidation.checkInput(input);
            result = isValidMove(move, gameBoard);
        }
        BoardService.updteBoard(move, 1, gameBoard);
    }
}
