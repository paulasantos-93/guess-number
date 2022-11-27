package org.academiadecodigo.bootcamp.guessnumber;

public class PlayGround {

    public static void main(String[] args) {

        Player[] players = new Player[2];
        players[0] = new Player("Rui");
        players[1] = new Player("Campelo");

        Game game = new Game(10, players);
        game.start();
    }
}
