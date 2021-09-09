import java.util.Scanner;
/**
 * Story Generator
 * @author Eric Medina
 * @course ICS4UC
 * @date 2020/09/17
 */
public class storyGeneratorEricM {

	public static void main(String[] args) {
		// Setup input from keyboard
		Scanner sc = new Scanner(System.in);
		
		// Give room number and prompt user to take left or right hall
		System.out.println("It is your first day at school. Your class number is 221");
		System.out.print("Take the left hall, or right hall? ");
		String response = sc.next();
		// Determine whether they take left or right hall
		if (response.equalsIgnoreCase("left")) {
			// Prompt user progress and ask to enter class
			System.out.println("You see a class that does not have a number on it.");
			System.out.print("Enter the class?: ");
			response = sc.next();
			// Determine whether they enter the class or not
			if (response.equalsIgnoreCase("yes")) {
				// End result
				System.out.println("The teacher tells you that this is computer studies class.");
				System.out.println("You have made it to class on time.");
			}
			else if (response.equalsIgnoreCase("no")) {
				// End result
				System.out.println("You look all over the second floor for your class and find that the correct class is the one without the number on the door.");
				System.out.println("You made it to class 10 minutes late.");
			}
			else {
				// Prompt user to restart program
				System.out.println("Please try again.");
			}
		}
		else if (response.equalsIgnoreCase("right")) {
			// Prompt user progress and to ask nearby student or not
			System.out.println("You go to the other side of the school");
			System.out.print("Ask a nearby student where your classroom is?: ");
			response = sc.next();
			// Determine whether they asked the student or not
			if (response.equalsIgnoreCase("yes")) {
				// End result
				System.out.println("The student gives you the wrong directions to a different class");
				System.out.println("You look all over the second floor for your class and finally find it.");
				System.out.println("You are 15 minutes late to class");
			}
			else if (response.equalsIgnoreCase("no")) {
				// Prompt user progress and ask to enter class
				System.out.println("You see a class that does not have a number on it.");
				System.out.print("Enter the class?: ");
				response = sc.next();
				// Determine whether user enters class or not
				if (response.equalsIgnoreCase("yes")) {
					// End result
					System.out.println("The teacher tells you that this is computer studies class.");
					System.out.println("You have made it to class on time.");
				}
				else if (response.equalsIgnoreCase("no")) {
					// End result
					System.out.println("You look all over the second floor for your class and finally find it.");
					System.out.println("You are 20 minutes late to class");
				}
				else {
					// Prompt user to restart program
					System.out.println("Please try again.");
				}
			}
			else {
				// Prompt user to restart program
				System.out.println("Please try again.");
			}
		}
		else {
			// Prompt user to restart program
			System.out.println("Please try again.");
		}
		
		// Close scanner
		sc.close();
	}

}
