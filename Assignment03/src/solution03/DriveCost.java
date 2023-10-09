package solution03;

public class DriveCost {
	int totalDistance;
	int fuelCost;
	int avg;
	int parking;
	int tolls;
	
	public DriveCost(int totalDistance, int fuelCost, int avg, int parking, int tolls) {
		this.totalDistance = totalDistance;
		this.fuelCost = fuelCost;
		this.avg = avg;
		this.parking = parking;
		this.tolls = tolls;
	}
	public void calculate() {
		int cost=totalDistance/avg;
		cost=cost*fuelCost+parking+tolls;
		System.out.println("Total Cost: "+cost);
	}
}
