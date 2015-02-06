// source: https://www.udemy.com/java-tutorial/#/lecture/137826
class Person {
	
	// instance variables
	String name;
	int age;
	
	// classes can contain:
	// 1. data
	// 2. subroutines (methods) 
}


public class ClassObj {				// public class musi byt zhodny s filename (*.java)
	public static void main(String[] args) {	// java program starts at main method

		Person person1 = new Person();	// object "person1" vytvoreny z class "Person"
		person1.name = "Joe Bloggs";	// zadefinovanie vlastnosti pre person1
		person1.age = 37;
	
		Person person2 = new Person();
		person2.name = "Sarah Smith";
		person2.age = 20;
		
		System.out.println(person1.name);	// output z objectu
		System.out.println(person2.age);
		
		
	}
}


