package solution01;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		List<Book> list = new ArrayList<>();

		int choice = 0 ;
		
		do {
			System.out.println("------------------------------------------------------");
			System.out.println("Menu");
			System.out.println("1. Add new book in list");
			System.out.println("2. Display all books in forward order");
			System.out.println("3. Search a book with given isbn");
			System.out.println("4. Delete a book at given index");
			System.out.println("5. Delete a book with given isbn");
			System.out.println("6. Reverse the List");
			System.out.println("7. Save Books in file");
			System.out.println("8. Load books from file");
			System.out.print("Enter your choice = ");
			choice = new Scanner(System.in).nextInt();
			System.out.println("------------------------------------------------------");
			
			switch (choice) {
			case 1:
				Book bnew = new Book();
				bnew.acceptBook();
				if(list.contains(bnew))
					list.get(list.indexOf(bnew)).setQuantity(list.get(list.indexOf(bnew)).getQuantity()+bnew.getQuantity());
				else
					list.add(bnew);
				break;
				
			case 2:
				for(int i = 0 ; i < list.size() ; i++)
					System.out.println(list.get(i));
				break;
			case 3:
				System.out.println("Enter isbn : ");
				String s = new Scanner(System.in).nextLine();
				Book book = new Book();
				book.setIbsn(s);
				if(list.indexOf(book)==-1)
					System.out.println("Not found");
				else
					System.out.println("Found at " + list.indexOf(book));
				break;
			case 4:
				System.out.println("Enter index : ");
				int x = new Scanner(System.in).nextInt();
				
				if (x < 0 && x > list.size()) {
					System.out.println("Wrong Index...:(");

				} else {
					list.remove(x);
					System.out.println("Book at given " + x + " index deleted");

				}
				break;				
				
			case 5:
				System.out.println("Enter isbn : ");
				s = new Scanner(System.in).nextLine();
				book = new Book();
				book.setIbsn(s);
				if(list.indexOf(book)==-1)
					System.out.println("Not found");
				else
					list.remove(list.indexOf(book));

				break;
			case 6:
				System.out.println("Reverse Book list : ");
				Collections.reverse(list);
				for (Book book1 : list) {
					System.out.println(book1);
				}
				break;

			case 7:
				try(FileOutputStream fout = new FileOutputStream("Books.txt")){
					try(DataOutputStream dout = new DataOutputStream(fout))
					{
						for(Book book1 : list)
						{
							dout.writeInt(book1.getQuantity());
							dout.writeUTF(book1.getAuthorName());
							dout.writeUTF(book1.getIbsn());
							dout.writeDouble(book1.getPrice());
							
						}
						
					}
				}catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 8:
				try(FileInputStream fin = new FileInputStream("Books.txt")){
					try(DataInputStream din = new DataInputStream(fin))
					{
						while(true)
						{
							Book b2 = new Book();
							b2.setQuantity(din.readInt());
							b2.setAuthorName(din.readUTF());
							b2.setIbsn(din.readUTF());
							b2.setPrice(din.readDouble());
							list.add(b2);
						}
					}
				}catch (Exception e) {
					System.out.println("books added");
				}
				break;


			default:
				System.out.println("Wrong Choice Entered :(");
				break;
			}
			
			
		}while(choice != 0);
		System.out.println("Thank you BYEE :)");
		
		
	}
}
