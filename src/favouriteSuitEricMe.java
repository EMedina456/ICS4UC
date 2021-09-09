import java.io.*;
import java.util.*;
/**
 * Favourite Suit
 * @author Eric Medina
 * @course ICS4UC
 * @date 2020/09/23
 */
public class favouriteSuitEricMe {

	public static void main(String[] args) throws Exception {
		// Tie Scanner to file
		Scanner sc = new Scanner(new FileReader("suitInput.txt"));
		
		PrintWriter pw = new PrintWriter(new FileWriter("suitOutput.txt"));
		
		// Assign favourite suit
		String favSuit = sc.nextLine();
		while (sc.hasNext()) {
			String hand = sc.nextLine();
			// Create arrays to read cards and separate them
			String[] cards = hand.split(" ");
			String[] favCards = new String[cards.length];
			// Assign variables for index and score
			int favSuitIndex = 0;
			int score = 0;
			
			// Create a loop to read the hand in reverse order
			for (int i=cards.length - 1; i >= 0; i--) {
				String card = cards[i];
				// Split card into two parts, string and int
				String cardSuit = card.substring(0,1);
				int cardValue = Integer.parseInt(card.substring(1,2));
				
				// Does the suit of the card match favourite suit?
				if (cardSuit.equalsIgnoreCase(favSuit)) {
					score = score + cardValue;
					// Add analyzed card into favourite card index
					favCards[favSuitIndex] = cards[i];
					favSuitIndex = favSuitIndex + 1;
				}
			}
			
			// Output favourite cards
			pw.print("Clara's Favs: ");
			for (int i=0; i < favCards.length; i++) {
				// Output cards, spacings, and avoid outputting null
				if (favCards[i] != null) {
					pw.print(favCards[i] + " ");
				}
			}
			
			// Output score of hand
			pw.println("");
			pw.println("Score: " + score);
		}
		
		// Close Printwriter and Scanner
		pw.flush();
		pw.close();
		sc.close();
	}
}