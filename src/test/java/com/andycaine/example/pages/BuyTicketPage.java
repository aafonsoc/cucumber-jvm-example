package com.andycaine.example.pages;

import com.andycaine.example.Game;
import com.andycaine.example.Member;

public class BuyTicketPage {

    private boolean buyTicketSuccess;

    private boolean onBuyTicketPage;

    public void open() {
        // simulate opening the buy ticket page...
        onBuyTicketPage = true;
    }

    public void buyTicket(Game game, Member member) {
        // simulate buying the ticket
        buyTicketSuccess = onBuyTicketPage && member.qualifiesFor(game);
    }

    public boolean isNotEnoughTicketsBoughtLastSeasonMessageShowing() {
        return !buyTicketSuccess;
    }

    public boolean isPaymentScreenDisplayed() {
        return buyTicketSuccess;
    }
}
