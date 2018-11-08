package Iteration2;

public class Animal {
private String name;
private String countryOfOrigin;
private String description;
private static String imageName;

	
//Constructor

public Animal(String name, String countryOfOrigin, String description, String imageName) {
	this.name = name;
	this.countryOfOrigin = countryOfOrigin;
	this.description = description;
	this.imageName = imageName;
	
}


public String getImageName() {
	return imageName;
}
	
public String toString() {
	return "Animal Name:" + name+ "\nAnimal Origin: "+ countryOfOrigin + "\nDescription:" + description;
}

}
