package clothes;

public class Pants extends Clothes {
	
	private boolean bellBottoms;

	public boolean isBellBottoms() {
		return bellBottoms;
	}

	public void setBellBottoms(boolean bellBottoms) {
		this.bellBottoms = bellBottoms;
	}
	
	@Override
	public void brand() {
		System.out.println("Brand Pants, bell-bottoms: " + bellBottoms);
	}
	
	public Pants() {}

	public Pants(String producer, int cost, String style, boolean bellBootoms) {
		super(producer, cost, style);
		this.bellBottoms = bellBootoms;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + "; Bell-bottoms: " + bellBottoms;
	}
	
}





