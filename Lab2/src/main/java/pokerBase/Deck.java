package pokerBase;

import java.util.ArrayList;
import java.util.Collections;

import pokerEnums.eRank;
import pokerEnums.eSuit;

public class Deck {

	private ArrayList<Card> deckCards = new ArrayList<Card>();

	public Deck() {
		int iCardNbr = 1;
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				deckCards.add(new Card(eSuit, eRank, iCardNbr++));
			}
		}
		Collections.shuffle(deckCards);
	}
	
	public Card Draw(){
		deckCards.get((deckCards.size()-1));
		deckCards.remove((deckCards.size()-1));
		return null;
	}
} 
