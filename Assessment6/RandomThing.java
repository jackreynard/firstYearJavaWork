/**
* Author: Jack Reynard
 * The RandomThing class calculates where the robot should move to depending on 
 * The direction it is facing and whether or not it has detected the hole
 */
 
 
public class RandomThing extends StationaryThing{ //extends the subclass StationaryThing

	protected String name;
	protected int xCoord;
	protected int yCoord;
	
	
	//Constructors//
	
	public RandomThing(int x, int y, String n){
		super (x, y, n)
		xCoord = x;
		yCoord = y;
		name = n;
		}
		
		//Methods//
		
		public float calcRandomPosition(){
			float movingX;
			float movingY;
			int originalX= 3;
			int originalY = 0;
			int newX = orininalX-1; //finds the new coordinates of the robot as it moves about the grid
			int newY = originalY-1;
			
			if ((newX = 0) || (newY = 0)){
				(int)(4 * Math.random()	//calculates the new direction
				}
			
			
		public Object foundHole() { //checks to see whether the hole has been detected

			if (( newX = xCoord+1) && (newY = yCoord+1))
				||((newX = xCoord+1)&&(newY= yCoord))
				||((newX = xCoord+1) &&(newY = yCoord-1))
				||((newX = xCoord) && (newY = yCoord+1))
				||((newX = xCoord-1) && (newY= yCoord+1))
				||((newX = xCoord-1) && (newY = yCoord-1))
				||((newX = xCoord-1) && (newY = yCoord))
				||((newX = xCoord) && ((newY = yCoord-1)){
				return true;
				}
			 else {
			 return false;
			 }