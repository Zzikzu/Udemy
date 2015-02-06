// source: https://www.udemy.com/java-tutorial/#/lecture/139767


class Machine {
	private String name;
	private int code;
	
	public Machine() {		// meno construktore rovnake ako meno classu
		name = "Arnie";
		System.out.println("First constuctor running! Name: " + name);
	}

	/*
	// sposob ako zadefineovat jednoduchsi construktor ktory byde akceptovany zlozitejsim
	public Machine() {
		this("Arnie", 0);		// v prvom riadku musi bit this s default hodnotamy
								// odkazuje na vyhovujuci constructor (treti)
		System.out.println("First constuctor running!");
	}
	*/
	
	
	public Machine(String name) {		// constructor s parametrom, funguje ako ste Method
		System.out.println("Second constructor running! Name: " + name);
		this.name = name;
	}

	public Machine(String name, int code) {
		System.out.println("Third constructor running. Name: " + name + " Code: " + code);
		this.name = name;
		this.code = code;
	}
	
}

public class Construct {
	public static void main(String[] args) {

		Machine machine1 = new Machine();
		//new Machine();		// vytvori novy objekt z konstruktoru
		
		
		Machine machine2 = new Machine("Bertie");	//vytvori objekt z constructota s parametrom
		// na zaklade parametrov java vie ktory construktor ma pouzit pre vytvorenie objektu
		
		Machine machine3 = new Machine("Chalky", 7);	// vytvori dalsi objekt na zaklade parametrov
	}
}

