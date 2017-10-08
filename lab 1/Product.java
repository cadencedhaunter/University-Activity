

public class Product {
	
	private String name;
	private int quantity;
	private float cost;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public Product(String name, int quantity, float d) {
		this.name = name;
		this.quantity = quantity;
		this.cost = d;
	}


	 
}
