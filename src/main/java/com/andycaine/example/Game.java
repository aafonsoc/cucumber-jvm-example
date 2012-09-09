package com.andycaine.example;

public class Game {

    private String opponent;

    private GameCategory category;

    public Game(String opponent, GameCategory category) {
        this.opponent = opponent;
        this.category = category;
    }

    public String getOpponent() {
        return opponent;
    }

    public GameCategory getCategory() {
        return category;
    }
}
