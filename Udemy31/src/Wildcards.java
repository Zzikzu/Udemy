import java.util.ArrayList;

//source: https://www.udemy.com/java-tutorial/#/lecture/152317

class Machine{

	@Override
	public String toString() {
		return "I am a machine";
	}
	
	public void start() {
		System.out.println("Machine started");
	}
}

class Camera extends Machine {
	@Override
	public String toString() {
		return "I am a camera";
	}
	
	public void snap() {
		System.out.println("Camera snap");
	}
}


public class Wildcards {
	public static void main(String[] args) {

		//Array list of Strings
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		
		showList(list);
		
		
		//Array list of objects
		ArrayList<Machine> list1 = new ArrayList<Machine>();		//list array of object
		list1.add(new Machine());
		list1.add(new Machine());
		
		
		ArrayList<Camera> list2 = new ArrayList<Camera>();		//camera child of machine
		list2.add(new Camera());
		list2.add(new Camera());
		
		showListMach(list1);	
		
		//nefunguje pookial poikal method ma nasledovny tvar:
		//public static void showList(ArrayList<String> list) {
		//for(String value: list) {
		//	System.out.println(value);
		//	}
		//}
		//showListMach(list2);		//array list of cameras nie je subclass array list of machines
		
		showListMach(list2);		//funguje s pouzitim Wildcard <?>
	}
	
	
	//Method to array list of machines
	public static void showList(ArrayList<String> list) {
		for(String value: list) {
			System.out.println(value);
		}
	}
	
	//Method to array list of objects
/*	public static void showListMach(ArrayList<?> list) {
		for(Object value: list) {						//len pri pouziti Object - superclass
			//System.out.println(value);
		}
	}
*/
	
	public static void showListMach(ArrayList<? extends Machine> list) {	//rozsirenie
		for(Machine value: list) {						//pre machine
			System.out.println(value);
			value.start();
		}
	}

}
