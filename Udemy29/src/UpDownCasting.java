//source: https://www.udemy.com/java-tutorial/#/lecture/152300


class Machine {				//parent class
	public void start() {
		System.out.println("Machine started");
	}
}

class Camera extends Machine {		//child class
	public void start() {
		System.out.println("Camera started");
	}
	public void snap() {
		System.out.println("Phoro taken");
	}
}

public class UpDownCasting {
	public static void main(String[] args) {

		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		machine1.start();
		camera1.start();
		camera1.snap();
		
		//upcasting - save
		//Machine machine2 = new Camera();	//polymorphysm
		Machine machine2 = camera1;			//upcasting z camera na machine
		machine2.start();
		//machine2.stop();					//machine nema .stop method
		
		//downcasting - can by unsave
		Machine machine3 = new Camera();
		Camera camera2 = (Camera)machine3;	//pri downcaste potrebujem confirmovat typ (Camera)
		camera2.start();
		camera2.snap();
		
		//Doesn't work -- runtime error
		Machine machine4 = new Machine();
		//Camera camera3 = (Camera)machine4;
		//camera3.start();
		//camera3.snap();
		
	}
}


