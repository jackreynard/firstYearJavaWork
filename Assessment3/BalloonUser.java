/**
 * Author: Jack Reynard
 * The BalloonUser class outputs the original height, the increase in height, the speed and the distance to the balloon 
 */

import java.util.Scanner;


public class BalloonUser {
	
	
	public static void main(String [] args){
	
		Scanner input = new Scanner(System.in);// allows the user to choose which calculations they would like to perform
		System.out.println("Please enter 1 to enter two angles, speed and distance:");
		System.out.println("Or please enter 2 to enter two heights, speed and distance:");
		String choice = input.nextLine();
		if ("1".equalsIgnoreCase(choice)){// chooses the first option by comparing the user choice to the methods
				mode1();
		}
		else {
			mode2();
		}
	}
	public static void mode1(){
		Balloon myBalloon; // creates a new balloon object from the balloon class
		Scanner input = new Scanner(System.in); // creates a new scanner input
		double inputAng2=0;
		double inputDistance=0;
		double inputTime=0;
		
			System.out.println("Please input the first angle of elevation, it should be between 0 and 90 degrees:");
			double inputAng1 = input.nextDouble(); // reads the first angle
			if ((inputAng1 <= 0) && (inputAng1 >= 90 )) { // gives an error message if a value below 0 or above 90 is given 
			
				System.out.println("Invalid value, please try again");
			
			}
			else{
			
				System.out.println("Please input the second angle of elevation, it should be between 0 and 90 degrees:");
				inputAng2 = input.nextDouble(); // reads the second angle
			}
			if ((inputAng2 <= 0) && (inputAng2 >= 90)) { // gives an error message if a value below 0 or above 90 is given
				System.out.println("Invalid value, please try again");
			}
			else{
				System.out.println("Please input the horizontal distance, it must be a positive value:");
				inputDistance = input.nextDouble(); // reads the distance
				}
			if (inputDistance <= 0) { // gives an error message if the distance is below 0
				System.out.println("Invalid value, please try again");
				}
			else {System.out.println("Please input the time in seconds, it should be a positive value:");
				inputTime = input.nextDouble();	 // reads the time
			if (inputTime <= 0) { // gives an error message if a value below 0 is given for time
				System.out.println("Invalid value, please try again");
				}	
			else{
				  // prints out the calculations carried out by Balloon
					myBalloon = new Balloon(inputAng1, inputAng2, inputDistance, inputTime);
					System.out.println("The original height of the balloon is " +myBalloon.h1()+ " metres");
					System.out.println("The increase in height of the balloon is " +myBalloon.h2()+ " metres");
					System.out.println("The speed of the balloon is " +myBalloon.speed()+ " metres per second");
					System.out.println("The distance of the balloon at second observation is " +myBalloon.balloonDistance()+ " metres");
				}	
				
			
			
			}
			}
		public static void mode2(){
			BalloonExtended myBalloon; // creates a new balloon object from the balloonExtended class
			Scanner input = new Scanner(System.in); // creates a new scanner input
			double inputHeight2=0;
			double inputDistance=0;
			double inputTime=0;
		
				System.out.println("Please input the first observation height of elevation:");
				double inputHeight1 = input.nextDouble(); // reads the first height
					if (inputHeight1 <= 0)  { // gives an error message if a value below 0 is given
			
						System.out.println("Invalid value, please try again");
			
					}
					else{
			
						System.out.println("Please input the second observation height:");
						inputHeight2 = input.nextDouble(); // reads the second height
					}
					if (inputHeight2 <= 0) { // gives an error message if a value below 0 is given
						System.out.println("Invalid value, please try again");
					}
					else{
						System.out.println("Please input the horizontal distance, it must be a positive value:");
						inputDistance = input.nextDouble(); // reads the distance
					}
					if (inputDistance <= 0) { // gives an error message if the distance is below 0
						System.out.println("Invalid value, please try again");
					}
					else {System.out.println("Please input the time in seconds, it should be a positive value:");
						inputTime = input.nextDouble();	 // reads the time
					if (inputTime <= 0) { // gives an error message if a value below 0 is given for time
						System.out.println("Invalid value, please try again");
					}	
					else{
						// prints out the calculations carried out by BalloonExtended
						myBalloon = new BalloonExtended(inputHeight1, inputHeight2, inputDistance, inputTime);
						System.out.println("The original angle of observation of the balloon is " +myBalloon.a1()+ " degrees");
						System.out.println("The second observation of the balloon is " +myBalloon.a2()+ " degrees");
						System.out.println("The speed of the balloon is " +myBalloon.speed()+ " metres per second");
						System.out.println("The distance of the balloon at second observation is " +myBalloon.balloonDistance()+ " metres");
					}	
				
			
			
			}
			}
	}

			
			
			
			