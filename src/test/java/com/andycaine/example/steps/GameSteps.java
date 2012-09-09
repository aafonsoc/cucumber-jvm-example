package com.andycaine.example.steps;

import com.andycaine.example.Game;
import com.andycaine.example.GameCategoryRepository;
import com.andycaine.example.GameRepository;
import cucumber.annotation.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

public class GameSteps {

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private GameCategoryRepository gameCategoryRepository;

    @Given("^the game against (.+) is a category (.+) game$")
    public void givenThatFixtureIsCategory(String opponent, String categoryDescription) {
        Game game = new Game(opponent, gameCategoryRepository.findByDescription(categoryDescription));
        gameRepository.store(game);
    }
}
