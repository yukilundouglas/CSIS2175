
public class EmployeeDemo {

	public static void main(String[] args) {
		
		Employee[] emps = new Employee[4];
		emps[0] = new Employee(1001, 5000.0);
		
		for(int i=0; i< emps.length; i++) {
			emps[i] = new Employee(1000+i, 5000.0);
		}
		
		for(Employee emp : emps) {
			System.out.println(emp); 
			System.out.println(emp.toString()); // emp.toString() for null object would be error
		}
		
		
		Employee[] emps2 = {new Employee(), new Employee(2000, 6000.5), new Employee(), new Employee(3000, 7000.0)};
		
		for(Employee emp : emps2) {
			System.out.println(emp); 
			System.out.println(emp.toString()); // emp.toString() for null object would be error
		}
		

	}

}
