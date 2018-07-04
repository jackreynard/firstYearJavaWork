/**
 * Author: Jack Reynard
 * The DiceUser class reads in the three numbers given and outputs them in order and what result they give 
 */

import java.util.Scanner; 

public class DiceUser {
	
	//Methods//
	public static void main(String [] args){
		Dice myDice; // creates a new dice object from the dice class
		Scanner input = new Scanner(System.in); //creates a new scanner
		int inputSecond=0;
		int inputThird=0;
			System.out.println("Please input the first number:");
			int inputFirst = input.nextInt();
			if ((inputFirst < 1) || (inputFirst>6)){ //checks to see if the value given is valid
			
				System.out.println("Invalid value, please try again");
			
			}
			else{
			
				System.out.println("Please input the second number:");
				 inputSecond = input.nextInt();
			}
			 if ((inputSecond < 1) || (inputSecond>6)){ //checks to see if the value given is valid
				System.out.println("Invalid value, please try again");
			}
			else{
				System.out.println("Please input the third number:");
				 inputThird = input.nextInt();
			}
			if ((inputThird < 1) || (inputThird > 6)){ // checks to see if the value given is valid
				System.out.println("Invalid value, please try again");
			}
			else{
				
				
				myDice = new Dice(inputFirst, inputSecond, inputThird);
				myDice.sort(); //calls the sorting array
				System.out.println("The three dice have scores: " +inputFirst+ ", "+inputSecond+" and " +inputThird);
				System.out.println("Your rolls ordered are " +myDice.sortedRoll()+ ", " +myDice.sortedRoll2()+ ", " +myDice.sortedRoll3());
				System.out.println(myDice.result());
				
				
				
				
			}
			
				
			
			
	}

}			
			
			
			