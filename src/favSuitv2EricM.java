import java.io.*;
import java.util.*;
/**
 * Favourite Suit v2
 * @author Eric Medina
 * @course ICS4UC
 * @date 2020/09/28
 */
public class favSuitv2EricM {

	// Method to get cards
	public static String[] getCardsFromInput(Scanner sc) {
		// Split the hand into its individual cards
		String hand = sc.nextLine();
		String[] cards = hand.split(" ");
		
		return cards;
	}
	
	// Method to calculate the score of each card
	public static int[] calcScore(String[] cards) {
		int[] scores = new int[cards.length];
		
		// Is the index in card length?
		for (int i = 0; i < cards.length; i++) {
			String card = cards[i];
			// Split card into suit and number
			String cardSuit = card.substring(0,1);
			String cardNumber = card.substring(1,2);
			// Get the value of the suit and number
			int suitValue = getSuitValue(cardSuit);
			int numValue = getNumberValue(cardNumber);
			// Multiply suit value and number value
			scores[i] = suitValue * numValue;
		}
		
		return scores;
	}
	
	// Get the value of the number
	public static int getNumberValue(String cardNumber) {
		int numValue = 0;
		
		// Determine value of card if it is a face card
		if (cardNumber.equals("A")) {
			numValue = 1;
		}
		else if (cardNumber.equals("T")) {
			numValue = 10;
		}
		else if (cardNumber.equals("J")) {
			numValue = 11;
		}
		else if (cardNumber.equals("Q")) {
			numValue = 12;
		}
		else if (cardNumber.equals("K")) {
			numValue = 13;
		}
		// Convert the number into an integer
		else {
			numValue = Integer.parseInt(cardNumber);
		}
		
		return numValue;
	}
	
	// Get the value of the suit
	public static int getSuitValue(String cardSuit) {
		int suitValue = 0;
		
		// Determine the suit and its value
		if (cardSuit.equals("S")) {
			suitValue = 1;
		}
		else if (cardSuit.equals("H")) {
			suitValue = 2;
		}
		else if (cardSuit.equals("C")) {
			suitValue = 3;
		}
		else if (cardSuit.equals("D")) {
			suitValue = 4;
		}
		
		return suitValue;
	}
	
	// Main
	public static void main(String[] args) throws Exception {
		// Tie Scanner to file
		Scanner sc = new Scanner(new FileReader("suitInputv2.txt"));
		
		// Loop as long as there is an input
		while (sc.hasNext()) {
			String[] cards = getCardsFromInput(sc);
			int[] scores = calcScore(cards);
			// Assign variables for highest and lowest scores
			int highestScore = scores[0];
			String cardHighest = cards[0];
			int lowestScore = scores[0];
			String cardLowest = cards[0];
			
			// Loop through all cards to find highest and lowest card
			for (int i = 1; i < cards.length; i++) {
				// Look for highest score and assign it to the card
				if (scores[i] > highestScore) {
					highestScore = scores[i];
					cardHighest = cards[i];
				}
				// Look for lowest score and assign it to the card
				if (scores[i] < lowestScore) {
					lowestScore = scores[i];
					cardLowest = cards[i];
				}
			}
			
			// Output highest and lowest card in hand
			System.out.println(cardHighest + " " + cardLowest);
		}
		// Close Scanner
		sc.close();
	}
}