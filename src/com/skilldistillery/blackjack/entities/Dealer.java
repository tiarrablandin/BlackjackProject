package com.skilldistillery.blackjack.entities;

public class Dealer extends Player{

	private Deck deck = new Deck();
	
	public Dealer() {}
	
	
	public void shuffle() {
		
		deck.shuffle();
	}
	
	public Card deal() {
		return deck.dealCard();
	}
	
	@Override
	public void displayHand() {
		System.out.print("Dealer ");
		super.displayHand();
	}
	
}
