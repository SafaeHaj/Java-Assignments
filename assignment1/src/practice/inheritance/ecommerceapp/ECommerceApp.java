package practice.inheritance.ecommerceapp;
import java.time.LocalDateTime;

public class ECommerceApp {

	public static void main(String[] args) {
		Cart myCart = new Cart();
		
		myCart.add(new Groceries(201, "Milk", 2.99, LocalDateTime.now().plusDays(7), true));
		myCart.add(new Clothing(301, "T-Shirt", 19.99, "M", "Cotton", "Unisex", 0.05f));
		myCart.add(new Electronics(101, "Smartphone", 799.99, "Samsung", LocalDateTime.now().plusYears(2), 0.10f));
		
		myCart.displayAll();
		myCart.remove(0);
		myCart.displayAll();
	}

}
