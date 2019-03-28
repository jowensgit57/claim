package Week2;

import java.util.Scanner;

public class ChangeMaker_Assign1 {

	public static void main(String[] args) {
		/*
		 * Claim Academy
		 * Name:  John Owens, Jr.  
		 Change Calculator 
		A retail store is building a kiosk to enter sales and handle transactions. When 
		people use cash to pay for an item, the kiosk needs to tell the cashier how much 
		change should be given back to the customer. 
		You are developing a simple calculator
		 that will compute the right amount and most effi
		cient denominations of change for a specific purchase. 

		RESULT:    Quarters: 3 
		  Dimes: 0 
		  Nickels: 1 
		  Pennies: 2
*/
		// Prompts the user to enter the amount of the Purchase
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the purchase amount of the item:  $");
		//  Declaring and define the cash paid and purchase price
		double purchase = input.nextDouble();
	//	double cash = 18;
	//	double purchase = 17.18;
		System.out.println("Enter the cash payment for the purchase:  $");
        double cash = input.nextDouble();
		//  call function returnChange/
	    double [] customerchange = returnChange(purchase, cash);	   
	    returnChange(purchase, cash);
		//  print the output of the returned customer change in quarters, dimes
	    // nickels and pennies from the function
	    System.out.println("RESULT:    Quarters:  " + (int)customerchange[0]);
	    System.out.println("              Dimes:  " + (int)customerchange[1]);
	    System.out.println("            Nickels:  " + (int)customerchange[2]);
	    System.out.println("            Pennies:  " + (int)customerchange[3]);	 
        input.close();
	}


	// Define the function
	 public static double[] returnChange(double purchase, double cash)  {
        // calculate the change

		 double customerchange[] = new double[4];

		
		 double change = cash - purchase;
		 change = change * 100;
//  Store the change denominations in a matrix
		 customerchange[0] = change/25;		 
		 change = (change - 25*(int)customerchange[0]);
		 customerchange[1] = change/10;
		 change = (change - 10*(int)customerchange[1]);	 
		 customerchange[2] = change/5;
		 change = (change - 5*(int)customerchange[2]);	  
		 customerchange[3] = change/1;		 
//	    double customerChange(quaters, dimes, nickels, pennies);

		return customerchange;
		
	}

}
