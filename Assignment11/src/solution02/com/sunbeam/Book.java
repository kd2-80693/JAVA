package solution02.com.sunbeam;
import java.util.*;



public class Book {
	String isbn;
	double price;
	public Book(String isbn, double price, String authorName, int qty) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.qty = qty;
	}
	String authorName;
	int qty;
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", qty=" + qty + "]";
	}
	public void acceptBook() {
		System.out.println("Enter isbn: ");
		setIsbn(new Scanner(System.in).next());
		System.out.println("Enter Author: ");
		setAuthorName(new Scanner(System.in).next());
		System.out.println("Enter Price: ");
		setPrice(new Scanner(System.in).nextDouble());
		System.out.println("Enter qty: ");
		setQty(new Scanner(System.in).nextInt());
		
	}
	@Override
	public int hashCode() {
		
		return isbn.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		Book other = (Book) obj;
		if(other.getIsbn().equals(this.isbn))
			return true;
		return false;
	}
	
	
	
	
	
}
