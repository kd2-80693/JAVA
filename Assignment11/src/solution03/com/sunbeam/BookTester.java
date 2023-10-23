/**
 * In above assignment use TreeSet instead of LinkedHashSet. Use natural ordering for the Book. 
 * If any book with duplicate isbn is added, what will happen?
 * No Duplicate 
Books are stored in which order?
Sorted
 */
package solution03.com.sunbeam;


import java.util.TreeSet;
import java.util.Iterator;

public class BookTester {

	
	public static void main(String[] args) {
		TreeSet<Book> hs=new TreeSet<Book>();
		hs.add(new Book("3",300,"Viraj",1));
		hs.add(new Book("7",2000,"Princy",67));
		hs.add(new Book("1",2000,"Ujjwal",100));
		hs.add(new Book("2",200,"Vijay",10));
		
		
		hs.add(new Book("5",30,"Sumit",23));
		hs.add(new Book("6",10,"Ritu",34));
		
		hs.add(new Book("4",1000,"Rudra",34));
	
		hs.add(new Book("7",2000,"Princy",67));
		
		Iterator<Book> itr=hs.iterator();
		while(itr.hasNext()) {
			Book b=itr.next();
			System.out.println(b);
		}
		
	}

}
