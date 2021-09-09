/**
 * Test program for our OOP Farm
 * @author Mr. Reid
 * @course ICs4UC
 * @date 2020/05/12
 */
public class FirstTestFarmEricM {

	public static void main(String[] args) {
		// Create Betty
		HorseEricM betty = new HorseEricM("Betty", 2010);
		
		// Get Betty to eat
		betty.eat(2);
		
		// Groom Betty
		betty.groom();
		
		// Get Betty to run
		betty.run(1000, 3600);
		System.out.println(betty);
		
		// Get Betty to make a noise
		betty.makeNoise();
	}
}