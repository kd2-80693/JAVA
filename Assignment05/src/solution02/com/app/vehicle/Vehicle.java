package solution02.com.app.vehicle;

import java.util.Objects;

public class Vehicle {
	int chasisNo;
	String color;
	double price;
	
	
	
	public Vehicle(int chasisNo, String color, double price) {
		super();
		this.chasisNo = chasisNo;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", color=" + color + ", price=" + price + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return chasisNo == other.chasisNo;
	}
	
	
	
}
