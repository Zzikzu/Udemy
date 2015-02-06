// source: https://www.udemy.com/java-tutorial/#/lecture/149501

public class Polymorphism {
	public static void main(String[] args) {
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
		Plant plant2 = tree;		//objekt z Plant classu sa odkazuje object tree, child class
									//polymorphism, mozem puzit child class 

		plant2.grow();				//pouzije method z child objectu
		
		tree.shedLeaves();
		
		//plant2.shedLeaves();		//Plant neobsahuje tuto method

		
		doGrow(tree);
		doGrow(plant1);
		doGrow(plant2);
		
	}
	
	public static void doGrow(Plant plant) {	//
		plant.grow();
	}
}


