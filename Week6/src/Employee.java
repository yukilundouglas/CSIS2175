
public class Employee {

	private int empNum;
	private double empSalary;
	
	public Employee(int empNum, double empSalary) {
		this.empNum = empNum;
		this.empSalary = empSalary;
	}
	
	public Employee() {
		this(1000, 0.0);
	}

	public int getEmpNum() {
		return empNum;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	@Override //if you do not override the toString method, you will print hasdcode by default
	public String toString() {
		String str = "Employee number " + empNum + " Employee Salary " + empSalary;
		return str;
	}
	
}
