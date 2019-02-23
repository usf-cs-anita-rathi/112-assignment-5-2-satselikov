public class Odometer {

	// instance variables
	// track miles driven
	public int milesDriven;
	public double milesPerGallon;

	// constructor that defaults milesDriven and milesPerGallon to 0
	public Odometer() {
		milesDriven = 0;
		milesPerGallon = 0;
	}

	// constructor
	public Odometer(int milesDriven, double milesPerGallon) {
		this.milesDriven = milesDriven;
		this.milesPerGallon = milesPerGallon;

	}

	// mutator to reset miles back to 0
	public void resetMiles() {
		milesDriven = 0;
	}

	// a mutator method that accepts miles driven for a trip and adds it to the
	// odometer’s total
	public void addMiles(int miles) {
		milesDriven += miles;
	}

	// accessor to get milesDriven
	public int getMiles() {
		return milesDriven;
	}

	// mutator to set MPG
	public void setMilesPerGallon(double milesPerGallon) {
		this.milesPerGallon = milesPerGallon;
	}

	// accessor to get MPG
	public double getMilesPerGallon() {
		return milesPerGallon;
	}

	// accessor to get gasoline amount consumed
	public double getGasolineConsumed() {
		return (milesDriven / milesPerGallon);
	}
}
