package course_parsers;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import course_entities.Branch;
import course_entities.Rate;

public class DOMCourseParser {

	static String nodeName = null;
	
	static ArrayList<Rate> rates = new ArrayList<>();
	 
	static String branchName = null,
			rateCurrency = null,
			rateUnits = null,
			buy = null,
			sell = null;
	 
	
	public static void parse(String path, ArrayList<Branch> branches) {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(path);
			
			Element root = document.getDocumentElement();
			NodeList nodes = root.getChildNodes();
			
			int i = 0;
			while (i<nodes.getLength()) {
				rates = new ArrayList<>();
				Element element;
				element=(Element) nodes.item(i);
				branchName = element.getAttribute("name");
				//System.out.println(branchName);
				
				NodeList childRates = element.getChildNodes();
				for(int j = 0; j<childRates.getLength(); j++) {
					Element childRate = ((Element) childRates.item(j));
					rateCurrency = childRate.getAttribute("currency");
					if(childRate.hasAttribute("Units")) {
						rateUnits = childRate.getAttribute("Units");
						buy = childRate.getFirstChild().getTextContent();
						sell = childRate.getLastChild().getTextContent();
					}else {
						buy = sell = childRate.getTextContent();
					}
					//System.out.println("\t rate currency="+rateCurrency + " Units="+rateUnits);
					//System.out.println("\t buy/sell: \t" + buy +"/" + sell);
					rates.add(Rate.newRateParsed(rateCurrency, rateUnits, buy, sell));	
				}
				
				branches.add(new Branch(branchName,rates));
				i++;
			}
			
		} catch (SAXException | IOException| ParserConfigurationException e) { 
			e.printStackTrace();
		}
	}
}
