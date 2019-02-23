public class TemperatureTest {
	public static void main(String[] args) {
		System.out.println("Convert Fahrenheit to Celsius Test: ");
		Temperature fahrenheitToCelsius = new Temperature(0, 'F');
		System.out.println(fahrenheitToCelsius.toString());

		fahrenheitToCelsius.setTempScale(-40, 'F');
		System.out.println(fahrenheitToCelsius.toString());

		fahrenheitToCelsius.setTempScale(100, 'F');
		System.out.println(fahrenheitToCelsius.toString());

		System.out.println(" ");

		System.out.println("Convert Celsius to Fahrenheit Test: ");
		Temperature celsiusToFahrenheit = new Temperature(0, 'C');
		System.out.println(celsiusToFahrenheit.toString());

		celsiusToFahrenheit.setTempScale((-40), 'C');
		System.out.println(celsiusToFahrenheit.toString());

		celsiusToFahrenheit.setTempScale(100, 'C');
		System.out.println(celsiusToFahrenheit.toString());

		System.out.println(" ");

		System.out.println("Compare Fahrenheit Temperatures: ");

		Temperature fahrenheitTempOne = new Temperature(130, 'F');
		Temperature fahrenheitTempTwo = new Temperature(200, 'F');
		if (fahrenheitTempOne.equals(fahrenheitTempTwo))
			System.out.println(
					fahrenheitTempOne.getFahrenheit() + " " + fahrenheitTempOne.getScale() + " temperature is equal to "
							+ fahrenheitTempTwo.getFahrenheit() + " " + fahrenheitTempTwo.getScale());
		else if (fahrenheitTempOne.tLessThan(fahrenheitTempTwo))
			System.out.println(fahrenheitTempOne.getFahrenheit() + " " + fahrenheitTempOne.getScale()
					+ " temperature is less than " + fahrenheitTempTwo.getFahrenheit() + " "
					+ fahrenheitTempTwo.getScale());
		else
			System.out.println(fahrenheitTempOne.getFahrenheit() + " " + fahrenheitTempOne.getScale()
					+ " temperature is greater than " + fahrenheitTempTwo.getFahrenheit() + " "
					+ fahrenheitTempTwo.getScale());

		Temperature celsiusTempOne = new Temperature(50, 'C');
		Temperature celsiusTempTwo = new Temperature(26, 'C');
		if (celsiusTempOne.equals(celsiusTempTwo))
			System.out.println(celsiusTempOne.getCelsius() + " " + celsiusTempOne.getScale()
					+ " temperature is equal to " + celsiusTempTwo.getCelsius() + " " + celsiusTempTwo.getScale());
		else if (celsiusTempOne.tLessThan(celsiusTempTwo))
			System.out.println(celsiusTempOne.getCelsius() + " " + celsiusTempOne.getScale()
					+ " temperature is less than " + celsiusTempTwo.getCelsius() + " " + celsiusTempTwo.getScale());
		else
			System.out.println(celsiusTempOne.getCelsius() + " " + celsiusTempOne.getScale()
					+ " temperature is greater than " + celsiusTempTwo.getCelsius() + " " + celsiusTempTwo.getScale());

	}

}
