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
		OrderItem item = createOrderItem("apple","1001.1", 2, 1);
		cart.add(item);	
		assertEquals(2, cart.total(), 0.01);
	}

	public void testBuyTwoItemsOfSameProduct() {
		OrderItem item =  createOrderItem("apple","1001.1", 2, 2);
		cart.add(item);
		assertEquals(3.4, cart.total(), 0.01);
	}

	public void testBuyTwoItemsOfSameProductX() {
		OrderItem item = createOrderItem("apple","1001.1", 2, 3);
		cart.add(item);
		assertEquals(5.4, cart.total(), 0.01);
	}
	
	private OrderItem createOrderItem(String name, String sku, double price, int quantity ) {
		Product product = new Product(name, sku, price);
		OrderItem item = new OrderItem(product, quantity);
		return item;
	}

}
