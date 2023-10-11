package com.app.fruits;

import java.util.Scanner;

public class Fruit {
	static Scanner sc = new Scanner(System.in);
	String color ;
	double weight;
	String name;
	boolean isFresh;
	public Fruit( String name, boolean isFresh) {
		this.name = name;
		this.isFresh = isFresh;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFresh() {
		return isFresh;
	}
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	@Override
	public String toString() {
		return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}
	
	public void accept() {
		System.out.print("Enter color : ");
		this.color = sc.nextLine();
		System.out.print("Enter Weight : ");
		this.weight = sc.nextDouble();
		sc.nextLine();
	}
	public String taste() {
		// TODO Auto-generated method stub
		return "no specific taste";
	}
}
