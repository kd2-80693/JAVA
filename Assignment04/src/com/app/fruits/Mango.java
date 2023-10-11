package com.app.fruits;

public class Mango extends Fruit {

	public Mango() {
		super("Mango" , true);	
	}

	@Override
	public String taste() {
		return "sweet";
	}

	@Override
	public void accept() {
		super.accept();
	}
	
}
