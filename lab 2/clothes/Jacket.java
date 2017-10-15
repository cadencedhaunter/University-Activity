package clothes;

public class Jacket extends Clothes{
	private String seasonality;
	private boolean hood;
	
	@Override
	public void brand() {
		System.out.println("Jacket brand, seasonality: " + seasonality);
	}
	
	public String getSeasonality() {
		return seasonality;
	}
	public boolean isHood() {
		return hood;
	}
	public void setSeasonality(String seasonality) {
		this.seasonality = seasonality;
	}
	public void setHood(boolean hood) {
		this.hood = hood;
	}
 
	public Jacket() {}
	
	public Jacket(String producer, int cost, String style, String seasonality, boolean hood) {
		super(producer, cost, style);
		this.seasonality = seasonality;
		this.hood = hood;
	}
	
	@Override
	public String toString() {
		return super.toString() + "; Seasonality: " + seasonality + "; Hood: " + hood;
	}
		
}
