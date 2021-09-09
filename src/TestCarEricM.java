/**
 * Main program for testing the Car class
 * @author Mr. Reid and Eric Medina
 * @course ICS4UC
 * @date 2020/10/01
 *
 */
public class TestCarEricM {
	/**
	 * Main Program
	 */
	public static void main(String[] args) {
		// Create a car objects
		CarEricM frank = new CarEricM();
//		CarEricM juddy = new Car("VW", "Jetta", "Red", 1992, 50, 0, "DFSH867");
//		CarEricM betsy = new Car("Ford"); // Does not work
		
		System.out.println(frank);
		// Let's go for a drive
		frank.startEngine();
		// Does the gas tank need a refill?
		while (!frank.gasRefill()) {
			// Set driving distance and speed
			if (frank.drive(20, 60)) {
				System.out.println(frank);
				// Did I run out of gas?
				if (frank.gasRefill()) {
					System.out.println("Shoot! I have to refill on gas.");
				}
				else {
					System.out.println("I still have gas.");
				}
			}
		}
	}
}