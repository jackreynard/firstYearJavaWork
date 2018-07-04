/**
 * Author: Jack Reynard
 * The Savings class works out how much it will cost the user in savings in each of the three methods
 */
 import java.*;
 public class Savings {

			
	private double cost;
	private int years;
	
	


	//Constructors//
public Savings(double c, int y){
	cost = c;
	years = y;
	
	}

	//Methods//
	
	public void equalMethod (){
		System.out.println("Using the equal amount method:");
		double amount =(cost/years); //finds out how much each year will cost
			for (int x =1 ; x<=years; x++){ //repeats the calculations for the amount of years
				double saved = x*amount; //finds out how much they have saved in total
				double remaining = (cost-saved); // finds out how much is left to save
				System.out.printf("The amount saved in year %d, is %.2f, and the remaining amount is, %.2f \n\n",x,saved,remaining); //prints out the values calculated
		}
		System.out.println("\n\n");
		}
	
	public void decreasingMethod(){
		System.out.println("Using the decreasing amount method:");
		double remaining = cost;
		double total = 0;
		double sumOfYears = (((years*years)+years)/2); //finds out the sum of the years
			for (int x =1 ; x<=years; x++){ //repeats the calculations for the amount of years
				double amount = ((((years-x)+1)/sumOfYears)*cost); //finds out how much is saved in that year
				
				remaining = remaining-amount; // finds out how much is left to save
				total = total+amount; //calculates how much has been saved so far
				System.out.printf ("The amount saved in year %d is %.2f, the total saved is %.2f, and the remaining amount is %.2f \n\n" ,x,amount,total, remaining); //prints out the values calculated
			
	}
		System.out.println("\n\n");
	}	
	
		
	public void fixedMethod(){
		System.out.println("Using the fixed amount method:");
			double remaining = cost;
			double total = 0;
				for (int x =1 ; x<=years; x++){ //repeats the calculations for the amount of years
					double amount = (2/(double)years)*remaining; //finds out how much has been saved that year
					total = total+amount; //calculates how much has been saved
					remaining = remaining-amount; //finds out how much is left to save
					System.out.printf("The amount saved in year %d is %.2f, the total saved is %.2f and the remaining amount is %.2f \n\n",x, amount, total,remaining);//prints out the values calculated
		}
		}
		}