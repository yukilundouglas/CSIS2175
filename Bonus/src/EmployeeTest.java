import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testGetTotalPay() {
		
		//test case with working hours < 40
		Employee employee = new Employee("Yuki", 35.5);
		assertEquals(532.5, employee.getTotalPay());
		
		//test case with working hours > 40
		employee.setHours(43.5);
		assertEquals(657.75, employee.getTotalPay());
	}

}
