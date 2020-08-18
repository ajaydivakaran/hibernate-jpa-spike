package me.spike;

import java.util.List;

public class GamesResponse {
    private List<Game> games;

    public GamesResponse(List<Game> games) {
        this.games = games;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}
