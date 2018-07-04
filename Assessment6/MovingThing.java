/**
* Author: Jack Reynard
 * The MovingThing class calculates where the robot should move to depending on 
 * The direction it is facing and whether or not it has detected the hole
 */


public class MovingThing extends StationaryThing{ //extends the subclass StationaryThing

	protected String name;
	protected int xCoord;
	protected int yCoord;
	
	
	//Constructors//
	
	public MovingThing(int x, int y, String n){
		super (x, y, n)
		xCoord = x;
		yCoord = y;
		name = n;
		}
		
		//Methods//
		
		public float calcMovingPosition(){
			float movingX;
			float movingY;
			
			int originalX= 3;
			int originalY = 0;
			int newX = orininalX-1; //finds the robots new coordinates
			int newY = originalY-1;
			
			
			public Object foundHole() { //checks to see whether the hole has been detected

			if ( (newY = yCoord+1){
				return true;
				}
			 else {
			 return false;
			 }
			