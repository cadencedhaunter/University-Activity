package course_entities;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class BranchHandler extends DefaultHandler{
	
	private ArrayList<Branch> branches;
	private ArrayList<Rate> rates;
	
	private String branchName = null,
					rateCurrency = null,
					rateUnits = null,
					buy = null,
					sell = null;
	
	private String nodeName = null;
	
	private boolean containsUnit = false;
	
	public BranchHandler(ArrayList<Branch> branches) {
		this.branches = branches;	
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		nodeName = qName;
		switch(nodeName) {
			case "branch" :
				rates = new ArrayList<>();
				branchName = attributes.getValue("name");
				break;
			case "rate" :
				containsUnit = false;
				rateCurrency = attributes.getValue("currency");
				if((rateUnits=attributes.getValue("Units"))!=null) containsUnit = true;
		}
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		switch(nodeName) {
			case "rate" :
				if(!containsUnit) buy = sell = new String(ch, start, length);
				break;
			case "buy" :
				buy = new String(ch, start, length);
				break;
			case "sell" :
				sell = new String(ch, start, length);
		}
	
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if(qName.equals("rate")) rates.add(Rate.newRateParsed(rateCurrency, rateUnits, buy, sell));
		if(qName.equals("branch")) branches.add(new Branch(branchName, rates));
	}
}
