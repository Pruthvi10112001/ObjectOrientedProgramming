package com.kodnest.abstraction.example01;

public  abstract class Sparrow extends Bird {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Sparrow is flying.");
	}

	abstract public void eat();
}
