package com.andycaine.example.steps;

import com.andycaine.example.Member;
import com.andycaine.example.MemberRepository;
import cucumber.annotation.en.Given;
import org.springframework.beans.factory.annotation.Autowired;


public class MemberSteps {

    @Autowired
    private MemberRepository memberRepository;

    @Given("^I bought ([0-9]+) tickets last season$")
    public void givenThatIBoughtTicketsLastSeason(int numberOfTickets) {
        Member member = new Member();
        member.setNumberOfTicketsBoughtLastSeason(numberOfTickets);
        memberRepository.store(member);
    }

}
