package calculator.java;

public class Main {

	public static void main(String[] args) {
		Calculator genericCalc = new Calculator();
		MagicCalculator magicCalc = new MagicCalculator();
		
		int sum = genericCalc.add(1, 5);
		System.out.println("The sum is " + sum);
	
		int difference = genericCalc.subtract(1, 5);
		System.out.println("The difference is " + difference);
	
		int multiplication = genericCalc.multiply(1, 5);
		System.out.println("The multiplication is " + multiplication);
		
		double division = genericCalc.divide(1, 5);
		System.out.println("The division is " + division);
	
		int squared = genericCalc.square(3);
		System.out.println("The square of num1 is " + squared);
	
	}	
}
