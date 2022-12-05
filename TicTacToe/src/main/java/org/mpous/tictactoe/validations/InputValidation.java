/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mpous.tictactoe.validations;

import java.util.Scanner;

/**
 *
 * @author PSO
 */
public class InputValidation {

    //Method to check that the number is between the bounds.
    public static int checkInput(Scanner sc) {
        int input = -1;
        do {
            System.out.print("Please enter your move!! 1-9");
            String next = sc.next();
            try {
                input = Integer.parseInt(next);
            } catch (NumberFormatException exp) {
            }
        } while (input < 1 || input > 9);

        return input;

    }

}
