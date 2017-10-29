package lab_4;

import java.util.Scanner;
import java.io.*;

public class Runner {
	
	public static void main(String[] args) {

		Cone cone = new Cone();
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.print("Enter base radius: ");
			cone.setBaseRadius(scan.nextFloat());
			System.out.print("Enter height: ");
			cone.setHeight(scan.nextFloat());
		}catch(IllegalConeArgumentException e) {
			e.printStackTrace();
			System.exit(0);
		}
		

		

		System.out.println("Cone to write:\n" + cone);
		
		File file = new File("test.txt");
		ObjectOutputStream writeStream = null;
		
		try{
			writeStream = new ObjectOutputStream(new FileOutputStream(file));
			writeStream.writeObject(cone);
		} catch (Exception e) {
		} finally {
			try {
				if (writeStream!=null){writeStream.close();}
			}catch (IOException e) {
				e.printStackTrace(System.err);
			}
		}
		
		ObjectInputStream readStream = null;
		Cone readCone = new Cone();
		
		try {
			readStream = new ObjectInputStream(new FileInputStream(file));
			readCone = (Cone) readStream.readObject();
		} catch (Exception e) {
			e.printStackTrace(System.err);
		} finally {
			try {
				if (readStream!=null){readStream.close();}
			} catch (Exception e) {
				e.printStackTrace(System.err);
			}
		}
		
		System.out.println("Readed cone:\n"+readCone);
		
		scan.close();
	}
}
