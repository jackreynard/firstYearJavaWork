/**
*Author: Jack Reynard
*The Driveway class calculates how much it will cost to over the driveway depending on dimensions 
*/

public class Driveway {
	private double length;
	private double width;
	private double materialChoice;

// Constructors
public Driveway(double w, double l, double x){
	width = w;
	length = l;
	materialChoice = x; // constructor that allows the material to change
}

		//Methods
		public double materialChoice(){ // method for choosing the different materials 
			if (materialChoice == 1) return (12.5);
			else if (materialChoice == 2) return (17);
			else if (materialChoice == 3) return (20.5);
			else return 0;
		}
		public double area(){ // calculates the area of the driveway
			return (width*length);
		}
		
		public double materialCost(){ // calculates the cost that each material will be with the given area
			return (area()*materialChoice());
		}
		
		public double labourCost(){ // calculates how much the labour will be depending on the material cost
			return (materialCost()*0.25)+250;
		}
		
		public double costBeforeVAT(){ // calculates the cost before VAT is added
			return (materialCost()+labourCost());
		}
		
		public double VAT(){ // calculates how much VAT will be
			return (costBeforeVAT()*0.2);
		}
		
		public double totalCost(){ // calculates the toal cost
			return ((costBeforeVAT())+VAT());
		}
}
			
