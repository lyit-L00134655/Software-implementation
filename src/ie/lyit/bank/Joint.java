/**
 * Class: B.Sc. in Computing
 * Instructor: Maria Boyle
 * Description: Models a subclass of Account called Joint
 * Date: 26/09/2019
 * @author Maria Boyle
 * @version 1.0
**/
package ie.lyit.bank;

public class Joint extends Account {
	private Name nameB;// COMPOSITION-nameB is an object of class Name
	private String addressB;
   
	// Default Constructor for Joint objects
	// - Java will automatically call Account() constructor
	public Joint(){
		// super(); // Can call super() but it will do it automatically
		this.nameB=new Name();
		this.addressB="";
	}

	// Overloaded Constructor for Joint objects
	// Takes in a name, address, balance, date of opening, overdraft amount
	//          and a nameB and addressB for Joint Account objects
	// Called as follows:
	// Joint j1 = new Joint(new Name("Mr","Joe","Bloggs"),
	//                      "123 High Road",1000.00,
	//                      new Date(12,6,2012),
	//                      new Name("Mrs","Ann","Bloggs"),
	//                      "123 High Road");
	public Joint(Name name,String address,double balance, 
				 Date dateOpened,Name nameB, String addressB){
		super(name,address,balance,dateOpened);		
		this.nameB=nameB;
		this.addressB=addressB;
	}	

	// toString() method for displaying a Joint object
	// Display Joint object as 
	//         "ACCOUNT==>100001:Mr Joe Bloggs/Mrs Ann Bloggs	€100.00" 
	@Override
	public String toString(){
		return("ACCOUNT==>"+ accountNo + ":" + name + "/" + nameB + "  €" + balance);	
	}
   
	// Don't need to override equals()
	// Account equals is sufficient

	// get() and set() methods for each Instance Variable
	public Name getNameB(){
		return nameB;
	}
	public String getAddressB(){
		return addressB;
	}

	public void setNameB(Name nameB){
		this.nameB = nameB;
	}
	public void setAddressB(String addressB){
		this.addressB = addressB;
	}
}