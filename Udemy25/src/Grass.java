import world.Plant;


public class Grass extends Plant{	//subclass of Plant but in different package
	public Grass() {
		//Won't work -- different package
		//System.out.println(this.height);
	}

}


