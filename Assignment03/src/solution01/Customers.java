package solution01;

public class Customers {
	int accountNumber ;
	int balance;
	int itemsCharged;
	int creditApplied;
	int creditLimit;
	public Customers(int accountNumber, int balance, int itemsCharged, int creditApplied, int creditLimit) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.itemsCharged = itemsCharged;
		this.creditApplied = creditApplied;
		this.creditLimit = creditLimit;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getItemsCharged() {
		return itemsCharged;
	}
	public void setItemsCharged(int itemsCharged) {
		this.itemsCharged = itemsCharged;
	}
	public int getCreditApplied() {
		return creditApplied;
	}
	public void setCreditApplied(int creditApplied) {
		this.creditApplied = creditApplied;
	}
	public int getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	public void calculate() {
		balance = balance + itemsCharged -creditApplied;
		if(balance <= creditLimit)
		System.out.println("New Balance : "+balance);
		else
			System.out.println("Credit Limit Exceeded");
	}
	

}
