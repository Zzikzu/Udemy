// source: https://www.udemy.com/java-tutorial/#/lecture/139606

class Frog {
	private String name;		// premenne su private, nedaju sa pristupovat mimo classu
	private int age;
	private String hello = "Hello!";
	
	public void setName(String name) {		// set method, imput parametra z objectu
		this.name =  name;		//this.name odkazuje na name parameter classu/objectu name na parameter method
	}
	
	
	public String getName() {	// get method, output parametra z objektu
		return name;
	}	
	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public int getAge() {
		return age;
	}
	
	
	
	public String getHello() {			// pokial nemam v methos parametre nepotrebujemm this
		return hello;
	}
	
}

public class SetThis {
	public static void main(String[] args) {

		Frog frog1 = new Frog();
		//frog1.name = "Bertie";	// kedze "name" je private, nebude fungobat
		//frog1.age = 1;
		
		frog1.setName("Bertie");
		frog1.setAge(1);
		
		frog1.getHello();
		
		
		System.out.println(frog1.getName());
		System.out.println(frog1.getHello());	
	}
}


