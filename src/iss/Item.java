package iss;

public class Item {

	private String name;
	private String sku;
	private double price;
	private String style;

	public Item(String name, String sku, double price) {
		this.name = name;
		this.sku = sku;
		this.style = sku.substring(0, 4);
		this.price = price;
	}
	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
}
