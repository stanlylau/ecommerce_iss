package iss;


import static org.junit.Assert.*;import iss.Item;
import iss.ShoppingCart;


import org.junit.Ignore;
import org.junit.Test;


public class ShoppingCartTest {
	ShoppingCart cart = new ShoppingCart();

	@Test
	public void buyOneItem() {
		cart.buy(new Item("apple","1001.1", 2.3));
		
		assertEquals(2.3, cart.total(), 0.01);
	}

	@Test
	public void buyAnotherItem() {
		cart.buy(new Item("orange", "1002.1", 1.4));
		
		assertEquals(1.4, cart.total(), 0.01);
	}

	@Test
	public void buyTwoDifferentItems() {
		cart.buy(new Item("apple", "1001.1", 100));
		cart.buy(new Item("orange", "1002.1", 200));
		
		assertEquals(200, cart.total(), 0.01);
	}

	@Test
	public void buyTwoOfSameItems() {
		cart.buy(new Item("royal apple", "1001.1", 1.1));
		cart.buy(new Item("fuji apple", "1001.2", 1.1));
		
		assertEquals(1.87, cart.total(), 0.01);
	}
}
