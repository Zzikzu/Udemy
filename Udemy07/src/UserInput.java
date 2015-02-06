import java.util.Scanner; // inport statemnt

public class UserInput {
	public static void main(String[] args) {

		// create scanner object
		Scanner input = new Scanner(System.in);

		// output the prompt
		System.out.println("Enter your input: ");

		// ocakava string
		String line = input.nextLine();
		System.out.println("You entered: " + line);

		// ocakava int
		int value = input.nextInt();
		System.out.println("You entered: " + value);

	}
}