/**
* Author: Jack Reynard
 * The StationaryThing class is the superclass and is used to get both set of coordinates and which robot 
 */
 
 public class StationaryThing {
	protected String name;
	protected int xCoord;
	protected int yCoord;
	
	
	//Constructors//
	public StationaryThing(int x, int y, String n){
		name = n;
		xCoord = x;
		yCoord = y;
	}
	
	//Methods//

	public int getXCoord(){ //returns the coordinates of the hole
		return xCoord;
	}
		
	public int getYCoord(){
		return yCoord;
	}
	
	public Object getName(){ //returns the robots name
		return name;
	}
}
		