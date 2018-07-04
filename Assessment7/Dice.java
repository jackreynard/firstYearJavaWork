/**
 * Author: Jack Reynard
 * The Dice class orders the three numbers in an array and then works out whether they are all different, in a run, there's a pair or they're all the same 
 */


import java.util.Arrays;

public class Dice {

			
	private int first;
	private int second;
	private int third;
	private int first2;
	private int second2;
	private int third2;
	private int newFirst;
	private int newThird;
	private int newSecond;
	private int newFirst2;
	private int newThird2;
	private int newSecond2;
	private int[] rollArray;
	private int[] rollArray2;
			int points = 0;
			int points2 = 0;
			int p1Wins = 0;
			int p2Wins = 0;
			
	//Constructors//
public Dice(int f, int s, int t, int f2, int s2, int t3){
	first = f;
	second = s;
	third = t;
}

	//Methods//
	
	public void sort(){
		rollArray = new int[3]; //creates a new array
		rollArray[0] = first; //assigns the values from the user into an array
		rollArray[1] = second;
		rollArray[2] = third;
		Arrays.sort(rollArray); //sorts the array 
		newFirst = rollArray[0]; //assigns the sorted array values to new variables
		newSecond = rollArray[1];
		newThird = rollArray[2];
		
	}	
	public void sort2(){
		rollArray2 = new int[3];
		rollArray2[0] = first2; //assigns the values from the user into an array
		rollArray2[1] = second2;
		rollArray2[2] = third2;
		Arrays.sort(rollArray2);
		newFirst2 = rollArray2[0]; //assigns the sorted array values to new variables
		newSecond2 = rollArray2[1];
		newThird2 = rollArray2[2];
		
		
		
	public int result() { //checks to see what output should be given for the numbers read in
		int sumOfDice = (rollArray[0]+rollArray[1]+rollArray[2]);
		if ((newFirst==newSecond) && (newFirst==newThird)){ //compares the first number to the second and third to see if they're the same
			points = sumOfDice+60;
			
		}
		else if ((newFirst+1==newSecond) && (newSecond+1==newThird)){ //checks to see if the numbers are in a run 
			points = sumOfDice+40;
		}
		else if ((newFirst != newSecond) && (newSecond != newThird)) { //checks to see if the the numbers are all different
			points = sumOfDice;
		}
		else {
			points = sumOfDice+20; // if none of the other possibilities are true then it must be a pair
		}
	}
	
	
	public int result2() { //checks to see what output should be given for the numbers read in
		int sumOfDice = (rollArray2[0]+rollArray2[1]+rollArray2[2]);
		if ((newFirst2==newSecond2) && (newFirst2==newThird2)){ //compares the first number to the second and third to see if they're the same
			points2 = sumOfDice+60;
			
		}
		else if ((newFirst2+1==newSecond2) && (newSecond2+1==newThird2)){ //checks to see if the numbers are in a run 
			points2 = sumOfDice+40;
		}
		else if ((newFirst2 != newSecond2) && (newSecond2 != newThird2)) { //checks to see if the the numbers are all different
			points2 = sumOfDice;
		}
		else {
			points2 = sumOfDice+20; // if none of the other possibilities are true then it must be a pair
		}
	}
	
	
	
	
	
	public int sortedRoll1(){ //returns the numbers in order
		return newFirst;
	}
	
	public int sortedRoll2(){
		return newSecond;
	}
	
	public int sortedRoll3(){
		return newThird;
	}	
		public int sortedRoll12(){ //returns the numbers in order
		return newFirst;
	}
	
	public int sortedRoll22(){
		return newSecond;
	}
	
	public int sortedRoll32(){
		return newThird;
	}
	
	public Object winner(){
		if (points>points2) {
			System.out.println("Round winner is player 1"); //determines the winner
			p1Wins++;
			}
		else {
			System.out.println("Round winner is player 2");
			p2Wins++;
			}
			}
			
	}