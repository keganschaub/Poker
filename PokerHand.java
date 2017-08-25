import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class PokerHand implements Comparable<PokerHand>{
	
	private int cardValue;

	public PokerHand(Card card, Card card2, Card card3, Card card4, Card card5) {
		/*ArrayList<Integer> handList = (ArrayList<Integer>) Arrays.asList(card.getRank().getValue(),
				card2.getRank().getValue(), card3.getRank().getValue(), card4.getRank().getValue(),
				card5.getRank().getValue());
		
		Collections.sort(handList);*/
		int[] cardArray = {card.getRank().getValue(), card2.getRank().getValue(),
				card3.getRank().getValue(), card4.getRank().getValue(),
				card5.getRank().getValue()};
		
		Arrays.sort(cardArray);
		
		// search through the possibilities of Poker hands and assign a value
		//Straight Flush (same suit, ordered numbers, can't wrap around)
		if (sameSuit(card, card2, card3, card4, card5) && typeOfCard(cardArray, 1)){
			cardValue = 10; 
		}
		//Four of a Kind
		else if (typeOfCard(cardArray, 2)){
			cardValue = 9;
		}
		//Full House
		else if (typeOfCard(cardArray, 3)){
			cardValue = 8;
		}
		//Flush
		else if (sameSuit(card, card2, card3, card4, card5)){
			cardValue = 7;
		}
		//Straight
		else if (typeOfCard(cardArray, 1)){
			cardValue = 6;
		}
		//Three of a Kind
		else if (typeOfCard(cardArray, 0)){
			cardValue = 5;
		}
		//Two Pair
		else if (typeOfCard(cardArray, 0)){
			cardValue = 4;
		}
		//Pair
		else if (typeOfCard(cardArray, 0)){
			cardValue = 3;
		}
		//High Card 
		else{
			cardValue = 2;
		}

		//cardValue = cardArray[5];
		
	}
	private boolean typeOfCard(int[] cardArray, int num) {
		boolean flag = false;
		int numPairs = 0;
		for (int i = 0; i < cardArray.length -1; i++){
			if (num == 1){ //check straight
				if (cardArray[i] == (cardArray[i+1] -1)){
					flag = true;
				}
				else {
					flag = false;
				}
			if (num == 2){ //check Four of a Kind
				if (cardArray[0] == cardArray[i+1] || cardArray[1] == cardArray[i] && i != 1){
					numPairs++;
				}
			}
			if (num == 3){//check Full House
				
			}
			}
		}
		if (numPairs == 4){
			return true;
		}
		return flag;
	}
	private boolean sameSuit(Card card, Card card2, Card card3, Card card4, Card card5){
		if (card.getSuit().equals(card2.getSuit()) 
				&& card.getSuit().equals(card3.getSuit())
				&& card.getSuit().equals(card4.getSuit()) 
				&& card.getSuit().equals(card5.getSuit())){
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(PokerHand otherHand) {
		return 0;
		//compare values of the hands
		//return 1 if higher, 0 if lower
	}

}
