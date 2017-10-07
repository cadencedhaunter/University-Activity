


import java.util.ArrayList;

public class firstLabWork {
	
	public static void main(String[] args) {
		ArrayList<Product> productPool = new ArrayList<Product>();
		productPool.add(new Product("Bread", 60, 25.0f));
		productPool.add(new Product("Sausages", 30, 65.2f));
		productPool.add(new Product("Cheese", 25, 55.6f));
		productPool.add(new Product("Tomatoes", 35, 45.7f));
		productPool.add(new Product("Eggs", 70, 30.2f));
		productPool.add(new Product("Tea", 100, 40.5f));
		productPool.add(new Product("Potatoes", 150, 25.2f));
		productPool.add(new Product("Pasta", 50, 25.6f));
		productPool.add(new Product("Ketchup", 25, 30.6f));
		productPool.add(new Product("Sugar", 40, 15.0f));
		
		int summaryCost = 0;
		float summaryQuantity = 0;
		 
		
		for(Product product : productPool) {
			summaryCost += product.getCost();
			summaryQuantity += product.getQuantity();
		}
 
		System.out.println("Summary Cost of products: " + summaryCost);
		System.out.println("Summary Quantity of products: " + summaryQuantity);
		 
	}
}
