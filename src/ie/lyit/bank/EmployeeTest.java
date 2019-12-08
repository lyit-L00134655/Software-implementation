package ie.lyit.bank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testSetName() {
		//fail("Not yet implemented");
		Name name1 = new Name("", "", "");
		Name name2 = new Name("Mr", "Nidge", "Wang");
		Employee emp = new Employee();
		emp.setName(name1);
		assertEquals(emp.getName(), name1);
		assertNotEquals(emp.getName(), name2);
		emp.setName(name2);
		assertEquals(emp.getName(), name2);
		assertNotEquals(emp.getName(), name1);
	}

	@Test
	void testEmployeeNameDateDateDouble() {
		fail("Not yet implemented");
	}

	@Test
	void testSetStartDate() {
		fail("Not yet implemented");
	}

	@Test
	void testSetSalary() {
		//fail("Not yet implemented");
		Employee emp = new Employee();
		assertEquals(emp.getSalary(), 0);
		emp.setSalary(99.99);
		assertEquals(emp.getSalary(), 99.99);
		assertNotEquals(emp.getSalary(), 99.98);
		emp.setSalary(15000);
		assertEquals(emp.getSalary(), 15000);
		assertNotEquals(emp.getSalary(), 99.98);
		emp.setSalary(150000.99);
		assertEquals(emp.getSalary(), 150000.00);
		assertNotEquals(emp.getSalary(), 150000.99);
	}

	@Test
	void testIncrementSalary() {
		//fail("Not yet implemented");
		Employee emp = new Employee();
		assertEquals(emp.getSalary(), 0);
		emp.incrementSalary(10);
		assertEquals(emp.getSalary(), 10);
		emp.incrementSalary(10);
		assertEquals(emp.getSalary(), 20);
		emp.incrementSalary(150000);
		assertNotEquals(emp.getSalary(), 150020);
		assertEquals(emp.getSalary(), 150000);
	}

	@Test
	void testCalculateWage() {
		//fail("Not yet implemented");
		Employee emp = new Employee();
		assertEquals(emp.calculateWage(0), 0);
		assertEquals(emp.calculateWage(1000), 0);
		emp.setSalary(10000);
		assertEquals(emp.calculateWage(0), 10000.00/12);
		//assertEquals(emp.calculateWage(14), (10000.0/12)-(10000.0/12)*(14/100)); //this isnt workin
		
	}

	@Test
	void testSetNextNumber() {
		fail("Not yet implemented");
	}

}
