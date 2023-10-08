package solution01;

public class Invoice {
	String partNumber;
	String partDescription;
	int quantity;
	double price;
	public Invoice(String partNumber, String partDescription, int quantity, double price) {
		super();
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		if(quantity>0)
		this.quantity = quantity;
		else
			this.quantity = 0;
		if(price>0)
		this.price = price;
		else 
			this.price = 0;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double calculateInvoice()
	{
		return quantity*price;
	}
	
}
