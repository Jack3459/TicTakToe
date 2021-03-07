package com.JJGames.moves;

import com.JJGames.gameSettings.GameMenu;
import com.JJGames.gameSettings.Players;
import com.JJGames.gameSettings.StartGame;
import com.JJGames.states.Board;

import java.util.Arrays;
import java.util.Scanner;

public class PlayerInput {

  private final char xMark = 'X';
  private final char oMark = 'O';

  private int x;
  private int y;

  private final Scanner scanner = new Scanner(System.in);

  public PlayerInput() {
  }

  public void inputFromPlayerOne() {

    System.out.println(GameMenu.players.getPlayerOne() + "'s turn");
    inputValidation();
    boardValidation();
    StartGame.board.getBoard()[x - 1][y - 1] = xMark;
    render();

  }

  public void inputFromPlayerTwo() {

    System.out.println(GameMenu.players.getPlayerTwo() + "'s turn");
    inputValidation();
    boardValidation();
    StartGame.board.getBoard()[x - 1][y - 1] = oMark;

    render();
  }

  private void boardValidation() {
    while ((StartGame.board.getBoard()[x - 1][y - 1] == xMark) || StartGame.board.getBoard()[x - 1][y - 1] == oMark) {
      System.out.println("cant input if place is taken");
      inputValidation();
    }
  }

  private void inputValidation() {
    // input x
    do {
      System.out.print("input x: ");
      while (!scanner.hasNextInt()) {
        System.out.println("Not a valid input");
        scanner.next();
        System.out.print("input x: ");
      }
      this.x = scanner.nextInt();

      if (this.x < 1 || this.x > 3) {
        System.out.println("input only 1, 2 or 3");
      }
    } while (this.x > 3 || this.x < 1);

    // input y
    do {
      System.out.print("input y: ");
      while (!scanner.hasNextInt()) {
        System.out.println("Not a valid input");
        scanner.next();
        System.out.print("input y: ");
      }
      this.y = scanner.nextInt();

      if (this.y < 1 || this.y > 3) {
        System.out.println("input only 1, 2 or 3");
      }
    } while (this.y > 3 || this.y < 1);
  }


  public void render() {
    StartGame.board.render();

  }


}
