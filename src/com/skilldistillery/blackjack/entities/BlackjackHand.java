package com.skilldistillery.blackjack.entities;

public class BlackjackHand extends Hand{
	
	
	public BlackjackHand(Deck deck) {
		super(deck);
	}

	@Override
	public int getHandValue() {
		hand.getValue();
		return 0;
	}
	
	public boolean isBlackjack() {
		if(hand == 21) {
			true
		}else {
		false
		}
	}
	
	public boolean isBust() {
		if(hand > 21) {
			true
		}else {
			false
		}
	}
	
	public boolean isHard() {
		if(hand) {
			true
		}else {
			false
		}
	}

	public boolean isSoft() {
		if(hand) {
			true
		}else {
			false
		}
	}
	
}
