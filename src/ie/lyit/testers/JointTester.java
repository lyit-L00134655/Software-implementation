/**
 * Class: B.Sc. in Computing
 * Instructor: Maria Boyle
 * Description: Tester for the Date class
 * Date: 26/09/2019
 * @author Maria Boyle
 * @version 1.0
**/
package ie.lyit.testers;

import ie.lyit.bank.Joint;
import ie.lyit.bank.Name;
import ie.lyit.bank.Date;

public class JointTester {
   public static void main(String[] args) {
	  // Create a Joint object called homerAndMargesJointAccount
	  Joint homerAndMargesJointAccount=new Joint(new Name("Mr","Homer","Simpson"),
	    		                                 "Springfield, NYC",
	    		                                 5500.00,
	    		                                 new Date(25, 10, 1965),
	    		                                 new Name("Mrs","Marge","Simpson"),
	    		                                 "Springfield, NYC");
									
	  // display homerAndMargesJointAccount's details on screen
	  System.out.println(homerAndMargesJointAccount);

	  // Create a Joint object called lisaAndBartssJointAccount with initial values
	  Joint lisaAndBartsJointAccount = new Joint(new Name("Ms","Lisa","Simpson"),
			                                      "Springfield, NYC",
			                                      120.00,
			                                      new Date(20, 12, 1992),
			                                      new Name("Mr", "Bart", "Simpson"),
			                                      "SpringField, NYC");
								
	   // display lisaAndBartsJointAccount's details on screen
	   System.out.println(lisaAndBartsJointAccount);
								
		// change lisaAndBartssJointAccount's firstName to "Lisa-Marie"
		lisaAndBartsJointAccount.getName().setFirstName("Lisa-Marie");
						
		// display lisaAndBartssJointAccount's details on screen
		System.out.println(lisaAndBartsJointAccount);

		// check if homerAndMargesJointAccount is the same as lisaAndBartssJointAccount
		if(homerAndMargesJointAccount.equals(lisaAndBartsJointAccount))
		   System.out.println(homerAndMargesJointAccount + " is the same account as " + lisaAndBartsJointAccount);
		else
		   System.out.println(homerAndMargesJointAccount + " is not the same account as " + lisaAndBartsJointAccount);
						
		// check if homerAndMargesJointAccount is female
		if(homerAndMargesJointAccount.getName().isFemale() || homerAndMargesJointAccount.getNameB().isFemale())
		   System.out.println(homerAndMargesJointAccount + " has a female account holder.");			
		else
		   System.out.println(homerAndMargesJointAccount + " has no female account holder.");	
	}
}
