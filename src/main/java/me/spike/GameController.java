package me.spike;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GameController {

    private GameRepository gameRepository;

    public GameController(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @GetMapping("/games")
    public GamesResponse getGames() {
        final List<Game> games = gameRepository.findAll();
        return new GamesResponse(games);
    }

    @PostMapping("/game")
    public GameCreatedResponse createGame(@RequestBody Game game) {
        gameRepository.save(game);
        return new GameCreatedResponse(game);
    }

}

