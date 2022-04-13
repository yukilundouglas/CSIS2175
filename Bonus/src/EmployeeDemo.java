import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		String name;
		double hours;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the employee name: ");
		name = input.nextLine();
		
		System.out.println("Please enter the hours worked: ");
		hours = input.nextDouble();		
		
		input.close();
		
		Employee employee = new Employee(name, hours);
		
		System.out.println(employee.toString());
		
	}

}
