package solution01;

import java.util.List;
import java.util.Scanner;

public class Solution01Main {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		
		int choice;
		do {
			
			System.out.println("0. Exit");
			System.out.println("1. Add new Candidate.");
			System.out.println("2. Update Existing Candidate.");
			System.out.println("3. Get Party Wise Votes.");
			System.out.println("4. Display all Candidates.");
			System.out.println("Enter your Choice : ");
			choice=in.nextInt();
			switch(choice)
			{
			case 1:
				try (CandidateDAO c = new CandidateDAO()) {
					System.out.println("Enter Candidate Details to add : ");
					Candidate c1 = new Candidate();
					c1.accept();
					int cnt = c.save(c1);
					System.out.println("Rows Affected : " + cnt);

				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 2:
				try(CandidateDAO cd=new CandidateDAO())
				{
					System.out.print("Enter id of Candidate to modify :");
					int id=in.nextInt();
					
					Candidate c1=cd.getCandidateById(id);
					
					in.nextLine();
					System.out.println("Enter New Candidate Name : ");
					String name=in.nextLine();
					
					System.out.print("Enter New Party Name: ");
					String party=in.nextLine();
					
					c1.setName(name);
					c1.setParty(party);
					
					int cnt=cd.update(c1);
					System.out.println("Rows Affected : "+cnt);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
			case 3:
				try(CandidateDAO cd=new CandidateDAO())
				{
					List<PartyVotes> list=cd.getPartywiseVotes();
					list.forEach(pv->System.out.println(pv));
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
				
			case 4:
				try(CandidateDAO cd=new CandidateDAO())
				{
					List<Candidate> list=cd.getAll();
					list.forEach(c->System.out.println(c));
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
			}
		}
		while(choice!=0);
		
		in.close();
	}
}