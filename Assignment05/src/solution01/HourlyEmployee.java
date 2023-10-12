package solution01;
import java.util.Scanner;

public class HourlyEmployee implements Employee {
	String name;
	double rate;
	float hours;

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public float getHours() {
		return hours;
	}

	public void setHours(float hours) {
		this.hours = hours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void accept(Scanner sc) {
		System.out.print("Please enter Name :");
		this.name = sc.nextLine();
		System.out.print("Please enter rate :");
		this.rate = sc.nextDouble();
		System.out.print("Please enter hours :");
		this.hours = sc.nextFloat();
		sc.nextLine();

	}

	@Override
	public void display() {
		System.out.println("Name :" + this.name);
		System.out.println("Rate :" + this.rate);
		System.out.println("Hours :" + this.hours);
	}

	@Override
	public void payRoll() {
		double salary = 0;
		float x = hours;
		if(x > 40)
		{
			salary+=(this.rate*1.5)*(x-40);
			x = 40;
		}
		salary+=this.rate*x;
		System.out.println("Payroll : "+salary);
	}

}
