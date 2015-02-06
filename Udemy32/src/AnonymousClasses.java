//source: https://www.udemy.com/java-tutorial/#/lecture/156484



class Machine {
	public void start() {
		System.out.println("Starting machine");
	}
}


interface Plant {
	public void grow();
}

public class AnonymousClasses {
	public static void main(String[] args) {

		Machine machine1 = new Machine() {				//v skutocnosti sa jedna o child class of machine
			@Override public void start() {				//bez mena
				System.out.println("Cameta snapping");
			}
		};
		machine1.start();
		
		Plant plant1 = new Plant() {		//vytvoerenie obejktu z interfacu
			@Override						//interface neobsahuje konkretny kod, preto je rozsireny ce anonymous class
			public void grow() {
				// TODO Auto-generated method stub
				System.out.println("Plant growing");
				
			}
			
		};
		
		plant1.grow();
	}
}


