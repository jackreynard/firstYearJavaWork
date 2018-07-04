/**
* Author: Jack Reynard
 * The ThingUser class reads in the coordinates of the hole
 * It also gets the names of the two robots and how moves they are allowed to make
 * It then outputs the moves the robots make until they find the hole
 */
 
 import java.util.*;
 
 public class ThingUser {
 
	//Methods//
	
	public static void main(String [] args){
		StationaryThing hole;
		Scanner input = new Scanner(System.in);
		int inputY = 0;
		int inputMoves = 0;
		int inputX = 0; 
		do{
			System.out.print("\nPlease input the x value:");
				inputX = input.nextInt();
				if ((inputX <0 )||(inputX>9)) { //checks to see whether the input is valid
					System.out.println("Invalid value, please try again");
				}
		} 
		while ((inputX <0 )||(inputX>9));
				
		do{
			System.out.print("\nPlease input the y value:");
				inputY = input.nextInt();
				if ((inputY <0 )||(inputY>9)) { //checks to see whether the input is valid
					System.out.print("Invalid value, please try again");
				}
		}
		while ((inputY <0 )||(inputY>9));
				
			System.out.print("\nPlease input the name of the moving thing:"); //gets the name of the moving robot
				String inputMoving = input.next();
					
			System.out.print("\nPlease input the name of the random thing:"); //gets the name of the random robot
				String inputRandom = input.next();
		
		do{	
			System.out.print("\nPlease input the number of moves you would like to make:");
				inputMoves = input.nextInt();
					if (inputMoves<0) { //checks to see if the number of moves is valid
						System.out.print("Invalid value, please try again");
					}
		}
		while (inputMoves<0);
						
		hole = new StationaryThing(inputX, inputY, "hole" );
		System.out.println("\nStationary Item:"+ hole.name+" at ("+inputX+","+inputY+ ")"); //returns all the values given by the user
	}
}
					
					
					
					
					
					
					
					
					
					