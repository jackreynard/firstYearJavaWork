/**
*Author: Jack Reynard
*The BalloonExtended class calculates the first angle of observation, the second angle of observation, speed and balloon distance
*/

import java.util.*;

public class BalloonExtended {
	private double height1;
	private double height2;
	private double distanceExtended;
	private double timeExtended;
	
	

// Constructors
public BalloonExtended(double h1, double h2, double dd, double tt){
	height1 = h1;
	height2 = h2;
	distanceExtended = dd;
	timeExtended = tt;
	
}

		//Methods
		
		
		public double a1(){ // calculates the first angle
			return Math.toDegrees(Math.atan(height1/distanceExtended));
		}
		
		public double a2(){ // calculates the second angle
			return Math.toDegrees(Math.atan((height2/distanceExtended)+(Math.tan(height1))));
		}
		
		public double speed(){ // calculates the speed that the balloon is climbing
			return (height2 / timeExtended);
		}
		
		public double balloonDistance(){ // calculates the distance from the observer to the balloon
			return (distanceExtended / (Math.cos (Math.toRadians(a2()))));
		}
		
		
}
			
