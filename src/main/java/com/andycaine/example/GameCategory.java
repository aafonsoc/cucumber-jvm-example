package com.andycaine.example;

public class GameCategory {

    private String description;

    private int requiredNumberOfTicketsBoughtLastSeason;

    public GameCategory(String description, int requiredNumberOfTicketsBoughtLastSeason) {
        this.description = description;
        this.requiredNumberOfTicketsBoughtLastSeason = requiredNumberOfTicketsBoughtLastSeason;
    }

    public String getDescription() {
        return description;
    }

    public int getRequiredNumberOfTicketsBoughtLastSeason() {
        return requiredNumberOfTicketsBoughtLastSeason;
    }
}
