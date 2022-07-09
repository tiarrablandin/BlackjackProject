package com.skilldistillery.blackjack.entities;

import java.util.*;

public class Dealer {
	
	public Dealer() {}
	
	public void shuffle() {
		Deck deck = new Deck();
		
		deck.shuffle(); // do I need this since it's in the deck?
	}
	
	public List<Card> deal(int howMany, Deck deck) {
		List<Card> dealtCards = new ArrayList<>();
			
		for(int cardNumber = 0; cardNumber < howMany; cardNumber++) {
			dealtCards.add(deck.dealCard());
		}
		return dealtCards;
	}

	public void hit() {
		if(hand < 17) {
			// hit
		}
	}
	
	public void stay() {
		if(hand > 17) {
			// stay
		}
		
	}

}
