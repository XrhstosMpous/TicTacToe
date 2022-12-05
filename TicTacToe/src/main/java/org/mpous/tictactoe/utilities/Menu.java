/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mpous.tictactoe.utilities;

import org.mpous.tictactoe.services.BoardService;
import org.mpous.tictactoe.services.ComputerService;
import org.mpous.tictactoe.services.PlayerService;

/**
 *
 * @author PSO
 */
public class Menu {

    //Singleton Class
    boolean gameOver;
    char[][] gameBoard = {{'_', '|', '_', '|', '_'}, {'_', '|', '_', '|', '_'}, {'_', '|', '_', '|', '_'}};

    private static Menu menu;

    private Menu() {

    }

    public static Menu getInstance() {
        if (null == menu) {
            menu = new Menu();
        }
        return menu;
    }

    private void showHeader() {
        System.out.println("---------------------------");
        System.out.println("| Are you ready to play ? |");
        System.out.println("---------------------------");
    }

    public void runMenu() {
        showHeader();
        while (!gameOver) {
            PlayerService.playerMove(gameBoard);
            gameOver = BoardService.isGameOver(gameBoard);
            if (gameOver) {
                break;
            }
            ComputerService.computerMove(gameBoard);
            gameOver = BoardService.isGameOver(gameBoard);
            if (gameOver) {
                break;
            }

        }

    }

}
