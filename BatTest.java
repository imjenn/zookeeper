package com.codingdojo.zookeeper2;

public class BatTest {

	public static void main(String[] args) {
		Bat b = new Bat();
//		b.setEnergy(300);
		System.out.println(b.displayEnergy());
		b.attackTown();
		System.out.println(b.displayEnergy());
		b.attackTown();
		System.out.println(b.displayEnergy());
		b.attackTown();
		System.out.println(b.displayEnergy());
		b.eatHumans();
		System.out.println("Eating humans - " + b.displayEnergy());
		b.eatHumans();
		System.out.println("Eating humans - " + b.displayEnergy());
		b.fly();
		System.out.println(b.displayEnergy());
		b.fly();
		System.out.println(b.displayEnergy());

	}

}
