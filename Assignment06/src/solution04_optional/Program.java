package solution04_optional;

import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	public static int menu()
	{
		int choice;
		System.out.println("***********************************");
		System.out.println("Welcome to JAVA - number conversion");
		System.out.println("0. EXIT");
		System.out.println("1. Add");
		System.out.println("2. Display");
		System.out.println("3. Purchase");
		System.out.print("Please enter your choice : ");
		choice = sc.nextInt();
		System.out.println("************************************");
		return choice;
		
	}
	public static void main(String[] args) {
		Electronics[] arr = new Electronics[3];
		arr[0] = new Mobile();
		arr[1] = new Tv();
		int choice ;
		while((choice = menu())!=0)
		{
			switch(choice)
			{
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			default : 
				System.out.println("TRY AGAIN");
				break;
			}
		}

	}
}
