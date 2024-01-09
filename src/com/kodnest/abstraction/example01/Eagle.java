package com.kodnest.abstraction.example01;

public abstract class Eagle extends Bird {

	@Override
	public void fly() {
		System.out.println("Eagle flies high in sky.");

	}

	abstract public void eat();

}
