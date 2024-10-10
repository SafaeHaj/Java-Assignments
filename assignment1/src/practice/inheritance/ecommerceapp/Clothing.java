package practice.inheritance.ecommerceapp;

public class Clothing extends Product implements Returnable{
	private String size;
	private String material;
	private String gender;
	private float discount;
	
	public Clothing( int productId, String name,double price, String size, String material, String gender, float discount) {
		super(productId, name, price);
		this.size = size;
		this.material = material;
		this.gender = gender;
		this.discount = discount;
	}

	@Override
	public double calculateDiscount() {
		return discount*price;
	}

	@Override
	public void getDetails() {
		String details = "\nProduct n° %d:\nName: %s\nSize: %s\nMaterial: %s\nGender: %s\nFull Price: %.2f\nPrice*: %.2f\n";
		details = String.format(details, productId, name, size, material, gender, price, calculateDiscount());
		System.out.println(details);
	}
	
	@Override
	public void processReturn() {
		this.discount = discount/2;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
