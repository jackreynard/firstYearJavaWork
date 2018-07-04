/**
*Author: Jack Reynard
*The Balloon class calculates the height, increase in height, speed and balloon distance
*/

import java.util.*;

public class Balloon {
	private double angle1;
	private double angle2;
	private double distance;
	private double time;
	
	

// Constructors
public Balloon(double a1, double a2, double d, double t){
	angle1 = a1;
	angle2 = a2;
	distance = d;
	time = t;
	
}

		//Methods
		
		
		public double h1(){ // calculates the original height
			return distance*(Math.tan (Math.toRadians(angle1)));
		}
		
		public double h2(){ // calculates the increase in height
			return (distance*((Math.tan (Math.toRadians(angle2)))-(Math.tan (Math.toRadians(angle1)))));
		}
		
		public double speed(){ // calculates the speed that the balloon is climbing
			return (h2() / time);
		}
		
		public double balloonDistance(){ // calculates the distance from the observer to the balloon
			return (distance / (Math.cos (Math.toRadians(angle2))));
		}
		
		
}
			
