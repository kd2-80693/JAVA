
package solution04.com.sunbeam;


import java.util.TreeSet;
import java.util.Comparator;
import java.util.Iterator;

public class BookTester {

	
	public static void main(String[] args) {
		class PriceSort implements Comparator<Book>{
			@Override
			public int compare(Book b1, Book b2) {
				// TODO Auto-generated method stub
				int diff=-Double.compare(b1.getPrice(), b2.getPrice());
				return diff;
			}
		}
		PriceSort p1= new PriceSort();
		TreeSet<Book> hs=new TreeSet<Book>(p1);
		hs.add(new Book("3",300,"Viraj",1));
		hs.add(new Book("7",2000,"Princy",67));
		hs.add(new Book("1",2001,"Ujjwal",100));
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
		System.out.println("*************************************************");
		
		Iterator<Book> btr=hs.descendingIterator();
		while(btr.hasNext()) {
			System.out.println(btr.next());
		}
		
		
	}

}
