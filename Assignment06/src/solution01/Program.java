package solution01;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String s = sc.nextLine();
			if(s.length()>80)
				throw new ExceptionLineTooLong();
		}
		catch (ExceptionLineTooLong e) {
			e.displayError();
		}
		finally {
			sc.close();
		}
		System.out.println("Program ends");
	}
}
