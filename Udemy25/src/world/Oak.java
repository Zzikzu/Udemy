package world;

public class Oak extends Plant {
	public Oak() {
		
		//Won't work -- type is private
		//type = "tree";		//neda sa lebo String type je private v Plant class
		
		//This works -- size protected, Oak subclass of plant
		this.size = "large";	// zdeden z plant, size prteced
		
		
		//works -- Oak and Plant in same package
		this.height = 10;
	}

}


