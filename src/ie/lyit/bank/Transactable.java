package ie.lyit.bank;

public interface Transactable {
	public abstract void deposit(double amount);
	void withdraw(double amount);  // Can leave out public abstract,
	                               // Interface methods will be public abstract anyway
}
