package solution06.com.sunbeam;

import java.util.Scanner;

public class Student {
	private int roll;
	private String name;
	private double marks;
	public Student(int roll, String name, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	public Student() {
		super();
		this.roll = 0;
		this.name = "";
		this.marks = 0;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public void accept() {
		System.out.println("Enter Roll: ");
		setRoll(new Scanner(System.in).nextInt());
		System.out.println("Enter Name: ");
		setName(new Scanner(System.in).next());
		System.out.println("Enter Marks: ");
		setMarks(new Scanner(System.in).nextDouble());
		
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
