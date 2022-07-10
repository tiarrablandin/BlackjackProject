package com.skilldistillery.blackjack.entities;

public class Player {
	protected BlackjackHand blackjackHand = new BlackjackHand();

	public BlackjackHand getBlackjackHand() {
		return blackjackHand;
	}
	
	public void setBlackjackHand(BlackjackHand hand) {
		this.blackjackHand = hand;
	}
	
	public void displayHand() {
		System.out.println(blackjackHand.toString() +  " Value: " + blackjackHand.getHandValue());
	}
}
