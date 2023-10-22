package solution01;

import java.util.Scanner;

public class Candidate {
	private int id;
	private String name;
	private String party;
	private int votes;
	
	public Candidate() {
	}
	
	public Candidate(int id, String name, String party, int votes) {
		super();
		this.id = id;
		this.name = name;
		this.party = party;
		this.votes = votes;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}

	@Override
	public String toString() {
		return "Candidate [id=" + id + ", name=" + name + ", party=" + party + ", votes=" + votes + "]";
	}
	
	public void accept()
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter id of Candidate : ");
		this.id=in.nextInt();
		
		in.nextLine();
		System.out.print("Enter name of Candidate : ");
		this.name=in.nextLine();
		
//		in.nextLine
		System.out.print("Enter party of Candidate : ");
		this.party=in.nextLine();
		
		System.out.print("Enter votes of Candidate : ");
		this.votes=in.nextInt();
		
	}
	
}
