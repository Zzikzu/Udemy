// source: https://www.udemy.com/java-tutorial/#/lecture/138666
class MyPerson {
	
	// instance variables
	String name;
	int age;
	
	// classes can contain:
	// 1. data
	// 2. subroutines (methods) 
	
	void speak() {			// crating method
		System.out.println("My name is: " + name + " and I am " + age + " years old.");
	}
	
	
	void sayHello() {
		System.out.println("Hello there!");
	}
}


public class Method {
	public static void main(String[] args) {

		MyPerson person1 = new MyPerson();	
		person1.name = "Joe Bloggs";	
		person1.age = 37;
		person1.speak();		// priradenie method ku objectu
		person1.sayHello();
	
		MyPerson person2 = new MyPerson();
		person2.name = "Sarah Smith";
		person2.age = 20;
		
		
	}
}


