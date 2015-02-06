// source: https://www.udemy.com/java-tutorial/#/lecture/139565

class Robot {
	public void speak(String text){		// pridelene parametru, String "text"
		System.out.println(text);		// vypise parameter
	}
	
	public void jump(int height) {		// method s dvoma paramtrami
		System.out.println("Jumping: " + height);
	}
	
	public void move(String direction, double distance) {
		System.out.println("Moving " + distance + " metres in direction " + direction);
	}
}


public class MetParam {
	public static void main(String[] args) {
		Robot sam = new Robot();
		
		sam.speak("Hi I am Sam.");		// volanie method s parametrom
		sam.jump(7);
		sam.move("West", 12.2);			// volanie method o dvoch parametroch
	
		String greeting = "Hello there!";
		sam.speak(greeting);			// volanie method s pouzitim premennenj ako parameter

		int value = 14;
		sam.jump(value);				// volanie method s pouztitim int premennerj
	}
}


