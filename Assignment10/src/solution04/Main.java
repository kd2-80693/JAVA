package solution04;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		//Collection<String> c = new ArrayList<>();
		//Collection<String> c = new HashSet<>();
		//Collection<String> c = new LinkedHashSet<>();
		Collection<String> c = new TreeSet<>();
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");
		c.add("C");
		c.add(null);
		c.add(null);
		c.add(null);
		System.out.println(c.toString());

	}
}
