package com.andycaine.example;

import com.google.common.base.Predicate;

@org.springframework.stereotype.Repository
public class GameCategoryRepository extends Repository<GameCategory> {

    public GameCategory findByDescription(final String categoryDescription) {
        return find(new Predicate<GameCategory>() {
            public boolean apply(GameCategory gameCategory) {
                return gameCategory.getDescription().equals(categoryDescription);
            }
        });
    }

}
