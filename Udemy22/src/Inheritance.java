// source: https://www.udemy.com/java-tutorial/#/lecture/146346

public class Inheritance {
	public static void main(String[] args) {
		InhrMachine mach1 = new InhrMachine();
		
		mach1.start();
		mach1.stop();
		
		
		Car car1 = new Car();
		
		car1.start();			//overvriten method from InhrMachine	
		car1.wipeWindShield();
		car1.showInfo();		// zdedena protected method
		car1.stop();			//method zdedena od InhrMachine
		
		
	}
}


