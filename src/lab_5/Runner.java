package lab_5;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class Runner {

	public static void main(String[] args) {
	
		ArrayList<Developer> devs = new ArrayList<Developer>();

		devs.add(new Developer("Christyan",26,"Lead",2400));
		devs.add(new Developer("Joel Yliluoma",46,"Senior",1700));
		devs.add(new Developer("Dadid",23,"Middle",1500));
		
		Developer.writeInFile(new File("src\\Store.txt"), devs);
		devs.clear();
		Developer.readFromFile(new File("src\\Data.txt"), devs);
		
		Collections.sort(devs);
		System.out.println(devs);
	}
}
