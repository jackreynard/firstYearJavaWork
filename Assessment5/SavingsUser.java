/**
* Author: Jack Reynard
 * The SavingsUser class reads in the cost of the car and the number of years the user wants 
 * to save. It then outputs how much it will cost each year in three different methods of saving 
 */
 
 import java.util.Scanner;

public class SavingsUser {
	
	//Methods//
	
	public static void main(String [] args){
		Savings mySavings; //creates a new savings object from the savings class
		Scanner input = new Scanner(System.in); //creates a new scanner
		int inputYears=0;
		System.out.println("Please the cost of the car:");
			double inputCost = input.nextDouble();
				if (inputCost <=0 ) {
					System.out.println("Invalid value, please try again"); //creates an error message for an invalid value
			}
				else {
					System.out.println("Please input number of years you would to save:");
					inputYears = input.nextInt();
			}
				if ((inputYears < 1) || (inputYears >10)) { 
					System.out.println("Invalid value, please try again"); //creates an error message for an invalid value
			}
				else{ 
					mySavings = new Savings(inputCost, inputYears); //prints out the cost of each different for the user
					System.out.println("The original cost of the car is: " +inputCost)  ;
					System.out.println("and the number of years is: "+inputYears+"\n\n");
					mySavings.equalMethod();
					mySavings.decreasingMethod();
					mySavings.fixedMethod();
					
					
			}
	}
}