package ie.lyit.bank;

import java.io.Serializable;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Employee extends Person implements Serializable {
	private Date startDate;
	private double salary;
	private int number;

	private static int nextNumber = 1000;

	private final double MAX_SALARY = 150000.00;

	public Employee() {
		super();
		startDate = new Date();
		salary = 0.0;
		number = nextNumber++;
	}

	public Employee(Name name, Date dob, Date startDate, double salary) {

		super(name, dob);
		this.startDate = startDate;
		this.salary = salary;

		number = nextNumber++;
	}

	@Override
	public String toString() {
		return number + " " + super.toString() + ", date started: " + startDate + ", salary: €" + salary;
	}

	@Override
	public boolean equals(Object obj) {
		Employee eObject;
		if (obj instanceof Employee)
			eObject = (Employee) obj;
		else
			return false;

		return (this.number == eObject.number);
	}

	//set methods
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public void setSalary(double salary) {
		if (salary > MAX_SALARY)
			this.salary = MAX_SALARY;
		else
			this.salary = salary;
	}

	public void setName(Name name) {
		this.name = name;
	}
	
	//get methods
	public Date getStartDate() {
		return startDate;
	}

	public double getSalary() {
		return salary;
	}

	public Name getName() {
		return super.name;
	}

	public int getNumber() {
		return number;
	}

	public double incrementSalary(double incrementAmount) {

		salary += incrementAmount;

		if (salary > MAX_SALARY)
			salary = MAX_SALARY;

		return salary;
	}
	
	public double calculateWage(double taxPercentage) {
		double wage = salary / 12;
		wage -= (wage * (taxPercentage / 100));
		return wage;
	}

	//setting the number for next employee
	public static void setNextNumber(int nextNumber) {
		Employee.nextNumber = nextNumber;
	}
}
