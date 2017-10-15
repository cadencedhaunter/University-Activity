
import java.util.ArrayList;

import clothes.Blouse;
import clothes.Clothes;
import clothes.Jacket;
import clothes.Pants;

public class ClothesRunner {
	public static void main(String[] args) {
		ArrayList<Clothes> clothesList = new ArrayList<Clothes>();
		
		clothesList.add(new Clothes("Gucci", 49000, "Modern"));
		clothesList.add(new Clothes("Savage",35000, "Urban"));
		clothesList.add(new Clothes("Nike",35000, "Punk"));
		
		clothesList.add(new Jacket("Hotline Miami",17000,"Old-style","Autumn",false));
		clothesList.add(new Jacket("Richard",17000,"Club-stype","Summer",false));
		
		clothesList.add(new Blouse("Siege",9000,  "Soft", 10.4f, 70));
		clothesList.add(new Blouse("Richter",7400,"Work-dress", 12.4f, 20));
		
		clothesList.add(new Pants("Armani", 76000, "Business", false));
		clothesList.add(new Pants("Pande", 13000, "Everyday-life", false));
		
		for(Clothes clothes: clothesList) {
			clothes.brand();
			System.out.println(clothes + "\n");
		}
	}
}
