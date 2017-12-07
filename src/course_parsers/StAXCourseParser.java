package course_parsers;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList; 

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import course_entities.Branch;
import course_entities.Rate;

public class StAXCourseParser {
	
	static String nodeName = null;
	
	static ArrayList<Rate> rates = new ArrayList<>();
	 
	static String branchName = null,
			rateCurrency = null,
			rateUnits = null,
			buy = null,
			sell = null;
	 
	
	static void staxProcessing(ArrayList<Branch> branches, XMLStreamReader reader) throws XMLStreamException {
		
		while(reader.hasNext()) {

			int event = reader.next();

			
			if(event == XMLStreamConstants.START_ELEMENT) {
				nodeName = reader.getLocalName();
				
				if(nodeName.equals("branch")) {
					rates = new ArrayList<>();
					branchName = reader.getAttributeValue(null, "name");
				}
				if(nodeName.equals("rate")) {
					rateCurrency = reader.getAttributeValue(null, "currency");
					rateUnits = reader.getAttributeValue(null, "Units");
				}
			}
			
			if(event == XMLStreamConstants.CHARACTERS) {
				if(nodeName.equals("buy")) { buy = reader.getText();}
				if(nodeName.equals("sell")) { sell = reader.getText();}
				if(nodeName.equals("rate")) { buy = sell = reader.getText();}
			}
			
			if(event == XMLStreamConstants.END_ELEMENT) {
				String name = reader.getLocalName();
				if(name.equals("rate")) { rates.add(Rate.newRateParsed(rateCurrency, rateUnits, buy, sell)); }
				if(name.equals("branch")) { branches.add(new Branch(branchName, rates));}				
			}
		}
		
	}

	public static void parse(String path, ArrayList<Branch> branches) {
		try {
			XMLInputFactory factory = XMLInputFactory.newInstance();
			XMLStreamReader reader = factory.createXMLStreamReader(new URL(path).openStream());
			staxProcessing(branches, reader);
		} catch ( XMLStreamException | IOException e) {
			e.printStackTrace();
		}
		
	}
}
