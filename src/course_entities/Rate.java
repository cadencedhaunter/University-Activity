package course_entities;

public class Rate {

	private String currency;
	private int units;
	private double buy, sell;
	
	public Rate() {}
	public Rate(String currency, int units, double buy, double sell) {
		this.currency = currency;
		this.units = units;
		this.buy = buy;
		this.sell = sell;
	}
	
	public static Rate newRateParsed(String currency, String units, String buy, String sell) {
		//System.out.println(currency + " " + units + " " + buy + " " + sell);
		return new Rate(currency, 
				Integer.parseInt(units!=null?units:"0"),
				Double.parseDouble(buy),
				Double.parseDouble(sell));
	}

	public String getCurrency() { return currency; }
	public int getUnits() {	return units; }
	public double getBuy() { return buy; }
	public double getSell() { return sell; }

	public void setCurrency(String currency) { this.currency = currency; }
	public void setUnits(int units) { this.units = units; }
	public void setBuy(double buy) { this.buy = buy; }
	public void setSell(double sell) { this.sell = sell; }
	
	public String toString() {
		return "\n\t currency=" + currency + "; units: " + units +
				"  \tbuy/sell:   " + ((buy==sell)?buy:buy+"/"+sell);
	}
	
}
