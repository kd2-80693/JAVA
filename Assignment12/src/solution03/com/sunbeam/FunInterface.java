
package solution03.com.sunbeam;

import java.util.Scanner;


public class FunInterface {

	@FunctionalInterface
	interface Arithmetic {
		abstract double calc(double d1, double d2);
	}

	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: " + result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choice = 1;
		Double x = 0.0, y = 0.0;
		while (choice != 0) {
			System.out.println("Press 1 to ADD\nPress 2 to SUB\nPress 3 to MUL\nPress 4 to DIV\n enter choice: ");
			choice = new Scanner(System.in).nextInt();
			System.out.println("ENTER NUMBERS");
			x = new Scanner(System.in).nextDouble();
			y = new Scanner(System.in).nextDouble();
			switch (choice) {
			case 1:
				calculate(x, y, (a, b) -> a + b);
				break;
			case 2:
				calculate(x, y, (a, b) -> a - b);
				break;
			case 3:
				calculate(x, y, (a, b) -> a * b);
				break;
			case 4:
				calculate(x, y, (a, b) -> a / b);
				break;
			default:
				System.out.println("Wrong Choice ...............");

			}
		}
	}

}
