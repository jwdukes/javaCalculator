package calculator.java;

public class MagicCalculator extends Calculator {

	public double squareRoot (double number) {
		return Math.sqrt(number);
	}
	
	public double sin (double number) {
		return Math.sin(number);
	}
	
	public double cos (double number) {
		return Math.cos(number);
	}
	
	public double tan (double number) {
		return Math.tan(number);
	}
	
	public Integer factorial (Integer number) {
		Integer result = 1; 
		for (Integer i=2; i<=number; i++) {
			result *=i;
		} 
		return result;	
	}
	
	
	
	
	
}
