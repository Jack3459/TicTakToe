package com.JJGames.states;

public class Board {

  private char[][] board = new char[3][3];

  //getter
  public char[][] getBoard() { return board; }

  //setter
  public void setBoard(char[][] board) {
    this.board = board;
  }

  //method

  public void makeBoardChar() {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        this.board[i][j] = ' ';
      }
    }
  }

  public void makeBoard() { // char[vandret x ][lodret y ]
    System.out.println(" |\033[4m1 2 3\033[0m");

    System.out.print("1|");
    System.out.print(getBoard()[0][0] + " ");
    System.out.print(getBoard()[1][0] + " ");
    System.out.println(getBoard()[2][0] + " ");

    System.out.print("2|");
    System.out.print(getBoard()[0][1] + " ");
    System.out.print(getBoard()[1][1] + " ");
    System.out.println(getBoard()[2][1] + " ");

    System.out.print("3|");
    System.out.print(getBoard()[0][2] + " ");
    System.out.print(getBoard()[1][2] + " ");
    System.out.println(getBoard()[2][2] + " ");
  }


  //Update - Input - Render

  public void Update() {

  }

  public void render() {
    makeBoard();
  }


}
