import java.util.ArrayList;
import java.util.HashMap;

//source: https://www.udemy.com/java-tutorial/#/lecture/152306

class Animal {
	
}


public class Generics {
	public static void main(String[] args) {

		//before java5 - old style
		ArrayList list = new ArrayList();
		
		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		String fruit = (String)list.get(1);	//priradi druhy element
		
		System.out.println(fruit);
		
		//after java5 - modern style
		ArrayList<String> strings = new ArrayList<String>();	//generic class - ma parametre <>
		
		strings.add("cat");
		strings.add("dog");
		strings.add("aligator");
		
		String animal = strings.get(1);
		
		System.out.println(animal);
		
		
		//more than one type argument
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		// java 7 style
		
		ArrayList<Animal> someList = new ArrayList<>();
	}
}


