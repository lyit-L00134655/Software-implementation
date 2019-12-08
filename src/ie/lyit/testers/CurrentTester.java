/**
 * Class: B.Sc. in Computing
 * Instructor: Maria Boyle
 * Description: Tester for the Date class
 * Date: 03/10/2019
 * @author Maria Boyle
 * @version 1.0
**/
package ie.lyit.testers;

import ie.lyit.bank.Current;
import ie.lyit.bank.Name;
import ie.lyit.bank.Date;
import java.util.ArrayList;

public class CurrentTester {
	public static void main(String[] args) {
	   // Create a Current object called homersCurrentAccount with initial values
	   Current homersCurrentAccount = new Current(new Name("Mr","Homer","Simpson"),
			                                      "Springfield, NYC",5500.00,
			                                      new Date(25, 10, 1965), 1000.00);
								
	   // display homersCurrentAccount's details on screen
	   System.out.println(homersCurrentAccount);
	   
	   try {
		   // withdraw() 900 from homersCurrentAccount
		   homersCurrentAccount.withdraw(900);
		   System.out.println(homersCurrentAccount);
		   // withdraw() 4700 from homersCurrentAccount
		   homersCurrentAccount.withdraw(4700);
		   System.out.println(homersCurrentAccount);
		   // withdraw() 1000 from homersCurrentAccount
		   homersCurrentAccount.withdraw(1000);
		   System.out.println(homersCurrentAccount);
	   }
	   catch(IllegalArgumentException iAE) {
		   System.out.println("Insufficient Funds");
	   }
	   
	   // deposit() 200 to homersCurrentAccount
	   homersCurrentAccount.deposit(200);
	   System.out.println(homersCurrentAccount);

	   // Create a Current object called lisasCurrentAccount with initial values
	   Current lisasCurrentAccount = new Current(new Name("Ms","Lisa","Simpson"),
			                                     "Springfield, NYC",120.00,
			                                     new Date(20,12,1992),50.00);

		// display lisasCurrentAccount's details on screen
		System.out.println(lisasCurrentAccount);

		// change lisasCurrentAccount's firstName to "Lisa-Marie"
		lisasCurrentAccount.getName().setFirstName("Lisa-Marie");
		// display lisasCurrentAccount's details on screen
		System.out.println(lisasCurrentAccount);

		// Create an ArrayList of Current objects called currents
	    ArrayList<Current> currents = new ArrayList<Current>();
        // Add 4 Current objects to names
		currents.add(new Current(new Name("Mrs","Marge","Simpson"),
				                 "Springfield,NYC",63000.00,
				                 new Date(18,12,1968),2000.00));
		currents.add(new Current(new Name("Mr","Bartly","Simpson"),
				                 "Springfield,NYC",-55.00,
				                 new Date(10,10,1990),100));
		currents.add(homersCurrentAccount);
		currents.add(lisasCurrentAccount);
		// trim the capacity of names to be names current size
	 	currents.trimToSize();	
		
		// print every element in currents
		System.out.println("\nArrayList contains ==>");
	    for(Current tempCurrent:currents)
 	       System.out.println(tempCurrent);

		if(currentSearch(homersCurrentAccount,currents))
	       System.out.print(homersCurrentAccount+" is in the list!");
		else
		   System.out.print(homersCurrentAccount+" is not in the list!");
	}
	public static boolean currentSearch(Current currentToFind, 
			                           ArrayList<Current> listOfCurrents){
	   return (listOfCurrents.contains(currentToFind));
    }
}



/*
// Create a Current object called lisasCurrentAccount with initial values
	Current lisasCurrentAccount = new Current("Ms", "Lisa", "Simpson", "Springfield, NYC", 120.00, 20, 12, 1992, 50.00);
*/