package iss;
import iss.Product;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import iss.ShoppingCart;

public class ShoppingCartTest extends TestCase{
	ShoppingCart cart = new ShoppingCart();

	public ShoppingCartTest(String name) {
		super(name);
	}
	
	public static junit.framework.Test suite() {
		TestSuite suite = new TestSuite("Test for default package");
		suite.addTestSuite(ShoppingCartTest.class);
		return suite;
	}

	Product apple = new Product("apple", "1001.1", 2);
	Product orange = new Product("orange", "1001.2", (double) 2);
	
	public void testBuyOneItem() {
		cart.add(new OrderItem(apple, 1));	
		assertEquals(2, cart.total(), 0.01);
	}

	public void testBuyTwoItemsOfSameProduct() {
		cart.add(new OrderItem(apple, 2));
		assertEquals(3.4, cart.total(), 0.01);
	}

	public void testBuyOddsNumberOfItemsOfSameProduct() {
		cart.add(new OrderItem(apple, 3));
		assertEquals(5.4, cart.total(), 0.01);
	}
	
	public void testBuyTwoDifferentProducts() {
		cart.add(new OrderItem(apple, 2));
		cart.add(new OrderItem(orange, 2));
		assertEquals(6.8, cart.total(), 0.01);
	}
}
