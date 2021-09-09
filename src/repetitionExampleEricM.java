import java.util.Scanner;

/**
 * Repetition Example
 * @author Mr. Reid and Eric Medina
 * @course ICS4UC
 * @date 2020/09/15
 */
public class repetitionExampleEricM {

	/**
	 * Main program
	 * @param args
	 */
	public static void main(String[] args) {
		// Setup the input from keyboard
		Scanner sc = new Scanner(System.in);

		// Variables to calculate mark average
		int total = 0;
		int mark = 100;
		int numMarks = 0;

		// Get the marks (counted)
//		for (int i=0; i<5; i++) {
//			System.out.print("Enter a mark: ");
//			mark = sc.nextInt();
//			total += mark;
//			numMarks++;
//		}
		
		// Get the marks (conditional)
		while (mark > 0) { // Prediction: Prompt and input will continue to open for user until written 0 or under
			System.out.print("Enter a mark (type '0' to complete): ");
			mark = sc.nextInt();
			total += mark;
			numMarks++;
		}
		
		// Calc Average and display
		double avg = total / (double)numMarks;
		System.out.println("Avg: "+avg);
				
		// Other examples
		for (int i=5; i>0; i--) { // Prediction: Loop will start at 5 and stop at 1
			System.out.println(i);
		}
		// Nested loop example
		for (int i=9; i>0; i--) {	// Prediction: Loop will start at 012345678 and end at 0
			for (int j=0; j<i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		// Close scanner
		sc.close();
	}
}