package com.JJGames.gameSettings;

import java.util.Scanner;

public class GameMenu {

  private final int PLAY = 0;
  private final int PLAYERS = 1;
  private final int SETTINGS = 2;
  private final int EXIT = 3;

  public static Players players = new Players();
  private final StartGame startGame = new StartGame();

  private final Scanner scanner = new Scanner(System.in);

  public GameMenu() {
  }

  //getter


  //setter


  //method
  public int chooseOption() { //validering af tal - validering af option -
    int option;
    System.out.println("Choose your option from the menu");

    do {
      System.out.print(">:");
      while (!scanner.hasNextInt()) {
        System.out.println("Not a valid input");
        scanner.next();
        System.out.print(">:");
      }
      option = scanner.nextInt();

      if (option < 0 || option > 3) {
        System.out.println("input only 0, 1, 2 or 3");
      }
    } while (option > 3 || option < 0);
    scanner.nextLine();

    return option;
  }

  public void printOptions() {
    System.out.println(
        "\t 0. Play\n" +
            "\t 1. Players\n" +
            "\t 2. Settings\n" +
            "\t 3. Exit\n"
    );
  }

  public void option() {
    printOptions();
    int option = chooseOption();

    switch (option) {
      case PLAY:
        startGame.gameLogo();
        callStart();
        break;
      case PLAYERS:
        callPlayer();
        break;
      case SETTINGS:
        callSettings();
        break;
      case EXIT:
        callExit();
        break;
    }

  }

  public void callStart() {
    if (players.getPlayerOne() == null) {
      namePlayer();
    }

    startGame.render();
  }

  public void namePlayer() {
    System.out.print("Enter name for player one: ");
    players.setPlayerOne(scanner.next());
    System.out.println();
    System.out.print("Enter name for player two: ");
    players.setPlayerTwo(scanner.next());

  }

  public void callPlayer() {
    if (players.getPlayerOne() == null) {
      System.out.println("There is no players yet, make some her");
      namePlayer();
    }
    System.out.println("Player ones name: " + players.getPlayerOne());
    System.out.println("Player twos name: " + players.getPlayerTwo());
    option();
  }

  public void callSettings() {
    System.out.println("No settings yet");
    option();
  }

  public void callExit() {
    System.exit(0);
  }


}
