package solution01;

public class ExceptionLineTooLong extends RuntimeException {
	public void displayError() {
		System.out.println("The string is too long");
	}
}
