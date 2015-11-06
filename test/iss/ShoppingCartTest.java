package iss;


import static org.junit.Assert.*;import iss.Product;
import iss.ShoppingCart;


import org.junit.Ignore;
import org.junit.Test;


public class ShoppingCartTest {
	ShoppingCart cart = new ShoppingCart();

	@Test
	public void buyOneItem() {
		Product product = new Product("apple","1001.1", 2);
		OrderItem item = new OrderItem(product, 1);
		
		cart.add(item);
		
		assertEquals(2, cart.total(), 0.01);
	}

	@Test
	public void buyTwoItemsOfSameProduct() {
		Product product = new Product("apple","1001.1", 2);
		OrderItem item = new OrderItem(product, 2);
		
		cart.add(item);
		
		assertEquals(3.4, cart.total(), 0.01);
	}

	@Test
	public void buyTwoItemsOfSameProductX() {
		Product product = new Product("apple","1001.1", 2);
		OrderItem item = new OrderItem(product, 3);
		
		cart.add(item);
		
		assertEquals(5.4, cart.total(), 0.01);
	}
	
	

//	@Ignore
//	public void buyAnotherItemOfSameSKUHave50PercentDiscountOn2ndItem() {
//		cart.add(new Product("orange", "1002.1", 1.4));
//		cart.add(new Product("orange", "1002.1", 1.4));
//		
//		assertEquals(2.1, cart.total(), 0.01);
//	}
//
//	@Ignore
//	public void buyTwoDifferentItemsOfSameStyleApply50PercentDiscountOn2ndItem() {
//		cart.add(new Product("apple", "1001.1", 100));
//		cart.add(new Product("orange", "1002.1", 200));
//		
//		assertEquals(200, cart.total(), 0.01);
//	}
//
//	@Ignore
//	public void buyTwoOfSameItems() {
//		cart.add(new Product("royal apple", "1001.1", 1.1));
//		cart.add(new Product("fuji apple", "1001.2", 1.1));
//		
//		assertEquals(1.87, cart.total(), 0.01);
//	}
}
