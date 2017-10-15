package clothes;

public class Clothes {
	private String producer;
	private int cost;
	private String style;
	
	public void brand() {
		System.out.println("Clothes brand by: " + producer);
	}
	
	public String getProducer() {
		return producer;
	}
	public int getCost() {
		return cost;
	}
	public String getStyle() {
		return style;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	
	public Clothes() {}
	
	public Clothes(String producer, int cost, String style) {
		this.producer = producer;
		this.cost = cost;
		this.style = style;
	}
	
	@Override
	public String toString() {
		return "Producer: " + producer + "; Cost: " + cost + "; Style: " + style;
	}
	
	
}
