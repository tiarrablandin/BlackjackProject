package com.skilldistillery.blackjack.entities;

public class BlackjackHand extends Hand{
	
	public BlackjackHand() {}

	@Override
	public int getHandValue() {
		int sum = 0;
		for(Card card : hand) {
			sum += card.getValue();
		}
		return sum;
	}
	
	public boolean isPush(Hand hand) {
		
		if(hand.getHandValue() == this.getHandValue()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isBlackjack() {
		if(this.getHandValue() == 21 && this.hand.size() == 2) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isBust() {
		if(this.getHandValue() > 21) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
