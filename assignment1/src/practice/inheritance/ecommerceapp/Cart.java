package practice.inheritance.ecommerceapp;
import java.util.ArrayList;

public class Cart {
	private ArrayList<Product> cartProducts;
	
	public Cart() {
		this.cartProducts = new ArrayList<>();
	}
	
	public void add(Product p) {
		this.cartProducts.add(p);
		System.out.println(p.getName() + " has been added to your cart.");
	}
	
	public void remove(int i) {
		try {
			String productName = cartProducts.get(i).getName();
			this.cartProducts.remove(i);
			System.out.println(productName + " has been removed from your cart.");
		} catch(IndexOutOfBoundsException e) {
			System.out.println("Operation unsuccessful, no product to delete.");
			e.printStackTrace();
		}
	}
	
	public void displayAll() {
		System.out.println("\nCart Contents:");
		for (Product p: cartProducts) {
			p.getDetails();
		}
		System.out.println();
	}
}
