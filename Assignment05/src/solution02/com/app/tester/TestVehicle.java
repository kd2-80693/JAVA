package solution02.com.app.tester;

import solution02.com.app.vehicle.Vehicle;

public class TestVehicle {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle(100, "blue", 2000);
		Vehicle vehicle2 = new Vehicle(1000, "red", 2300);
		if(vehicle.equals(vehicle2))
			System.out.println("Same car - " + vehicle +" And "+vehicle2);
		else
			System.out.println("Diff car - " + vehicle +" And "+vehicle2);
	}

}
