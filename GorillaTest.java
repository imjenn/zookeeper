package com.codingdojo.zookeeper2;

public class GorillaTest {

	public static void main(String[] args) {
		Gorilla g = new Gorilla();
		System.out.println(g.displayEnergy());
		
		g.throwSomething();
		System.out.println(g.displayEnergy());
		
		g.throwSomething();
		System.out.println(g.displayEnergy());
		
		g.throwSomething();
		System.out.println(g.displayEnergy());
		
		g.eatBananas();
		System.out.println(g.displayEnergy());
		
		g.eatBananas();
		System.out.println(g.displayEnergy());
		
		g.climb();
		System.out.println(g.displayEnergy());

	}

}
