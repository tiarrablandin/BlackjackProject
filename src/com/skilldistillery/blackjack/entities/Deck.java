package com.skilldistillery.blackjack.entities;

import java.util.*;

public class Deck {
	private List<Card> deck = new ArrayList<>();

	public Deck() {

		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				deck.add(new Card(suit, rank));
			}
			
//		Suit[] suites = Suit.values();
//		Rank[] ranks = Rank.values();
//			for (Suit suit : Suit.values()) {
//				for (Rank rank : Rank.values()) {
//					Card card = new Card(suit, rank));
//					deck.add(card);
		}
	}

	public int checkDeckSize() {
		return deck.size();
	}

	public Card dealCard() {
		return deck.remove(0);
		
//		Card card = deal.remove(0);
//		return card;
	}

	public void shuffle(){
		Collections.shuffle(deck);
	}

}
