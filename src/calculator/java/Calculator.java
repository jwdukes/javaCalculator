package calculator.java;

public class Calculator {
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}
	public double divide(double num1, double num2) {
		if (num2 !=0) {
			return num1 / num2;
		} else {
			return -1d;
		}
		
		
	}
	public int square(int num1) {
		return num1 * num1;
	}
}
