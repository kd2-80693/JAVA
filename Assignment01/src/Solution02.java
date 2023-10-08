import java.util.*;
public class Solution02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double s1=0;
		double s2=0;
		
		if( sc.hasNextInt() && sc.hasNext())
			System.out.println("NOT A DOUBLE");
		else 
			s1 = sc.nextDouble();

		if( sc.hasNextInt() && sc.hasNext())
			System.out.println("NOT A DOUBLE");
		else 
			s2 = sc.nextDouble();
		System.out.println((s1+s2)/2);
			
		sc.close();
		
	}
}
