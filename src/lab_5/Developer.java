package lab_5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Developer implements Comparable<Developer> {
	private String name;
	private int experience; 
	private String position;
	private int advance;
	
	public Developer() {}
	
	public Developer(String name, int exp, String pos, int adv) {
		this.name = name;
		experience = exp;
		position = pos;
		advance = adv;
	}
	
	public void setName(String name) 	{ this.name = name; }
	public void setExperience(int exp) 	{ experience = exp; }
	public void setPosition(String pos) { position = pos; }
	public void setAdvance(int advance) { this.advance = advance; }
	
	public String getName() 	{ return name; }
	public int getExperience() 	{ return experience; }
	public String getPosition() { return position; }
	public int getAdvance() 	{ return advance; }
	
	public static void writeInFile(File f, ArrayList<Developer> list) {
		try (BufferedWriter outStream = new BufferedWriter(new FileWriter(f))) {
			outStream.write(list.toString()
					.replace(',','\n')
					.replace(';',' ')
					.replace('[',' ')
					.replace(']',' '));
			outStream.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void readFromFile(File f, ArrayList<Developer> list) {
		try (Scanner sc = new Scanner(f)){
			while (sc.hasNext()) {
				list.add(new Developer(sc.next(),sc.nextInt(),sc.next(),sc.nextInt()));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public int compareTo(Developer dev) {
		return name.compareTo(dev.name);
	}
	
	public String toString() {
		return name + ";" + experience + ";" + position + ";" + advance;
	}
}
