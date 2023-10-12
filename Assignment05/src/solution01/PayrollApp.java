package solution01;
import java.util.Scanner;

public class PayrollApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee employee = new SalariedEmployee();
		employee.accept(sc);
		employee.display();
		employee.payRoll();
		
		employee = new HourlyEmployee();
		employee.accept(sc);
		employee.display();
		employee.payRoll();
		
		employee = new CommEmployee();
		employee.accept(sc);
		employee.display();
		employee.payRoll();
		
		employee = new BaseSalariedCommEmployee();
		employee.accept(sc);
		employee.display();
		BaseSalariedCommEmployee e1 = (BaseSalariedCommEmployee) employee ; 
		e1.setSal(e1.getSal()*1.1);
		employee.payRoll();
		sc.close();
	}

}
