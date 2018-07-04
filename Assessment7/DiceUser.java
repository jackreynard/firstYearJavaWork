/**
 * Author: Jack Reynard
 * The DiceUser class reads in the three numbers given by both players and outputs; them in order, the average score, total score and the winner
 */

import java.util.Scanner; 

public class DiceUser {
	
	//Methods//
	public static void main(String [] args){
		Dice myDice; // creates a new dice object from the dice class
		Scanner input = new Scanner(System.in); //creates a new scanner
		int inputFirst=0;
		int inputSecond=0;
		int inputThird=0;
		int inputFirst2=0;
		int inputSecond2=0;
		int inputThird2=0;
		int totalPoints = 0;
		int totalPoints2 = 0;
			System.out.println("Please input the amount of goes you would like: ");
			int rounds=input.nextInt();
			for (int x = 1; x<=rounds; x++){ //gets the scores for each round the players played
			System.out.println("Please input the first number:");
				inputFirst = input.nextInt();
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
				System.out.println("Player two please input the first number:");
					inputFirst2 = input.nextInt();
			if ((inputFirst2 < 1) || (inputFirst2>6)){ //checks to see if the value given is valid
			
				System.out.println("Invalid value, please try again");
			
			}
			else{
			
				System.out.println("Player two please input the second number:");
				 inputSecond2 = input.nextInt();
			}
			 if ((inputSecond2 < 1) || (inputSecond2>6)){ //checks to see if the value given is valid
				System.out.println("Invalid value, please try again");
			}
			else{
				System.out.println("Player two please input the third number:");
				 inputThird2 = input.nextInt();
			}
			if ((inputThird2 < 1) || (inputThird2 > 6)){ // checks to see if the value given is valid
				System.out.println("Invalid value, please try again");
			}
			else{
				
				
				
				myDice = new Dice(inputFirst, inputSecond, inputThird,inputFirst2, inputSecond2, inputThird2);
				myDice.sort(); //calls the sorting array
				myDice.sort2();
				System.out.println("The three dice for player one have scores: " +inputFirst+ ", "+inputSecond+" and " +inputThird);
				System.out.println("Your rolls ordered are " +myDice.sortedRoll1()+ ", " +myDice.sortedRoll2()+ ", " +myDice.sortedRoll3());//prints out the rolls ordered
				System.out.println(myDice.result()); //prints out the players score
				System.out.println("The three dice for player two have scores: " +inputFirst2+ ", "+inputSecond2+" and " +inputThird2);
				System.out.println("Your rolls ordered are " +myDice.sortedRoll12()+ ", " +myDice.sortedRoll22()+ ", " +myDice.sortedRoll32());
				System.out.println(myDice.result2()); //prints out the players score
				myDice.winner(); //prints out the winner
				
				
				
				
			}
			totalPoints = totalPoints+myDice.result(); //determines the total score of both players
			totalPoints2 = totalPoints2+myDice.result2();
			
			}
			avgPoints = totalPoints/rounds; //determines the average score of both players
			avgPoints2 = totalPoints2/rounds;
			System.out.println("Player 1 total points: " +totalPoints+ " Player 2 total points: "+totalPoints2); //outputs the average and total scores of both players
			System.out.println("Player 1 average points: " +avgPoints+ " Player 2 average points: "+avgPoints2);
			
				
			
			
	}

}			
			
			
	}		