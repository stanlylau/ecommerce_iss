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
	
	public void testBuyOneItem() {
		Product product = new Product("apple","1001.1", 2);
		OrderItem item = new OrderItem(product, 1);
		
		cart.add(item);
		
		assertEquals(2, cart.total(), 0.01);
	}

	public void testBuyTwoItemsOfSameProduct() {
		Product product = new Product("apple","1001.1", 2);
		OrderItem item = new OrderItem(product, 2);
		
		cart.add(item);
		
		assertEquals(3.4, cart.total(), 0.01);
	}

	public void testBuyTwoItemsOfSameProductX() {
		Product product = new Product("apple","1001.1", 2);
		OrderItem item = new OrderItem(product, 3);
		
		cart.add(item);
		
		assertEquals(5.4, cart.total(), 0.01);
	}
}
