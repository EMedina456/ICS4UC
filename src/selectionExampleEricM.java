import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * Selection Example
 * @author Mr. Reid and Eric Medina
 * @course ICS4UC
 * @date 2020/09/17
 */
public class selectionExampleEricM {

	public static void main(String[] args) throws Exception {
		// Tie Scanner to file
		Scanner sc = new Scanner(new FileReader("weatherIn.txt"));
		
		PrintWriter pw = new PrintWriter(new FileWriter("weatherOut.txt"));
		
		// Continue as long as there is an input
		while (sc.hasNext()) {
			String line = sc.nextLine();
			// Split the inputs of weather and input temperature
			String[] weatherInfo = line.split(";");
			int temp = Integer.parseInt(weatherInfo[0]);
			pw.println("The temperature is: " + temp);
			
			// Determine whether wear shorts, jacket, or tee-shirt
			if (temp > 25) {
				pw.println("Wear shorts");
				String sun = weatherInfo[1];

				// Determine whether to bring sunglasses if sunny or not
				if (sun.equalsIgnoreCase("yes")) {
					pw.println("Don't forget your sunglasses!");
				}
				else if (sun.equalsIgnoreCase("no")) {
					pw.println("You don't need your sunglasses. Have fun!");
				}
				else {
					pw.println("I did not undertsand your answer.");
				}
			}

			// Wear mittens if under 0 degrees
			else if (temp < 0) {
				pw.println("Wear mittens");
			}

			// Wear a jacket if under 10 degrees
			else if (temp < 10) {
				pw.println("Wear a jacket");
			}

			// Wear tee-shirt
			else {
				pw.println("Wear a tee-shirt");
			}

			// Get a user input if raining or not
			int index = 1;
			if (weatherInfo.length == 3) {
				index = 2;
			}
			
			String rain = weatherInfo[index];

			// Determine to bring umbrella if raining or not
			if (rain.equalsIgnoreCase("yes")) {
				pw.println("Don't forget your umbrella!");
			}
			else if (rain.equalsIgnoreCase("no")) {
				pw.println("You don't need your umbrella. Have fun!");
			}
			else {
				pw.println("I did not undertsand your answer.");
			}
		}
//		// Using Strings
//		// Get user input on name
//		sc.nextLine();
//		pw.print("What is your name? ");
//		String name = sc.nextLine();
//		// Determine whether or not name is Mr. Reid
//		if (name.equalsIgnoreCase("Mr. Reid")) {
//			pw.println("Welcome, Mr. Reid.");
//		} 
//		else {
//			pw.println("Hey you're not Mr. Reid!!!");
//		}
		
		// Close Scanner and Print Writer
		sc.close();
		pw.flush();
		pw.close();
	}
}