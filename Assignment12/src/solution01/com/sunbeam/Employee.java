
package solution01.com.sunbeam;

import java.util.ArrayList;
import java.util.List;

interface emp {
	abstract double getSal();

	default double calcIncentives() {
		return 0;
	}

	static double calcTotalIncome(List<emp> arr) {
		double res = 0;
		for (emp e1 : arr) {
			res += e1.getSal() + e1.calcIncentives();
		}
		return res;
	}
}

class Manager implements emp {
	private double basicSal;
	private double dearanceAllowance;

	@Override
	public double getSal() {

		return basicSal + dearanceAllowance;
	}

	public Manager(double basicSal, double dearanceAllowance) {
		super();
		this.basicSal = basicSal;
		this.dearanceAllowance = dearanceAllowance;
	}

	@Override
	public double calcIncentives() {
		return  (basicSal * 0.2);
	}
}

class Labour implements emp {
	private int hrs;
	private double rate;

	@Override
	public double getSal() {

		return hrs * rate;
	}

	public Labour(int hrs, double rate) {
		super();
		this.hrs = hrs;
		this.rate = rate;
	}

	@Override
	public double calcIncentives() {
		if (hrs > 300)
			return hrs * rate * 0.5;
		return 0;
	}
}

class Clerk implements emp {

	private double sal;

	public Clerk(double sal) {
		super();
		this.sal = sal;
	}

	@Override
	public double getSal() {

		return sal;
	}
}

public class Employee {
	public static void main(String[] args) {
		ArrayList<emp> elist=new ArrayList<emp>();
		elist.add(new Manager(100, 10));
		elist.add(new Labour(300, 100));
		elist.add(new Clerk(200));
		
		System.out.println("Total Sal: "+emp.calcTotalIncome(elist));
		
	}
}
