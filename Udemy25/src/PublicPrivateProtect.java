import world.Plant;

// source: https://www.udemy.com/java-tutorial/#/lecture/148144


/*
 * Access Levels:
 * ==============
 * private -- only within same class
 * public -- from anywhere
 * protected -- same class, subclass, same package 
 * no modifier -- came package only
 */


public class PublicPrivateProtect {
	public static void main(String[] args) {
		Plant plant = new Plant();

		System.out.println(plant.name);
		System.out.println(plant.ID);
		
		//Won't work -- type is private
		//System.out.println(plant.type);
		
		
		//Won't work -- size is protected and this class is in different package
		//System.out.println(plnat.size);
		
		//Won't work -- different package, height packed-level visibility
		//System.out.println(plant.height);
	}
}


