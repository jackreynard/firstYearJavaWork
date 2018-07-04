/**
 * Author: Jack Reynard
 * The DrivewayUser class outputs the cost of covering a driveway in tarmac, brick and stone 
 */

import java.util.Scanner;

public class DrivewayUser {
	
	
	public static void main(String [] args){
		Driveway myDriveway; // creates a new driveway object from the driveway class
		Scanner input = new Scanner(System.in); // creates a new scanner input
		double inputLen=0; 
			System.out.println("Please input the width the driveway");
			double inputWid = input.nextDouble(); // reads the width
			if (inputWid <= 0) { // gives an error message if a value below 0 is given 
			
				System.out.println("Invalid value, please try again");
			
			}
			else{
			
				System.out.println("Please input the length of the driveway");
				inputLen = input.nextDouble(); // reads the length
			}
			if (inputLen <= 0) { // gives an error message if a value below 0 is given
				System.out.println("Invalid value, please try again");
			}
			else{
				
				for (int x = 1; x<4; x++) { // repeats the costs for the 3 different materials by incrementing the value of x and terminating once it reaches 3
					myDriveway = new Driveway(inputWid, inputLen, x);
					System.out.println("The area of your driveway is " +myDriveway.area()+ " metres squared");
					System.out.println("The cost of your driveway is " +myDriveway.materialCost()+ " pound sterling");
					System.out.println("The labour cost of your driveway is " +myDriveway.labourCost()+ " pound sterling");
					System.out.println("The cost before VAT of your driveway is " +myDriveway.costBeforeVAT()+ " pound sterling");
					System.out.println("The cost after VAT of your driveway is " +myDriveway.VAT()+ " pound sterling");
					System.out.println("The total cost of your driveway is " +myDriveway.totalCost()+ " pound sterling \n\n");
				
				
			}
			
			}
			}
			
	}

			
			
			
			