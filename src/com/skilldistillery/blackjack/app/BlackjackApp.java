package com.skilldistillery.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Deck;
import com.skilldistillery.blackjack.entities.Player;

public class BlackjackApp {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BlackjackApp app = new BlackjackApp();
		Deck deck = new Deck();
		
		app.play();
	}

	public void play() {
		Dealer dealer = new Dealer();
		Player player = new Player();

		dealer.shuffle();
		player.getBlackjackHand().addCard(dealer.deal());
		dealer.getBlackjackHand().addCard(dealer.deal());
		dealer.displayHand();
		player.getBlackjackHand().addCard(dealer.deal());
		dealer.getBlackjackHand().addCard(dealer.deal());
		player.displayHand();

		if (player.getBlackjackHand().isBlackjack()) {
			dealer.displayHand();
			System.out.println("\nBlackjack. Player wins.");
		} else if (dealer.getBlackjackHand().isBlackjack()) {
			dealer.displayHand();
			System.out.println("\nBlackjack. House wins.");
		} 
		else {
			System.out.println("\nHit or Stay?");

			while (player.getBlackjackHand().getHandValue() < 22) {
				String choice = sc.nextLine();

				if (choice.equalsIgnoreCase("Hit")) {
					player.getBlackjackHand().addCard(dealer.deal());
					player.displayHand();
					if (player.getBlackjackHand().isBust()) {
						System.out.println("\n");
						dealer.displayHand();
						System.out.println("\nBust. House wins.");
						break;
					} else if (player.getBlackjackHand().getHandValue() == 21
							&& player.getBlackjackHand().getHandValue() > dealer.getBlackjackHand().getHandValue()) {
						dealer.displayHand();
						System.out.println("\nTwenty-one. Player wins.");
						break;
					}
				} else if (choice.equalsIgnoreCase("Stay")) {

					while (dealer.getBlackjackHand().getHandValue() < 22) {
						if (dealer.getBlackjackHand().getHandValue() < 17) {
							dealer.displayHand();
							System.out.println("\nDealer hits");
							dealer.getBlackjackHand().addCard(dealer.deal());
							dealer.displayHand();
							if (dealer.getBlackjackHand().getHandValue() < 17) {
								System.out.println("\nDealer hits");
								dealer.getBlackjackHand().addCard(dealer.deal());
								dealer.displayHand();
							} else if (player.getBlackjackHand().getHandValue() > dealer.getBlackjackHand()
									.getHandValue() && player.getBlackjackHand().getHandValue() <= 21
									|| dealer.getBlackjackHand().getHandValue() > 21) {
								System.out.println("\nPlayer wins.");
								break;
							} else if (player.getBlackjackHand().getHandValue() < dealer.getBlackjackHand()
									.getHandValue() && dealer.getBlackjackHand().getHandValue() <= 21) {
								System.out.println("\nHouse wins.");
								break;
							}
						} else if (dealer.getBlackjackHand().getHandValue() >= 17) {
							dealer.displayHand();
							System.out.println("\nDealer stays");
							if (player.getBlackjackHand().getHandValue() > dealer.getBlackjackHand().getHandValue()
									&& player.getBlackjackHand().getHandValue() <= 21) {
								System.out.println("\nPlayer wins.");
								break;
							} else if (player.getBlackjackHand().getHandValue() < dealer.getBlackjackHand()
									.getHandValue() && dealer.getBlackjackHand().getHandValue() <= 21) {
								System.out.println("\nHouse wins.");
								break;
							} else if (player.getBlackjackHand().getHandValue() == dealer.getBlackjackHand()
									.getHandValue() && dealer.getBlackjackHand().getHandValue() <= 21
									&& player.getBlackjackHand().getHandValue() <= 21) {
								System.out.println("\nPush");
								break;
							}
						}
					}
					
					break;
					
				} else {
					System.out.println("\nPlease choose Hit or Stay");
				}
			}

		}
		sc.close();
	}

}
