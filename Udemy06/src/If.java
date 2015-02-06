public class If {
	public static void main(String[] args) {

		// boolean cond = 4 == 6; // equqlity test ==

		int myInt = 20;

		if (myInt < 10) {
			System.out.println("Yes, it's true!");
		} else if (myInt > 20) {
			System.out.println("True");
		}

		else {
			System.out.println("No, it's false!");
		}

		int loop = 0; // while if combination
		while (true) {
			System.out.println("Looping: " + loop);

			if (loop == 5) {
				break; // breaks the looping
			}

			loop++;

		}

	}
}
