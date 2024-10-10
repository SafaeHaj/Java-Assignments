package practice.inheritance.ecommerceapp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Electronics extends Product implements Returnable{
	private String brand;
	private LocalDateTime warrantyPeriod;
	private float discount;
	
	public Electronics(int productId, String name, double price, String brand, LocalDateTime warrantyPeriod,
			float discount) {
		super(productId, name, price);
		this.brand = brand;
		this.warrantyPeriod = warrantyPeriod;
		this.discount = discount;
	}

	@Override
	public double calculateDiscount() {
		return discount*price;
	}

	@Override
	public void getDetails() {
		String details = "\nProduct n° %d:\nName: %s\nBrand: %s\nWarranty Period: %s\nFull Price: %.2f\nPrice*: %.2f\n";
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	     String formattedWP = warrantyPeriod.format(formatter);
		details = String.format(details, productId, name, brand, formattedWP, price, calculateDiscount());
		System.out.println(details);
	}
	
	@Override
	public void processReturn() {
		this.discount = discount/2;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public LocalDateTime getWarrantyPeriod() {
		return warrantyPeriod;
	}

	public void setWarrantyPeriod(LocalDateTime warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}
}
