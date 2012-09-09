Feature: Member buys ticket
  In order watch some great football
  As a club member
  I want to buy a ticket to a game

  Scenario: No tickets bought last season and anyone can buy tickets to the game
    Given I bought 0 tickets last season
      And anyone can buy tickets for a category C game
      And the game against Swansea City is a category C game
    When I try to buy a ticket for the game against Swansea City
    Then I should be able to buy the ticket

  Scenario: 14 tickets bought last season and more than 14 tickets required for the game
    Given I bought 14 tickets last season
      And only members who bought more than 14 tickets last season can buy tickets for a category A game
      And the game against Man Utd is a category A game
    When I try to buy a ticket for the game against Man Utd
    Then I should be told that I did not buy enough tickets last season

  Scenario: 15 tickets bought last season and more than 14 tickets required for the game
    Given I bought 15 tickets last season
      And only members who bought more than 14 tickets last season can buy tickets for a category A game
      And the game against Man Utd is a category A game
    When I try to buy a ticket for the game against Man Utd
    Then I should be able to buy the ticket
