/**
 * Author: Jack Reynard
 * The Dice class orders the three numbers in an array and then works out whether they are all different, in a run, there's a pair or they're all the same 
 */


import java.util.Arrays;

public class Dice {

			
	private int first;
	private int second;
	private int third;
	private int newFirst;
	private int newThird;
	private int newSecond;
	private int[] rollArray;


	//Constructors//
public Dice(int f, int s, int t){
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
		
		
		
		
		
	public Object result() { //checks to see what output should be given for the numbers read in
	
		if ((newFirst==newSecond) && (newFirst==newThird)){ //compares the first number to the second and third to see if they're the same
			return "The numbers are all the same";
		}
		else if ((newFirst+1==newSecond) && (newSecond+1==newThird)){ //checks to see if the numbers are in a run 
			return "The numbers are in a run";
		}
		else if ((newFirst != newSecond) && (newSecond != newThird)) { //checks to see if the the numbers are all different
			return "The numbers are all different";
		}
		else {
			return "Two of the numbers are the same"; // if none of the other possibilities are true then it must be a pair
		}
	}
	
	public int sortedRoll(){ //returns the numbers in order
		return newFirst;
	}
	
	public int sortedRoll2(){
		return newSecond;
	}
	
	public int sortedRoll3(){
		return newThird;
	}
}