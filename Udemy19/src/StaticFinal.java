// source: https://www.udemy.com/java-tutorial/#/lecture/203660

class Thing {
	
	// vyuzitie static:
	public final static int LUCKY_NUMBER = 7;	// vytvorebue konstaty cez staic bar
												// final = neda sa zmenit hodnota konstanty
	public static int count = 0;				// pocet vytvorenych objektov, na zaciatku 0
	public int id;								// id objektu, int defaultne na zaciatku 0
	public Thing() {							// constructor
		id = count;								// pridelenie hodnoty static count premennej id
		count++;								// s kazdym vytvorenym obejktom sa pocet objektov zvysi o 1
	}

	
	
	
	
	
	public String name;					// instance variable = unstatic, nadobuda ju kazdy objekt vytvoreny z classu
	public static String description;	// static var, patri classu
	
	public void showName() {
		System.out.println("");
		System.out.println("New object created!");
		System.out.println("Instance method, name: " + name);
		System.out.println("Object name is: " + name);
		System.out.println("Object ID is: " + id);
		System.out.println("Instance method, descr: " + description);	// instance method moze pouzit static var
	}
	public static void showInfo() {
		System.out.println("Static method: " + "Hello");
		System.out.println("Static method, desc: " + description);	// static method moze pouzit static var
											// static method nemoze puzit instace var
	}
}

public class StaticFinal {
	public static void main(String[] args) {

		
		Thing.description = "I am a thing";		// pouzitie static var
		Thing.showInfo();						// pouzitie staic method
		
		System.out.println("");
		System.out.println("Before creating objects count is: " + Thing.count);
		
		Thing thing1 = new Thing();
		thing1.name = "Bob";			// pouzitie instance var
		
		Thing thing2 = new Thing();
		thing2.name = "Sue";
		
		System.out.println("After creating objects count is: " + Thing.count);	
		System.out.println("");
		
		
		System.out.println("Instance var, thing1 name: " + thing1.name);
		System.out.println("Instance var, thing2 name: " + thing2.name);
		
		System.out.println("Static var: " + Thing.description);
		
		thing1.showName();			// pouzitie instacne method
		thing2.showName();
		
		System.out.println("Static constance: " + Thing.LUCKY_NUMBER);
	}
}





