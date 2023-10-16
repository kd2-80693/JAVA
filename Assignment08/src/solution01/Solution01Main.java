package solution01;

/*
  
 * 1. Copy Person class and inherited classes (Employee, Salesman, Manager, SalesManager) from previous assignment/classwork. Implement generic class
Box so that it can store any Person in it. How to get total salary of the Employee in Box?

 */

class Box<T extends Employee> {
	private T obj;

	public T get() {
		return this.obj;
	}

	public void set(T obj) {
		this.obj = obj;
	}
	public double getTotalSalary() {
		return obj.calculateSalary();
		
	}
}

public class Solution01Main {
	public static void main(String[] args) {
//		Box<Manager> b1 = new Box<>();
//		Manager m = new Manager(1,100,200);
//		b1.set(m);
//		
//		System.out.println(b1.getTotalSalary());
		
		Box<Employee> b1 = new Box<>();
//		b1.set(new Manager(1,100,200));
		b1.set(new Salesman(1,100,200));
		
		
		
		System.out.println(b1.getTotalSalary());
		System.out.println(b1.get());
		
		
	}
	
}
