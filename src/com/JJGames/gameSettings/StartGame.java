package com.JJGames.gameSettings;

import com.JJGames.moves.GamePlay;
import com.JJGames.moves.PlayerInput;
import com.JJGames.states.Board;

public class StartGame {

    public static Board board = new Board();
    public GamePlay gamePlay = new GamePlay();


    public StartGame() {
    }

    public void gameLogo() {
        System.out.println(
            "████████╗██╗░█████╗░   ████████╗░█████╗░░█████╗░   ████████╗░█████╗░███████╗\n" +
            "╚══██╔══╝██║██╔══██╗   ╚══██╔══╝██╔══██╗██╔══██╗   ╚══██╔══╝██╔══██╗██╔════╝\n" +
            "░░░██║░░░██║██║░░╚═╝   ░░░██║░░░███████║██║░░╚═╝   ░░░██║░░░██║░░██║█████╗░░\n" +
            "░░░██║░░░██║██║░░██╗   ░░░██║░░░██╔══██║██║░░██╗   ░░░██║░░░██║░░██║██╔══╝░░\n" +
            "░░░██║░░░██║╚█████╔╝   ░░░██║░░░██║░░██║╚█████╔╝   ░░░██║░░░╚█████╔╝███████╗\n" +
            "░░░╚═╝░░░╚═╝░╚════╝░   ░░░╚═╝░░░╚═╝░░╚═╝░╚════╝░   ░░░╚═╝░░░░╚════╝░╚══════╝"
        );
        board.makeBoardChar();
    }

    public void render() {
        board.render();
        gamePlay.play();
    }

}
