package com.andycaine.example;

public class Member {

    private int numberOfTicketsBoughtLastSeason;

    public boolean qualifiesFor(Game game) {
        return numberOfTicketsBoughtLastSeason >= game.getCategory().getRequiredNumberOfTicketsBoughtLastSeason();
    }

    public void setNumberOfTicketsBoughtLastSeason(int ticketsBoughtLastSeason) {
        this.numberOfTicketsBoughtLastSeason = ticketsBoughtLastSeason;
    }
}
