import java.util.ArrayList;

import course_entities.Branch;
import course_parsers.DOMCourseParser;
import course_parsers.SAXCourseParser;
import course_parsers.StAXCourseParser;

public class Runner {
	
	public final static String PATH_TO_XML = "http://belgazprombank.by/export_courses.php";
	
	public static void main(String[] args) {
		
		ArrayList<Branch> branches = new ArrayList<>();
		
		SAXCourseParser.parse(PATH_TO_XML, branches);  // SAX Parsing
//		StAXCourseParser.parse(PATH_TO_XML, branches); // StAX Parsing
//		DOMCourseParser.parse(PATH_TO_XML, branches);  // DOM Parsing
		System.out.println(branches);
		
	}
	
}
