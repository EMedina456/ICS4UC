import java.util.Calendar;

/**
 * Horse child class for OOP Farm
 * @author Eric Medina
 * @course ICS4UC
 * @date 2020/06/10
 */
public class HorseEricM extends Animal {
	// Attribute
	protected double distanceRan = 0;
	protected double timeRan = 0;
	protected double speed = 0;
	protected Calendar lastGroomed = null;
	
	/**
	 * Constructor
	 * @param newName
	 * @param whenBorn
	 * @param speed
	 * @param distance
	 * @param time
	 */
	public HorseEricM(String newName, int whenBorn) {
		super(newName, whenBorn);
		this.distanceRan = 0;
		this.timeRan = 0;
		this.speed = 0;
		this.lastGroomed = Calendar.getInstance();
	}
	
	//Behaviours
	/**
	 * toString Function
	 * @return result
	 */
	public String toString() {
		String result = super.toString()+" Speed: "+this.speed+"km/h. Travelled: "+this.distanceRan+"m in "+this.timeRan+"s";
		return result;
	}
	
	/**
	 * Groom the horse
	 * @return amount of times groomed
	 */
	public int groom() {
		System.out.println("Was groomed today");
		this.lastGroomed = Calendar.getInstance();
		return 1;
	}
	
	/**
	 * Calculate the speed that the horse is running based on distance and time
	 * @param time
	 * @param distance
	 * @return result
	 */
	public boolean run(double distance, double time) {
		// Get distance and time and translate it to kilometers and hours
		this.distanceRan = distance;
		this.timeRan = time;
		distance = distance*0.001;
		time = (time/60)/60;
		
		// Calculate speed
		this.speed = (distance/time);
		boolean result = true;
		return result;
	}
	
	/**
	 * Make some Noise
	 */
	public String makeNoise() {
		return "neigh";
	}
}