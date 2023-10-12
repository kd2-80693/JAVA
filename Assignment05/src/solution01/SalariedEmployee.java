package solution01;
import java.util.Scanner;

public class SalariedEmployee implements Employee {
	String name;
	double sal;
	
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

	

	@Override
	public void accept(Scanner sc) {
		System.out.print("Please enter Name :");
		this.name = sc.nextLine();
		System.out.print("Please enter salary :");
		this.sal = sc.nextDouble();
		sc.nextLine();
	}

	@Override
	public void display() {
		System.out.println("Name :"+this.name);

		System.out.println("Salary :"+this.sal);
	}

	@Override
	public void payRoll() {
		System.out.println("Payroll : "+this.sal);

	}

}
