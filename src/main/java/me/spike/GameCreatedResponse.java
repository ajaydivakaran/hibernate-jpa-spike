package me.spike;

public class GameCreatedResponse {

    private Game game;

    public GameCreatedResponse(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

}
