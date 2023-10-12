package solution01;
import java.util.Scanner;

public class BaseSalariedCommEmployee implements Employee{
	String name;
	double sal;
	int sales;
	float comm;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
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
		System.out.print("Please enter Salary :");
		this.sal = sc.nextDouble();
		System.out.print("Please enter sales :");
		this.sales= sc.nextInt();
		System.out.print("Please enter commission :");
		this.comm = sc.nextFloat();	
		sc.nextLine();
	}

	@Override
	public void display() {
		System.out.println("Name :"+this.name);
		System.out.println("Salary :"+this.sal);
		System.out.println("Sales :"+this.sales);
		System.out.println("Commission :"+this.comm);
		
		
	}

	@Override
	public void payRoll() {
		System.out.println("Payroll : "+(this.sal+(this.comm*this.sales)));
		
	}

}
