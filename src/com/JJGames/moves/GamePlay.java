package com.JJGames.moves;

import com.JJGames.GameLauncher;
import com.JJGames.gameSettings.GameMenu;
import com.JJGames.gameSettings.Players;
import com.JJGames.gameSettings.StartGame;

import java.util.Arrays;
import java.util.Scanner;

public class GamePlay {

  private PlayerInput playerInput= new PlayerInput();

  public GamePlay() {
  }

  public void play() {
    for (int turn = 1; turn < 6; turn++) {

      playerInput.inputFromPlayerOne();
      if (finish()) {
        turn = 9;
        GameLauncher.gameMenu.option();
      } else{
        if (turn == 5) {
          System.out.println("Draw");
          GameLauncher.gameMenu.option();
        } else {
          playerInput.inputFromPlayerTwo();
          if (finish()) {
            turn = 9;
            GameLauncher.gameMenu.option();
          }
        }
      }

    }
  }

  public boolean finish() {

    if (playerOneWin()) {
      System.out.println(GameMenu.players.getPlayerOne() + " Wins!");
      return true;

    } else if (playerTwoWin()) {
      System.out.println(GameMenu.players.getPlayerTwo() + " Wins!");
      return true;
    }
    return false;
  }


  private boolean playerOneWin() { //må kunne skrives på en anden måde (start med at lave alle == 'x')

    if (StartGame.board.getBoard()[0][0] == StartGame.board.getBoard()[1][0] && StartGame.board.getBoard()[0][0] == StartGame.board.getBoard()[2][0] && StartGame.board.getBoard()[0][0] == 'X') {
      return true;
    } else if (StartGame.board.getBoard()[0][1] == StartGame.board.getBoard()[1][1] && StartGame.board.getBoard()[0][1] == StartGame.board.getBoard()[2][1] && StartGame.board.getBoard()[0][1] == 'X') {
      return true;
    } else if (StartGame.board.getBoard()[0][2] == StartGame.board.getBoard()[1][2] && StartGame.board.getBoard()[0][2] == StartGame.board.getBoard()[2][2] && StartGame.board.getBoard()[0][2] == 'X') {
      return true;
    } else if (StartGame.board.getBoard()[0][0] == StartGame.board.getBoard()[0][1] && StartGame.board.getBoard()[0][0] == StartGame.board.getBoard()[0][2] && StartGame.board.getBoard()[0][0] == 'X') {
      return true;
    } else if (StartGame.board.getBoard()[1][0] == StartGame.board.getBoard()[1][1] && StartGame.board.getBoard()[1][0] == StartGame.board.getBoard()[1][2] && StartGame.board.getBoard()[1][0] == 'X') {
      return true;
    } else if (StartGame.board.getBoard()[2][0] == StartGame.board.getBoard()[2][1] && StartGame.board.getBoard()[2][0] == StartGame.board.getBoard()[2][2] && StartGame.board.getBoard()[2][0] == 'X') {
      return true;
    } else if (StartGame.board.getBoard()[0][0] == StartGame.board.getBoard()[1][1] && StartGame.board.getBoard()[0][0] == StartGame.board.getBoard()[2][2] && StartGame.board.getBoard()[0][0] == 'X') {
      return true;
    } else if (StartGame.board.getBoard()[2][0] == StartGame.board.getBoard()[1][1] && StartGame.board.getBoard()[2][0] == StartGame.board.getBoard()[0][2] && StartGame.board.getBoard()[2][0] == 'X') {
      return true;
    }

    return false;
  }

  private boolean playerTwoWin() {
    if (StartGame.board.getBoard()[0][0] == StartGame.board.getBoard()[1][0] && StartGame.board.getBoard()[0][0] == StartGame.board.getBoard()[2][0] && StartGame.board.getBoard()[0][0] == 'O') {
      return true;
    } else if (StartGame.board.getBoard()[0][1] == StartGame.board.getBoard()[1][1] && StartGame.board.getBoard()[0][1] == StartGame.board.getBoard()[2][1] && StartGame.board.getBoard()[0][1] == 'O') {
      return true;
    } else if (StartGame.board.getBoard()[0][2] == StartGame.board.getBoard()[1][2] && StartGame.board.getBoard()[0][2] == StartGame.board.getBoard()[2][2] && StartGame.board.getBoard()[0][2] == 'O') {
      return true;
    } else if (StartGame.board.getBoard()[0][0] == StartGame.board.getBoard()[0][1] && StartGame.board.getBoard()[0][0] == StartGame.board.getBoard()[0][2] && StartGame.board.getBoard()[0][0] == 'O') {
      return true;
    } else if (StartGame.board.getBoard()[1][0] == StartGame.board.getBoard()[1][1] && StartGame.board.getBoard()[1][0] == StartGame.board.getBoard()[1][2] && StartGame.board.getBoard()[1][0] == 'O') {
      return true;
    } else if (StartGame.board.getBoard()[2][0] == StartGame.board.getBoard()[2][1] && StartGame.board.getBoard()[2][0] == StartGame.board.getBoard()[2][2] && StartGame.board.getBoard()[2][0] == 'O') {
      return true;
    } else if (StartGame.board.getBoard()[0][0] == StartGame.board.getBoard()[1][1] && StartGame.board.getBoard()[0][0] == StartGame.board.getBoard()[2][2] && StartGame.board.getBoard()[0][0] == 'O') {
      return true;
    } else if (StartGame.board.getBoard()[2][0] == StartGame.board.getBoard()[1][1] && StartGame.board.getBoard()[2][0] == StartGame.board.getBoard()[0][2] && StartGame.board.getBoard()[2][0] == 'O') {
      return true;
    }
    return false;
  }


}
