package solution02;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee("kritagya", "Chopra ", 2000);
		Employee e2 = new Employee("gaurav", "sri ", 1000);
		System.out.println("e1 : "+e1.getSalary());
		System.out.println("e2 : "+e2.getSalary());
		e1.setSalary((e1.getSalary()*1.10));
		e2.setSalary((e2.getSalary()*1.10));
		System.out.println("e1 : "+e1.getSalary());
		System.out.println("e2 : "+e2.getSalary());
	}
}
