package solution02;

import java.util.List;
import java.util.Scanner;

public class Solution02Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int choice;
		do {
			
			System.out.println("0. Exit");
			System.out.println("1. Add new User.");
			System.out.println("2. Update Existing user.");
			System.out.println("3. Display all Users.");
			System.out.println("4. Delete existing User by user_id.");
			System.out.println("Enter your Choice : ");
			choice=in.nextInt();
			int user_id;
			User tempUser;
			switch(choice)
			{
			case 1:
				tempUser=new User();
				try {
					tempUser.accept();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try(UserDao ud = new UserDao())
				{
					ud.addUser(tempUser);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
			case 2:
				System.out.println("Enter Id of User to Update : ");
				user_id=in.nextInt();
				try(UserDao ud=new UserDao())
				{
					tempUser= new User();
					tempUser.accept();
					int cnt=ud.updateUser(tempUser);
					System.out.println("Rows Affected : "+cnt);
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
				break;
			case 3:
				try(UserDao ud=new UserDao())
				{
					List<User> result=ud.getAll();
					
					result.forEach(c -> System.out.println(c));
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
			case 4:
				try(UserDao ud=new UserDao())
				{
					System.out.print("Enter User_id to delete : ");
					user_id=in.nextInt();
					
					int cnt=ud.deleteUser(user_id);
					System.out.println("Rows Affected : "+cnt);
				}//ud.close()
				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
			default:
				System.out.println("Invalid Choice Entered.");
				break;
			}
		}while(choice!=0);
			
			
		

	}

}
