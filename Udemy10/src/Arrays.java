public class Arrays {
	public static void main(String[] args) {

		int value = 7;

		int[] values;
		values = new int[3];		// definuje pocet elementov v array
		
		System.out.println(values[0]);
		
		values[0] = 10;		// zadefinuje hodnotu pre prvy element
		values[1] = 20;
		values[2] = 30;
		
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		
		for(int i=0; i<values.length; i++) {	// vypise vestky elementy z array
			System.out.println(values[i]);
		}
		
		int[] numbers = {5, 6, 7,};			// iny sposob zadefinoania array
		
		for(int i=0; i<numbers.length; i++){
			System.out.println(numbers[i]);
		}
	}
}