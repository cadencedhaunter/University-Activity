package course_entities;

import java.util.ArrayList;

public class Branch {
	
	private String name;
	private ArrayList<Rate> rates;
	
	public Branch() {}
	public Branch(String name, ArrayList<Rate> rates) {
		this.name = name;
		this.rates = rates;
	}
	
	
	
	public String getName() 	      {return name;}
	public ArrayList<Rate> getRates() {return rates;}
	
	public void setName(String name) 			{this.name = name;}
	public void setRates(ArrayList<Rate> rates) {this.rates = rates;}



	public String toString() {
		return "\nBranch name : " + name + "\n" + rates.toString() ;
	}
}
