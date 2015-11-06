import java.util.ArrayList;
import java.util.List;


public class ShoppingCart {

	private double totalPrice;
	private String previousStyle = "";
	
	public double total() {	
		return totalPrice;
	}

	public void buy(Item item) {
		if(previousStyle.equals(item.getStyle())) 
			this.totalPrice += item.getPrice() * 0.7;
		else if(previousStyle.equals("")) 
			this.totalPrice += item.getPrice();
		else
			this.totalPrice += item.getPrice() * 0.5;

		previousStyle = item.getStyle();
	}
}
