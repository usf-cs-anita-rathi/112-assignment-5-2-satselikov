public class Temperature {

	// instance variables
	double temperature;
	char scale;

	// Constructor method
	// one for temp instance variable
	// assume 0 degrees if no value specified and Celsius if no scale is specified
	public Temperature(char scale) {
		this.scale = scale;
		temperature = 0;
	}

	// Constructor method
	// one for scale instance variable
	// assume 0 degrees if no value specified and Celsius if no scale is specified
	public Temperature(double temperature) {
		this.temperature = temperature;
		scale = 'C';
	}

	// Constructor method
	// two parameters for the two instance variables
	public Temperature(double temperature, char scale) {
		this.temperature = temperature;
		this.scale = scale;
	}

	// Constructor method
	// no argument constructor (set to 0 degrees Celsius)
	public Temperature() {
		temperature = 0;
		scale = 'C';
	}

	// accessor method #1 to return the temperature
	// one to return in degrees Celsius
	// DegreesC=5(degreesF-32)/9
	// round to the nearest tenth of a degree
	public double getCelsius() {
		if (scale == 'C')
			return temperature;
		else
			return ((double) (Math.round((5 * (temperature - 32.0) / 9.0))));
	}

	// accessor method #2 to return the temperature
	// one to return in degrees Fahrenheit
	// DegreesF=(9(degreesC)/5+32);
	// round to the nearest tenth of a degree
	public double getFahrenheit() {
		if (scale == 'F')
			return temperature;
		else
			return (Math.round((9 * (temperature / 5) + 32)));
	}
	
	// get method to return string of temperature
	public double getTemperature() {
		return temperature;
	}

	// get method to return string of scale
	public char getScale() {
		return scale;
	}

	// mutator method
	// one to set the value
	public void setTemp(double temperature) {
		this.temperature = temperature;
	}

	// mutator method
	// one to set the scale (F or C)
	public void setScale(char scale) {
		this.scale = scale;
	}

	// mutator method
	// one to set both
	public void setTempScale(double temperature, char scale) {
		this.temperature = temperature;
		this.scale = scale;
	}

//three comparison methods
	// one to test whether two temperatures are equal
	public boolean equals(Temperature temp) {
		if (this.getCelsius() == temp.getCelsius())
			return true;
		else
			return false;
	}

	// one to test whether one temperature is greater than another
	public boolean tGreaterThan(Temperature temp) {
		if (this.getCelsius() > temp.getCelsius())
			return true;
		else
			return false;
	}

	// one to test whether one temperature is less than another
	public boolean tLessThan(Temperature temp) {
		if (this.getCelsius() < temp.getCelsius())
			return true;
		else
			return false;
	}

	// toString method
	public String toString() {
		if (getScale() == 'F')
			return getTemperature() + " Degrees F = " + getCelsius() + " Degrees C";
		else
			return getTemperature() + " Degrees C = " + getFahrenheit() + " Degrees F" ;

	}
}
