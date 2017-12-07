package course_parsers;

import java.io.IOException;
import java.util.ArrayList;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import course_entities.Branch;
import course_entities.BranchHandler;

public class SAXCourseParser {
	
	public static void parse(String path, ArrayList<Branch> branches) {
		
		XMLReader reader;
		try {
			reader = XMLReaderFactory.createXMLReader();
			reader.setContentHandler(new BranchHandler(branches));
			reader.parse(path);
		} catch (SAXException | IOException e) {
			e.printStackTrace();
		}
	}
}
