/**
 * Class: B.Sc. in Computing
 * Instructor: Maria Boyle
 * Description: Models an abstract superclass Account
 *              Abstract because it will be used for inheritance only
 * Date: 26/09/2019
 * @author Maria Boyle
 * @version 1.0
**/
package ie.lyit.bank;

// Account CAN-DO whatever is in Transactable
public abstract class Account implements Transactable{
	protected Name name; 	//COMPOSITION-Account HAS-A name
	protected String address;	
	protected double balance;
	protected Date dateOpened;//COMPOSITION-Account HAS-A dateOpened
	protected int accountNo;

	private static int nextUniqueNumber=1000;// Next available unique 
											 // Account number      

	// Default Constructor-set Instance Variables to null
	public Account(){
		this.name=new Name();
		this.address="";
		this.balance=0.0;
		this.dateOpened=new Date();
		this.accountNo=nextUniqueNumber++;
	}

	// Overloaded Constructor-set Instance Variables to initial values passed in
	public Account(Name name, String address, double balance, Date dateOpened){
		this.name=name;	
		this.address=address;
		this.balance=balance;
		this.dateOpened=dateOpened;
		this.accountNo=nextUniqueNumber++;
	}
   
	// toString() method for displaying an Account object
	// Display Account object as 
	// "ACCOUNT 100001==>Mr Joe Bloggs 		€100.00" 
	@Override
	public String toString(){
		return("ACCOUNT " + accountNo + "==>" + name + " \t€" + balance);
	}
   
	// equals() method for comparison of two Account objects
	@Override
	public boolean equals(Object obj){
		Account aObject;
		if (obj instanceof Account)
			aObject = (Account)obj;
		else
			return false;
		 
		return this.accountNo==(aObject.accountNo);
	}

	// get() methods for each Instance Variable	
	public Name getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public double getBalance(){
		return balance;
	}
	public Date getDateOpened(){
		return dateOpened;
	}
	public int getNumber(){
		return accountNo;
	}

	// set() methods for each Instance Variable	
	public void setName(Name name){
		this.name=name;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public void setDateOpened(Date dateOpened){
		this.dateOpened = dateOpened;
	}
	// You should not provide a setNumber() method because
	// accountNo is unique so you should not be able to set it

	// override methods in Transactable interface
	@Override
	public void deposit(double amount) {
		balance+=amount;
	}
	@Override
	public void withdraw(double amount)throws IllegalArgumentException {
		if(amount <= balance)
			balance-=amount;
		else
			// ERROR will occur --> throw exception
			// Method will stop at this point if exception thrown
			throw new IllegalArgumentException("Amount exceeds balance…");
	}
}