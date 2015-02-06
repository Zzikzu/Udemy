// setarate clas for Inheritance tutorial

public class InhrMachine {
	
	private String name = "Machine Type 1";		// privatne methods su pristupne len v classe
												// nedaju sa dedit
	protected String surName = "Machine Type 2";	// protected sa daju dedit
	
	public void start() {
		System.out.println("Machine started");
	}
	public void stop() {
		System.out.println("Machine stoped");
	}
}


