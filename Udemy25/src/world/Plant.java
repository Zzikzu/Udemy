package world;

public class Plant {
	//Bad practice
	public String name;				// vatsinou nechceme public stringy, da sa pristupovat vsade
	
	//Acceptable practice
	public final static int ID = 8;	// vynimkou su staticke ID
	
	
	private String type;	//opsit ti private, dasa pristupit len z tehto classy
	
	
	protected String size;	//da sa dedit
	
	int height;				//nezadefinovany access, accse na urovni package
	
	
	public Plant() {		//constructor
		this.name = "Freddy";	//moze sa pouzit this. ale nemusi lebo Plant je public
		this.type = "plant";
		this.size = "nedium";
		this.height = 8;
		
	}
}


