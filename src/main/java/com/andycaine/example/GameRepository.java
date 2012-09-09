package com.andycaine.example;

import com.google.common.base.Predicate;

@org.springframework.stereotype.Repository
public class GameRepository extends Repository<Game> {

    public Game findByOpponent(final String opponent) {
        return find(new Predicate<Game>() {
            public boolean apply(Game game) {
                return game.getOpponent().equals(opponent);
            }
        });
    }
}
