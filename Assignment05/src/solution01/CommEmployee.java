package solution01;
import java.util.Scanner;

public class CommEmployee implements Employee{
	String name;
	double sales;
	float comm;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSales() {
		return sales;
	}

	public void setSales(double sales) {
		this.sales = sales;
	}

	public float getComm() {
		return comm;
	}

	public void setComm(float comm) {
		this.comm = comm;
	}

	@Override
	public void accept(Scanner sc) {
		System.out.print("Please enter Name :");
		this.name = sc.nextLine();
		System.out.print("Please enter sales :");
		this.sales= sc.nextDouble();
		System.out.print("Please enter commission :");
		this.comm = sc.nextFloat();
		sc.nextLine();

	}

	@Override
	public void display() {
		System.out.println("Name :"+this.name);
		System.out.println("Sales :"+this.sales);
		System.out.println("Commission :"+this.comm);
		
	}

	@Override
	public void payRoll() {
		System.out.println("Payroll : "+(this.comm*this.sales));
	}

}
