package practice.inheritance.ecommerceapp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Groceries extends Product{
	private LocalDateTime expirationDate;
	private boolean isPerishable;
	
	@Override
	public double calculateDiscount() {
		return 0.7*this.getPrice();
	}

	@Override
	public void getDetails() {
		String details = "\nProduct n° %d:\nName: %s\nFull Price: %.2f\nPrice*: %.2f\n";
		details = String.format(details, this.productId, this.name, this.price, this.calculateDiscount());
		
		if (this.isPerishable) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			String formattedED = this.expirationDate.format(formatter);
			details += "Expires: " + formattedED +"\n";
		}
		
		System.out.println(details);
	}
	
	

	public Groceries(int productId, String name, double price, LocalDateTime expirationDate, boolean isPerishable) {
		super(productId, name, price);
		this.expirationDate = expirationDate;
		this.isPerishable = isPerishable;
	}

	public LocalDateTime getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDateTime expirationDate) {
		this.expirationDate = expirationDate;
	}

	public boolean isPerishable() {
		return isPerishable;
	}

	public void setPerishable(boolean isPerishable) {
		this.isPerishable = isPerishable;
	}
}
