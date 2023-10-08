import java.util.*;
public class Solution01 {
	static Scanner sc = new Scanner(System.in);
	
	public static int menu()
	{
		int choice;
		System.out.println("***********************************");
		System.out.println("Welcome to JAVA - number conversion");
		System.out.println("0. EXIT");
		System.out.println("1. Binary");
		System.out.println("2. Octal");
		System.out.println("3. Hexadecimal");
		System.out.print("Please enter your choice : ");
		choice = sc.nextInt();
		System.out.println("************************************");
		return choice;
		
	}
	public static void main(String[] args) {
		int choice ;
		int num ;
		while((choice = menu())!=0)
		{
			System.out.print("Please enter num :");
			num = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println(Integer.toBinaryString(num));
				break;
			case 2:
				System.out.println(Integer.toOctalString(num));
				break;
			case 3:

				System.out.println(Integer.toHexString(num));
				break;
			default : 
				System.out.println("TRY AGAIN");
				break;
			}
		}

	}

}
