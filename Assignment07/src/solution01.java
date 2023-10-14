import java.util.Scanner;

public class solution01 {
	public static void main(String[] args) {
		String [] arr = new String[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a len");
		int len = sc.nextInt();
		sc.nextLine();
		for(int i = 0 ; i < len ; i++)
		{
			System.out.print("Enter a string ");
			arr[i] = sc.nextLine();
		}
		
		for(int i = 0 ; i < len ; i++)
		{
			for(int j = i+1 ; j < len ; j++)
			if(arr[i].equals(arr[j]))
			{
				System.out.println("Duplicate : " + arr[i]);
			}
				
		}
		
		
	}
}
