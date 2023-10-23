
package solution05.com.sunbeam;


import java.util.*;
import java.util.HashMap;
import java.util.Map.Entry;
public class Tester {

	public static void main(String[] args) {
		
		HashMap<String,Book> hs=new HashMap<>();
		hs.put("3",new Book("3",300,"Viraj",1));

		hs.put("7",new Book("7",2000,"Princy",67));
		hs.put("4",new Book("4",1000,"Rudra",34));
		hs.put("6",new Book("6",10,"Ritu",34));
		hs.put("1",new Book("1",2001,"Ujjwal",100));
		
	
		int choice=1;
		while(choice!=0) {
			System.out.println("1 To Enter Add Map \n2 To Search \n3 To Display All \n Enter Choice ");
			choice=new Scanner(System.in).nextInt();
			switch(choice) {
			case 0:System.out.println("Bye Bye....................");
			break;
			case 1:Book b1=new Book();
					b1.acceptBook();
					hs.put(b1.getIsbn(), b1);
					break;
			case 2:System.out.println("Enter Isbn: ");
				String key=new Scanner(System.in).next();
				Book b=hs.get(key);
				if(b==null) {
					System.out.println("Not Found");
				}
				else
					System.out.println(b);
				break;
			case 3:Set<Entry<String,Book>> itr=hs.entrySet();
			for (Entry<String, Book> entry : itr) {
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

