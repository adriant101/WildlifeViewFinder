package Iteration1;

import java.util.Scanner;

import Iteration2.Animal;

public class AnimalInfo {
	private static  String animalName;
	private static String animalCountry;
	private static String animalDesc;
	private static String animalImg;
	

	public static void main(String[] args) {
		String i="Y";
		Scanner myScan = new Scanner(System.in);
		
		do {
		
		System.out.println("What is the animal called?");
		animalName = myScan.nextLine();
		System.out.println("Where is the animal from?");
		animalCountry = myScan.nextLine();
		System.out.println("Enter animal description:");
		animalDesc = myScan.nextLine();
		System.out.println("Enter animal\'s image name:");
		animalImg = myScan.nextLine();
		Animal myAnimal = new Animal(animalName, animalCountry, animalDesc, animalImg);
		System.out.println(myAnimal);
		System.out.println("Continue? Y/N: ");
		i = myScan.nextLine();
		;
		} 
		while (i.equalsIgnoreCase("Y"));
		

	}
	
}
