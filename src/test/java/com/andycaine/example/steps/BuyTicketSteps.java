package com.andycaine.example.steps;

import com.andycaine.example.Game;
import com.andycaine.example.GameRepository;
import com.andycaine.example.Member;
import com.andycaine.example.MemberRepository;
import com.andycaine.example.pages.BuyTicketPage;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BuyTicketSteps {

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private MemberRepository memberRepository;

    private BuyTicketPage buyTicketPage = new BuyTicketPage();

    @When("^I try to buy a ticket for the game against (.+)$")
    public void tryToBuyTicketFor(String opponent) {
        buyTicketPage.open();

        Game game = gameRepository.findByOpponent(opponent);
        Member member = memberRepository.findFirst();
        buyTicketPage.buyTicket(game, member);
    }

    @Then("^I should be able to buy the ticket$")
    public void assertThatIAmAbleToBuyTheTicket() {
        assertFalse(buyTicketPage.isNotEnoughTicketsBoughtLastSeasonMessageShowing());
        assertTrue(buyTicketPage.isPaymentScreenDisplayed());
    }

    @Then("^I should be told that I did not buy enough tickets last season$")
    public void shouldBeToldThatIDidNotBuyEnoughTicketsLastSeason() {
        assertTrue(buyTicketPage.isNotEnoughTicketsBoughtLastSeasonMessageShowing());
    }
}
