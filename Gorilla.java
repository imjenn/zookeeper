package com.codingdojo.zookeeper2;


public class Gorilla extends Mammal {
	
	public Gorilla() {
//		s
	}
	
	public void throwSomething() {
		System.out.println("The gorilla threw something.");
		int energy = super.displayEnergy() - 5;
		setEnergy(energy);
	}
	
	public void eatBananas() {
		System.out.println("Gorilla is satisfied.");
		int energy = super.displayEnergy() + 10;
		setEnergy(energy);
		
	}
	
	public void climb() {
		System.out.println("Gorilla climbed a tree.");
		int energy = super.displayEnergy() - 10;
		setEnergy(energy);
		
	}
}
