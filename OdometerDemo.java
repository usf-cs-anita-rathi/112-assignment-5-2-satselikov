public class OdometerDemo {
	public static void main(String[] args) {
		System.out.println("TRIP NUMBER ONE!!!");
		Odometer trip1 = new Odometer();
		System.out.println("Number of Miles: 200");
		int extraMiles1 = 200;
		trip1.addMiles(extraMiles1);
		System.out.println("Fuel Efficiency: 15 MPG");
		double MPG = 15.0;
		trip1.setMilesPerGallon(MPG);
		System.out.println("Gas consumed: " + trip1.getGasolineConsumed());
		trip1.resetMiles();
		System.out.println("Gas consumed after reset: " + trip1.getGasolineConsumed());

		System.out.println(" ");
		System.out.println("TRIP NUMBER TWO!!!");
		Odometer trip2 = new Odometer();
		System.out.println("Number of Miles: 5,000");
		int extraMiles2 = 5000;
		trip2.addMiles(extraMiles2);
		System.out.println("Fuel Efficiency: 35 MPG");
		double MPG2 = 35.0;
		trip2.setMilesPerGallon(MPG2);
		System.out.println("Gas consumed: " + trip2.getGasolineConsumed());
		trip2.resetMiles();
		System.out.println("Gas consumed after reset: " + trip2.getGasolineConsumed());

		System.out.println(" ");
		System.out.println("TRIP NUMBER THREE!!!");
		Odometer trip3 = new Odometer();
		System.out.println("Number of Miles: 375");
		int extraMiles3 = 375;
		trip3.addMiles(extraMiles3);
		System.out.println("Fuel Efficiency: 12 MPG");
		double MPG3 = 12.0;
		trip3.setMilesPerGallon(MPG3);
		System.out.println("Gas consumed: " + trip3.getGasolineConsumed());
		trip3.resetMiles();
		System.out.println("Gas consumed after reset: " + trip3.getGasolineConsumed());

	}
}
