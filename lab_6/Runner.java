package lab_6;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements amount: ");
		
		int count = sc.nextInt();
		int elements[] = new int[count];
		
		for(int i = 0; i<elements.length; i++ ) {
			System.out.println("Enter  value for " + i + " element: " );
			elements[i] = sc.nextInt();
		}
		
		ThreadGenerator gen;
		int finalResult;

		// add
		gen = new ThreadGenerator(elements, CalcOperation.ADD);
		gen.execute();
		finalResult = gen.getResult();
		System.out.println("Final result (add) is: " + finalResult);
		
		// subtract
		gen = new ThreadGenerator(elements, CalcOperation.SUBTRACT);
		gen.execute();
		finalResult = gen.getResult();
		System.out.println("Final result (subtract) is: " + finalResult);
		
		// multiply
		gen = new ThreadGenerator(elements, CalcOperation.MULTIPLY);
		gen.execute();
		finalResult = gen.getResult();
		System.out.println("Final result (multiply) is: " + finalResult);
		
		sc.close();
	}
}
