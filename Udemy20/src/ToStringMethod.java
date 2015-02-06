// source: https://www.udemy.com/java-tutorial/#/lecture/145741

class Zaba {
	
}


class Frogs {
	
	
	private int id;
	private String name;
	
	public Frogs(int id, String name) {		// constructor`
		this.id = id;
		this.name = name;
	}
	
	
	public String toString() {		// toString method
		StringBuilder fsb = new StringBuilder();
		fsb.append(id).append(" ").append(name);
		return fsb.toString();
		
		
	}
	
}

public class ToStringMethod {
	public static void main(String[] args) {

		Frogs frogs1 = new Frogs(7, "Freddy");
		Frogs frogs2 = new Frogs(5, "Roger");	
		System.out.println(frogs1);				// object dedi toString method
		System.out.println(frogs2);
		
		Zaba zaba1 = new Zaba();			// class neobashuje toString method
		System.out.println(zaba1);			// vypise classname@hashcode, unikatne ID objektu
		
	}
}

