import java.util.Scanner;

/**
 * Sample Flowchart Program
 * @author Eric Medina
 * @course ICS4UC
 * @date 2020/09/21
 */

public class sampleFlowEricM {

	/**
	 * Main program
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Setup the input from keyboard
		Scanner sc = new Scanner(System.in);

		// Get X
		System.out.print("X = ");
		int x = sc.nextInt();
		// Is x > 5?
		if (x > 5) {
			// Loop until y >= 42
			for (int y = 0; y < 42; y++) {
				// Is y < 10?
				if (y < 10) {
					// Output B
					System.out.println("B");
				}
				else {
					// Is y < 10 and x < 3?
					if (y < 10 && x < 3) {
						// Increment y by x
						y = y + x;
					}
					else {
						// Output C
						System.out.println("C");
					}
				}
			}
		}
		else {
			// Output A
			System.out.println("A");
		}
		// Close Scanner
		sc.close();
	}
}