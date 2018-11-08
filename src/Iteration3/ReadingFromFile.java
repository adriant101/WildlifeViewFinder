package Iteration3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Iteration2.Animal;

public class ReadingFromFile {

	public static void main(String[] args) throws FileNotFoundException {
	Scanner read = new Scanner (new File("bin\\Iteration3\\animallist.txt"));
   read.useDelimiter(",");
   String name, countryOfOrigin, description, imagePath;

   while(read.hasNext())
   {
       name = read.next();
       countryOfOrigin = read.next();
       description = read.next();
       imagePath = read.nextLine();
       Animal myAnimal = new Animal (name, countryOfOrigin, description, imagePath);
     System.out.println(myAnimal); 
   }
   read.close();

	}

}
