// source: https://www.udemy.com/java-tutorial/#/lecture/138686
class MPerson {
	String name;
	int age;
	
	void speak() {
		System.out.println("My name is: " + name);
	}
	
	int calculateYearsToRetirment() {	// method nevypise output automaticky
		int yearsLeft = 65 - age;
		return yearsLeft;				// vrati hodnotu yearsLeft
	}
	
	int getAge() {			// get methods, vrati hodnotu z objectu
		return age;
	}
	String getName() {
		return name;
	}
}



public class MetValues {
	public static void main(String[] args) {

		MPerson person1 = new MPerson();
		person1.name = "Joe";
		person1.age = 25;
		
		person1.speak();
		
		int years = person1.calculateYearsToRetirment();	// premennan rovno vratenej hodnote yearsLeft
		System.out.println(years);							// output method cez premennu
	
		int age = person1.getAge();					// premenna age dkazujuca na getAge method
		String name = person1.getName();			// premenna name dkazujuca na getAge method
		
		System.out.println("Name is: " + name);		// pouzitie premmenej "name"
		System.out.println("age is: " + age);		// pouzitie premmenej "name" 
	}
}
