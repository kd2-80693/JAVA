
package solution06.com.sunbeam;


import java.util.*;
import java.util.Map.Entry;

public class Tester {


	public static void main(String[] args) {
		
		LinkedHashMap<Integer,Student> hs=new LinkedHashMap<>();

	
		int choice=1;
		while(choice!=0) {
			System.out.println("1 To Enter Add Map \n2 To Search \n3 To Display All \n Enter Choice ");
			choice=new Scanner(System.in).nextInt();
			switch(choice) {
			case 0:System.out.println("Bye Bye....................");
			break;
			case 1:Student b1=new Student();
					b1.accept();
					hs.put(b1.getRoll(), b1);
					break;
			case 2:System.out.println("Enter RollNo: ");
				int key=new Scanner(System.in).nextInt();
				Student b=hs.get(key);
				if(b==null) {
					System.out.println("Not Found");
				}
				else
					System.out.println(b);
				break;
			case 3:Set<Entry<Integer,Student>> itr=hs.entrySet();
			for (Entry<Integer, Student> entry : itr) {
				System.out.println(entry.getKey()+" --> "+entry.getValue());
			}
			break;
			default:System.out.println("Wrong choice.......");
			break;
			}
			System.out.println("********************************************************************");
			
		}
		
	}

}

