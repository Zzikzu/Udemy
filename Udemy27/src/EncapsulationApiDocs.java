// source: https://www.udemy.com/java-tutorial/#/lecture/149507
//docs for java check on google

class Plant {
	
	public static final int ID = 7;	//public,static,final - konstanta 
	private String name;			//private, da sa pouzit len v ramci class

	
	public String getData() {
		String data = "some stuff " + calculate();
		return data;
	}
	
	private int calculate() {
		return 9;
	}

	
	public String getName() {		//get method, moznost pouzitia premennej mimo classu
		return name;
	}

	public void setName(String name) {	//set method moznost pouzitia premennej mimo classu 
		this.name = name;
	}
	

}

public class EncapsulationApiDocs {
	public static void main(String[] args) {
	
		Plant plant = new Plant();
		plant.setName("Kvet");
		System.out.println(plant.getData());
		System.out.println(plant.getName());
		
	}
}


