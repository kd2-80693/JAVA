import java.util.Scanner;

public interface Solution03 {
static Scanner sc = new Scanner(System.in);
	
	public static int menu()
	{
		int choice;
		System.out.println("***********************************");
		System.out.println("Welcome to JAVA - Food Menu");
		System.out.println("0. EXIT");
		System.out.println("1. Dosa");
		System.out.println("2. Samosa");
		System.out.println("3. idli");
		System.out.println("4. vada pav");
		System.out.println("5. chole bhature");
		System.out.println("6. aalu prantha");
		System.out.println("7. pav bahji");
		System.out.println("8. misal");
		System.out.println("9. burger");
		System.out.println("10. Generate bill");
		System.out.print("Please enter your choice : ");
		choice = sc.nextInt();
		System.out.println("************************************");
		return choice;
		
	}	
	
	public static void main(String[] args) {
		int bill  =0 ;
		boolean flag = true;
		int choice ;
		while( flag && (choice = menu())!=0  )
		{
			
			switch(choice)
			{
			case 1:
				System.out.println("rate : 10 added ");
				bill+=10;
				break;
			case 2:

				System.out.println("rate : 20 added ");
				bill+=20;
				break;
			case 3:


				System.out.println("rate : 30 added ");
				bill+=30;
				break;
			case 4:


				System.out.println("rate : 40 added ");
				bill+=40;
				break;
			case 5:


				System.out.println("rate : 50 added ");
				bill+=50;
				break;
			case 6:


				System.out.println("rate : 60 added ");
				bill+=60;
				break;
			case 7:


				System.out.println("rate : 70 added ");
				bill+=70;
				break;
			case 8:


				System.out.println("rate : 80 added ");
				bill+=80;
				break;
			case 9:


				System.out.println("rate : 90 added ");
				bill+=90;
				break;
			case 10:
				System.out.println("Total Bill = " + bill);
				flag = false;
				break;
				
			default : 
				System.out.println("TRY AGAIN");
				break;
			}
		}
	}
}
