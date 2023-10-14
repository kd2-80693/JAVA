package solution02;

public class NegativeDiameterException extends RuntimeException {
	public void displayError() {
		System.out.println("The diameter cannot be negative");
	}
}
