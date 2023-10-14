package solution04_optional;

import java.util.Scanner;

public class Tv extends Electronics {
	int screen_inches;
	int pixel_density;
	@Override
	void acceptData(Scanner sc) {
		super.accept(sc);
		System.out.print("Enter screen_inches: ");
		this.screen_inches = sc.nextInt();
		System.out.print("Enter pixel_density: ");
		this.pixel_density = sc.nextInt();
	}

	@Override
	void printData() {
		super.print();
		System.out.println("screen_inches : "+screen_inches);
		System.out.println("pixel_density : " + pixel_density);
	}
}
