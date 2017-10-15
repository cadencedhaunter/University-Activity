package clothes;

public class Blouse extends Clothes {
	private float sleeveLength;
	private float woolPercent;
	
	@Override
	public void brand() {
		System.out.println("Blouse brand with percent of wool: " + woolPercent);
	}
	
	public float getSleeveLength() {
		return sleeveLength;
	}
	public float getWoolPercent() {
		return woolPercent;
	}
	public void setSleeveLength(float sleeveLength) {
		this.sleeveLength = sleeveLength;
	}
	public void setWoolPercent(float woolPercent) {
		this.woolPercent = woolPercent;
	}

	public Blouse() {}
	
	public Blouse(String producer, int cost, String style, float sleeveLength, float woolPercent) {
		super(producer, cost, style);
		this.sleeveLength = sleeveLength;
		this.woolPercent = woolPercent;
	}
	
	@Override
	public String toString() {
		return super.toString() + "; Sleeve Length: " + sleeveLength + "; Wool Percent: " + woolPercent;
	}
	
	
}
