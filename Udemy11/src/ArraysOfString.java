public class ArraysOfString {
	public static void main(String[] args) {

		// prvy sposob zadefinovania array
		String[] words = new String[3]; // alokuje memory pre 3 referencia

		words[0] = "Hello"; // alokuje memory pre string
		words[1] = "to";
		words[2] = "you";

		System.out.println(words[2]);

		// druhy sposob zadefinovania
		String[] fruits = { "apple", "banana", "pear", "kiwi" };

		// zadefinovanie stringu fruit, ktory odkazuje na array fruits
		for (String fruit : fruits) {
			System.out.println(fruit); // volanie fruit
		}

		int value = 0; // int alokuje pamat pre hodnotu, primitive type

		String text = null; // alokuje mamory pre refernciu na string, default
							// null
							// nonprimitive type (class)
		System.out.println(text);

		String[] texts = new String[2];
		System.out.println(texts[0]); // outup null, lebo element nebol
										// zadefinobany

	}

}