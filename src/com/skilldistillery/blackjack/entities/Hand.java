package com.skilldistillery.blackjack.entities;

import java.util.*;

public abstract class Hand {
	
	protected List<Card> hand = new ArrayList<>();
	
	public Hand(Deck deck) {}
	
	public void addCard(Card card) {
		hand.add(card);
	}
	
	public void clear() {
		hand.removeAll(hand);
	}
	
	public abstract int getHandValue();

	@Override
	public String toString() {
		return "Hand: " + hand;
	}

	
}
