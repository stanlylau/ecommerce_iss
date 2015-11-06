package iss;
import java.util.ArrayList;
import java.util.List;


public class ShoppingCart {

	private double totalPrice;
	private List<OrderItem> items = new ArrayList<OrderItem>();
	
	public double total() {	
		for (OrderItem item : items) {
			if( (item.getQuantity() % 2) ==0)
			{
				int i = item.getQuantity() / 2;
								
				totalPrice += item.getProduct().getPrice() * i * 1.7;
			}else
			{
				int i = item.getQuantity() / 2;
				totalPrice += item.getProduct().getPrice() * i * 1.7 + item.getProduct().getPrice();
			}
		}
		
		return totalPrice;
	}

	public void add(OrderItem item) {
		items.add(item);
	}


}
