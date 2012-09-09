package com.andycaine.example.steps;

import com.andycaine.example.GameCategory;
import com.andycaine.example.GameCategoryRepository;
import cucumber.annotation.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

public class GameCategorySteps {

    @Autowired
    private GameCategoryRepository gameCategoryRepository;

    @Given("^anyone can buy tickets for a category ([A-Z]) game")
    public void givenThatAnyoneCanBuyTicketsFor(String category) {
        gameCategoryRepository.store(new GameCategory(category, 0));
    }

    @Given("^only members who bought more than (\\d+) tickets last season can buy tickets for a category ([A-Z]) game")
    public void givenThatCategoryRequires(int numberOfTickets, String category) {
        gameCategoryRepository.store(new GameCategory(category, numberOfTickets + 1));
    }

}
