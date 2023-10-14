package solution04_optional;

import java.util.Scanner;

public class Mobile extends Electronics {
	int ram;
	int storage;
	@Override
	void acceptData(Scanner sc) {
		super.accept(sc);
		System.out.print("Enter Ram: ");
		this.ram = sc.nextInt();
		System.out.print("Enter Storage: ");
		this.storage = sc.nextInt();
	}

	@Override
	void printData() {
		super.print();
		System.out.println("Ram : "+ram);
		System.out.println("Storage : " + storage);
	}

}
