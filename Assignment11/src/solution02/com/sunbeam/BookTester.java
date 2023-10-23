
package solution02.com.sunbeam;


import java.util.LinkedHashSet;
import java.util.Iterator;

public class BookTester {

	public static void main(String[] args) {
		LinkedHashSet<Book> hs=new LinkedHashSet<Book>();
		Book bk=null;
		hs.add(new Book("123",2000,"Ujjwal",100));
		hs.add(new Book("234",200,"Vijay",10));
		hs.add(new Book("345",300,"Viraj",1));
		
		hs.add(new Book("567",30,"Sumit",23));
		hs.add(new Book("678",10,"Ritu",34));
		hs.add(new Book("789",2000,"Princy",67));
		hs.add(new Book("456",1000,"Rudra",34));
		hs.add(bk);
		hs.add(new Book("789",2000,"Princy",67));//it will accept the duplicate value as we 
		//do not created any Hashcode() in the class
		Iterator<Book> itr=hs.iterator();
		while(itr.hasNext()) {
			Book b=itr.next();
			System.out.println(b);
		}
		
	}

}
