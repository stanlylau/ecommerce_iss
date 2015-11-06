package iss;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import iss.Item;
import iss.ShoppingCart;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ShoppingCartTest extends TestCase{
	ShoppingCart cart = new ShoppingCart();

	public ShoppingCartTest(String name) {
		super(name);
	}
	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
	}
	
	
	public static junit.framework.Test suite() {
		TestSuite suite = new TestSuite("Test for default package");
		System.out.println ("Test for default package");
		//$JUnit-BEGIN$
		suite.addTestSuite(ShoppingCartTest.class);
		//$JUnit-END$
		return suite;
	}
	
	@Test
	public void testbuyOneItem() {
		cart.buy(new Item("apple", "1001.1", 2.3));

		assertEquals(2.3, cart.total(), 0.01);
	}

	@Test
	public void testbuyAnotherItem() {
		cart.buy(new Item("orange", "1002.1", 1.4));

		assertEquals(1.4, cart.total(), 0.01);
	}

	@Test
	public void testbuyTwoDifferentItems() {
		cart.buy(new Item("apple", "1001.1", 100));
		cart.buy(new Item("orange", "1002.1", 200));

		assertEquals(200, cart.total(), 0.01);
	}

	@Test
	public void testbuyTwoOfSameItems() {
		cart.buy(new Item("royal apple", "1001.1", 1.1));
		cart.buy(new Item("fuji apple", "1001.2", 1.1));

		assertEquals(1.87, cart.total(), 0.01);
	}

}
