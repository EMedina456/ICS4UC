import java.io.*;
import java.util.*;
/**
 * Favourite Suit v2
 * @author Eric Medina
 * @course ICS4UC
 * @date 2020/09/28
 */
public class favSuitv2EricMe {

	public static void main(String[] args) throws Exception {
		// Tie Scanner to file
		Scanner sc = new Scanner(new FileReader("suitInputv2.txt"));
		
		PrintWriter pw = new PrintWriter(new FileWriter("suitOutputv2.txt"));
		
		while (sc.hasNext()) {
			String[] cards = getCardsFromInput(sc);
			int[] scores = calcScore(cards);
			String[] cardOrder = findHighLowScore(scores);
			pw.println(cardOrder[0] + " " + cardOrder[1]);
		}
		// Flush, close Print Writer and Scanner
		pw.flush();
		pw.close();
		sc.close();
	}

	public static String[] findHighLowScore(int[] scores) {
		
		return null;
	}

	public static int[] calcScore(String[] cards) {
		int[] scores = new int[cards.length];
		for (int i = 0; i < cards.length; i++) {
			String card = cards[i];
			// Split card into two parts
			String cardSuit = card.substring(0,1);
			String cardNumber = card.substring(1,2);
			scores[i] = getSuitValue(cardSuit) * getNumberValue(cardNumber);
		}
		return scores;
	}

	public static int getNumberValue(String cardNumber) {
		int cardValue = 0;
		if (cardNumber.equals("A")) {
			cardValue = 1;
		}
		else if (cardNumber.equals("T")) {
			cardValue = 10;
		}
		else if (cardNumber.equals("J")) {
			cardValue = 11;
		}
		else if (cardNumber.equals("Q")) {
			cardValue = 12;
		}
		else if (cardNumber.equals("K")) {
			cardValue = 13;
		}
		else {
			cardValue = Integer.parseInt(cardNumber);
		}
			
//		switch (cardNumber) {
//		case "A": 
//			cardValue = 1;
//			break;
//		case "T": 
//			cardValue = 10;
//			break;
//		case "J": 
//			cardValue = 11;
//			break;
//		case "Q": 
//			cardValue = 12;
//			break;
//		case "K": 
//			cardValue = 13;
//			break;
//		}
		return cardValue;
	}

	public static int getSuitValue(String cardSuit) {
		int suitValue = 0;
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
			
//		switch (cardSuit) {
//		case "S":
//			suitValue = 1;
//		case "H":
//			suitValue = 2;
//		case "C":
//			suitValue = 3;
//		case "D":
//			suitValue = 4;
//		}
		return suitValue;
	}

	public static String[] getCardsFromInput(Scanner sc) {
		String hand = sc.nextLine();
		String[] cards = hand.split(" ");
		return cards;
	}

}