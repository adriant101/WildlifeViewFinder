package Iteration4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Iteration2.Animal;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Graphic extends Application {
	 ArrayList line = new ArrayList();
	 Image graphic;
	public static void main(String[] args) {
		launch(args);

	}
	
	 int i = 0;
	@Override
	public void start(Stage stage) throws Exception {
		GridPane grid1 = new GridPane();
		GridPane imgFrame = new GridPane();
		
		Scanner read = null;
		try {
			read = new Scanner (new File("bin\\Iteration3\\animallist.txt"));
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		 while (read.hasNext())
	        {
			   
			  line.add(read.nextLine());
		
	            ;
	        }
		
		Button next = new Button("Next");
		grid1.add(next, 60, 68);
		
		ImageView iv = new ImageView();
		iv.setFitHeight(300);iv.setFitWidth(330);
		imgFrame.add(iv, 2, 2);
		imgFrame.setLayoutX(150);imgFrame.setLayoutY(200);
		grid1.setLayoutX(550);grid1.setLayoutY(200);
		Text animalText = new Text();
		animalText.setLayoutX(500);animalText.setLayoutY(300);
		
		next.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				
				 
				   String name, countryOfOrigin, description, imagePath;
				   
				   String animal1, animal2, animal3, animal4, animal5;
				   
				   if (i == 0) {
					   animal1 = (String) line.get(0);
					   Scanner reader = new Scanner(animal1);
					   reader.useDelimiter(",");
					   name = reader.next();
					   countryOfOrigin = reader.next();
					   description = reader.next();
					   imagePath = reader.next();
					   Animal myAnimal = new Animal (name, countryOfOrigin, description, imagePath);
					   Image graphic = new Image(myAnimal.getImageName());
					   iv.setImage(graphic);
					   
					   animalText.setText(myAnimal.toString());
							   
				   }else if(i==1) {
					animal2 = (String)line.get(1);
				   Scanner reader = new Scanner(animal2);
				   reader.useDelimiter(",");
				   name = reader.next();
				   countryOfOrigin = reader.next();
				   description = reader.next();
				   imagePath = reader.next();
				   Animal myAnimal = new Animal (name, countryOfOrigin, description, imagePath);
				   Image graphic = new Image(myAnimal.getImageName());
				   iv.setImage(graphic);
				   animalText.setText(myAnimal.toString());
				   }else if(i==2) {
					animal3 = (String)line.get(2);
					Scanner reader = new Scanner(animal3);
					reader.useDelimiter(",");
					name = reader.next();
					countryOfOrigin = reader.next();
					description = reader.next();
					imagePath = reader.next();
					Animal myAnimal = new Animal (name, countryOfOrigin, description, imagePath);
					Image graphic = new Image(myAnimal.getImageName());
					iv.setImage(graphic);
					animalText.setText(myAnimal.toString());
					   
				   }else if(i==3) {
						animal4 = (String)line.get(3);
						Scanner reader = new Scanner(animal4);
						reader.useDelimiter(",");
						name = reader.next();
						countryOfOrigin = reader.next();
						description = reader.next();
						imagePath = reader.next();
						Animal myAnimal = new Animal (name, countryOfOrigin, description, imagePath);
						Image graphic = new Image(myAnimal.getImageName());
						iv.setImage(graphic);
						animalText.setText(myAnimal.toString());
						}
				   else if(i==4) {
						animal5 = (String)line.get(4);
						Scanner reader = new Scanner(animal5);
						reader.useDelimiter(",");
						name = reader.next();
						countryOfOrigin = reader.next();
						description = reader.next();
						imagePath = reader.next();
						Animal myAnimal = new Animal (name, countryOfOrigin, description, imagePath);
						Image graphic = new Image(myAnimal.getImageName());
						iv.setImage(graphic);
						animalText.setText(myAnimal.toString());
						i=-1;
						}
				   
				   
				   i+=1;
				
			
			}});
		
	
		
		Group root = new Group(grid1, animalText, imgFrame);
		Scene scene = new Scene(root, 1024, 760, Color.BEIGE);
		stage.setScene(scene);
		stage.setTitle("Wildlife View Finder");
		stage.show();
		
	}

}
