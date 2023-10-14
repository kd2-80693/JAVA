package solution02;

public class Tester {
	public static void main(String[] args) {
		Circle circle = new Circle();
		
		try {
			circle.setMyDiameter(-10);
		}
		catch(NegativeDiameterException e){
			e.displayError();
		}

	}

}
