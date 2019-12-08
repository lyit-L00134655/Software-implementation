/**
 * Class: B.Sc. in Computing
 * Instructor: Maria Boyle
 * Description: Models a subclass of Account called Joint
 * Date: 3/10/2019
 * @author Maria Boyle
 * @version 1.0
**/
package ie.lyit.bank;

public class Current extends Account {
	private double overdraftAmount;

	// Default Constructor for Current objects
	public Current(){
		// super(); // Can call super() but it will do it automatically
		this.overdraftAmount = 0.0;	
	}

	// Overloaded Constructor for Current objects
	// Takes in a name, address, balance, date of opening and overdraft amount
	//
	// Called as follows:
	// Current c1 = new Current(new Name("Mr","Joe","Bloggs"),
	//                          "123 High Road",1000.00,
	//                          new Date(12,6,2012),
	//                          300.00);
	public Current(Name name,String address,double balance,
				   Date dateOpened,double overdraftAmount){
		super(name,address,balance,dateOpened);
		this.overdraftAmount=overdraftAmount;
	}

	// toString() method for displaying a Current object	
	@Override
	public String toString(){
		return (super.toString() + " " + overdraftAmount);
	}
 	
	// Don't need to override equals()
	// Account equals is sufficient

	// get() and set() methods for each Instance Variable
	public double getOverdraftAmount(){
		return overdraftAmount;
	}
	public void setOverdraftAmount(double setOverdraftAmountTo){
		overdraftAmount = setOverdraftAmountTo;
	}

	// overdrawn() method to determine if balance is less than 0
	public boolean overdrawn(){
		return (balance < 0);
	}  	

	@Override
	public void withdraw(double amount) throws IllegalArgumentException {
		if(amount <= (balance+overdraftAmount))
			balance-=amount;
		else
			// ERROR will occur --> throw exception
			// Method will stop at this point if exception thrown
			throw new IllegalArgumentException("Overdraft Amount Exceeded");
	}		
}