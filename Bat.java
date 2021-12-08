package com.codingdojo.zookeeper2;

public class Bat extends Mammal {
	public Bat() {
//		super();
		super.setEnergy(300);
	}

	public void fly() {
		System.out.println("*Wings flapping*");
		int energy = super.displayEnergy() - 50;
		setEnergy(energy);
	}
	
	public void eatHumans() {
		int energy = super.displayEnergy() + 5;
		setEnergy(energy);
	}
	
	public void attackTown() {
		System.out.println("*Sounds of fire crackling*");
		int energy = super.displayEnergy() - 50;
		setEnergy(energy);
	}
	
}
