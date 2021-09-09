/**
 * Example Car class from the lessons
 * @author Mr. Reid and Eric Medina
 * @course ICS4UC
 * @date 2020/10/01
 */
public class CarEricM {
	// Attributes
	private String make = "";
	private String model = "";
	private String colour = "";
	private int year = 0;
	private boolean engineRunning = false;
	// New attributes added
	private double gas = 0;
	private int odometer = 0;
	private String plate = "";
	private boolean gasRefill = false;
	private int speedometer = 0;

	// Constructor
    public CarEricM(String make, String model, String colour, int year, double gas, int odometer, String plate) {
		// Set data as attributes
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.engineRunning = false;
		this.gas = gas;
		this.odometer = odometer;
		this.plate = plate;
		this.gasRefill = false;
		this.speedometer = 0;

         // Year cannot be in future
		if (year > 2020) {
			this.year = 2020;
		} else {
			this.year = year;
		}
    } 

    // Default Constructor
    public CarEricM()
	{
		// Default attributes
		this("VW", "Golf", "White", 2000, 40, 0, "ABCD123");
	}
    
    /**
     * toString function
     */
 	public String toString( ) {
 	   String result = this.year+" "+this.make+": "+this.model+" in "+this.colour+" with "+this.gas+" L and "+this.odometer+"km"+"\n"+"License plate: "+this.plate;
 	   return result;
 	}

 	/**
 	 * start the cars engine
 	 * @return did it start or not
 	 */
 	public boolean startEngine() {
 		// Keep the engine running as long as there is gas
		if (gas > 0) {
			this.engineRunning  = true;
		}
		return this.engineRunning;
	}
	
 	/**
 	 * shut off the engine
 	 */
	public void stopEngine() {
		this.engineRunning = false;
		speedometer = 0;
	}
	
	/**
	 * Notify if refill is needed
	 */
	public boolean gasRefill() {
		return this.gasRefill;
	}
	
	/**
	 * Drive the car
	 * @param howFar
	 * @param speed
	 * @return did it go that far
	 */
	public boolean drive(int howFar, int speed) {
		boolean result = false;
		this.speedometer = speed;
		// Is the engine running with gas to spare?
		if (this.engineRunning && this.gas > 0) {
			// Decrease the gas by the distance travelled and travel velocity
			this.gas -= ((speedometer * 0.05) + (howFar * 0.1));
			result = true;
			this.odometer += howFar;
		}
		// Set gas to 0 and stop engine
		if (this.gas <= 0) {
			gasRefill = true;
			this.gas = 0;
			this.stopEngine();
		}
		return result;
	}
}