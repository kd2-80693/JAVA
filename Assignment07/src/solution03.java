import java.util.Scanner;

public class solution03 {
	public static void main(String[] args) {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string ");
		String s  = sc.nextLine();
		for(int i = 0 ; i < s.length() ; i++)
		{
			if(s.charAt(i) != s.charAt(s.length()-i-1))
				flag = false;
				
		}
		if(flag)
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
	}
}
