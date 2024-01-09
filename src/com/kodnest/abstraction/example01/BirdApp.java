package com.kodnest.abstraction.example01;

public class BirdApp {
	public static void main(String[] args) {
		Sky sky=new Sky();
		sky.permitBirds(new GoldenEagle());
		sky.permitBirds(new MountainEagle());
		sky.permitBirds(new SerpantEagle());
		
		sky.permitBirds(new VegSparrow());
		sky.permitBirds(new NonVegSparrow());
	}
}
