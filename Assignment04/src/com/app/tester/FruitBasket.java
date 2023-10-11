package com.app.tester;

import java.util.Scanner;

import com.app.fruits.Apple;
import com.app.fruits.Fruit;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

public class FruitBasket {
static Scanner sc = new Scanner(System.in);
	
	public static int menu()
	{
		int choice;
		System.out.println("***********************************");
		System.out.println("Welcome to JAVA - Fruit Basket");
		System.out.println("0. EXIT");
		System.out.println("1. Add Mango");
		System.out.println("2. Add Orange");
		System.out.println("3. Add Apple");
		System.out.println("4. Display names of all fruits");
		System.out.println("5. Display name,color,weight,taste of all fruits");
		System.out.println("6. Display taste of all stale fruits");
		System.out.println("7. Mark a fruit as stale");
		System.out.println("8. Mark all fruits as stale");
		System.out.print("Please enter your choice : ");
		choice = sc.nextInt();
		System.out.println("************************************");
		return choice;
		
	}
	public static void main(String[] args) {
		int choice ;
		int len;
		int rtemp;
		System.out.print("Enter size of basket : ");
		len = sc.nextInt();
		Fruit[] basket  = new Fruit[len];
		int temp = 0;
		while((choice = menu())!=0)
		{
			switch(choice)
			{
			case 1:
				if(temp<len) {
				Mango mango = new Mango();
				mango.accept();
				basket[temp] = mango;
				temp++;				
				}
				break;
			case 2:
				if(temp<len) {
					Orange orange = new Orange();
					orange.accept();
					basket[temp] = orange;
					temp++;				
					}
				break;
			case 3:
				if(temp<len) {
					Apple apple = new Apple();
					apple.accept();
					basket[temp] = apple;
					temp++;				
					}
				break;
			case 4:
				for(Fruit bas : basket)
				{
					if(bas!=null)
					System.out.println(bas.getName());
				}
				break;
			case 5:
				for(Fruit bas : basket)
				{
					if(bas!=null)
					System.out.println(bas);
				}
				break;
			case 6:
				for(Fruit bas : basket)
				{
					if(bas!=null && bas.isFresh())
					System.out.println(bas.taste());
				}
				break;
			case 7:
			{
				System.out.print("Enter index : ");
				rtemp = sc.nextInt();
				if(rtemp >temp || rtemp < 0)
					System.out.println("ERROR : TRY WITH VALID INDEX");
				else
				{
					basket[rtemp].setFresh(false);
				}
			}
				break;
			case 8:
				for(Fruit bas : basket)
				{
					if(bas!=null && bas.taste().contains("sour"))
						bas.setFresh(false);
				}
				break;
			default : 
				System.out.println("TRY AGAIN");
				break;
			}
		}

	}

}
