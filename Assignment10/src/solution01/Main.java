package solution01;

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
				Book b = new Book();
				b.setIbsn(s);
				if(list.indexOf(b)==-1)
					System.out.println("Not found");
				else
					System.out.println("Found at " + list.indexOf(b));
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
				b = new Book();
				b.setIbsn(s);
				if(list.indexOf(b)==-1)
					System.out.println("Not found");
				else
					list.remove(list.indexOf(b));

				break;
			case 6:
				System.out.println("Reverse Book list : ");
				Collections.reverse(list);
				for (Book book : list) {
					System.out.println(book);
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
