package solution04_optional;

import java.util.Scanner;

public abstract class Electronics {
	String model;
	String description;
	double price;
	
	void accept(Scanner sc) {
		System.out.print("Enter Model: ");
		this.model = sc.nextLine();
		System.out.print("Enter Description: ");
		this.description = sc.nextLine();
		System.out.print("Enter price: ");
		this.price = sc.nextDouble();
	}
	
	abstract void acceptData(Scanner sc);
	
	
	void print() {
		System.out.println("Model: " + model);
		System.out.println("Description: "+description);
		System.out.println("Price: " + price);
	}
	
	abstract void printData();
}
