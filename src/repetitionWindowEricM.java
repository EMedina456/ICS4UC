import java.util.Scanner;

/**
 * Repetition Window
 * @author Eric Medina
 * @course ICS4UC
 * @date 2020/09/18
 */

public class repetitionWindowEricM {
	
	/**
	 * Main program
	 * @param args
	 */
	public static void main(String[] args) {
		// Setup the input from keyboard
		Scanner sc = new Scanner(System.in);
		
		// Get size
		System.out.print("Size: ");
		int size = sc.nextInt();
		// Determine if size is 5 or over and is odd
		if (size >= 5 && size % 2 != 0) { // Method to determine if odd found at https://beginnersbook.com/2014/02/java-program-to-check-even-or-odd-number/
			// Print "O" on same line until equals less than size (top row)
			for (int top=0; top<size; top++) {
				System.out.print("O");
			}
			// Next line
			System.out.println("");
			
			// First half of left edge
			for (int left1=0; left1<(size-3)/2; left1++) {
				System.out.print("O");
				// Left spacing
				for (int lSpace=0; lSpace<(size-3)/2; lSpace++) {
					System.out.print(" ");
				}
				// Middle column
				System.out.print("O");
				// Right spacing
				for (int rSpace=0; rSpace<(size-3)/2; rSpace++) {
					System.out.print(" ");
				}
				// Right edge and next line
				System.out.println("O");
			}
			
			// Middle row
			for (int middle=0; middle<size; middle++) {
				System.out.print("O");
			}
			// Next line
			System.out.println("");
			
			// Second half of left edge
			for (int left2=0; left2<(size-3)/2; left2++) {
				System.out.print("O");
				// Left spacing
				for (int lSpace=0; lSpace<(size-3)/2; lSpace++) {
					System.out.print(" ");
				}
				// Middle column
				System.out.print("O");
				// Right spacing
				for (int rSpace=0; rSpace<(size-3)/2; rSpace++) {
					System.out.print(" ");
				}
				// Right edge and next line
				System.out.println("O");
			}
			
			// Bottom row
			for (int bottom=0; bottom<size; bottom++) {
				System.out.print("O");
			}
			// Next line
			System.out.println("");
		}
		else {
			System.out.println("Please try again");
		}
		// Close scanner
		sc.close();
	}
}