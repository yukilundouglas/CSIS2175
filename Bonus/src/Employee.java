
public class Employee {
	private String name;
	private double hours;
	private double totalPay;
	private double MAX_BASIC_WORK_HOUR = 40;
	private final double FIXED_HOURLY_RATE = 15.0;
	private final double OVERTIME_HOURLY_RATE = 16.5;
	
	public Employee(String name, double hours) {
		this.name = name;
		setHours(hours);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		
		if(hours < 0) {
			this.hours = 0;
		}
		else {
			this.hours = hours;
		}
		
		setTotalPay();
		
	}

	public double getTotalPay() {
		return totalPay;
	}

	public void setTotalPay() {	
		if(hours <= MAX_BASIC_WORK_HOUR) {
			totalPay = hours * FIXED_HOURLY_RATE;
		}
		else {
			totalPay = MAX_BASIC_WORK_HOUR * FIXED_HOURLY_RATE + (hours - MAX_BASIC_WORK_HOUR) * OVERTIME_HOURLY_RATE;
		}
	}
	
	@Override
	public String toString() {
		return "\nEmployee Name: " + name 
				+ "\nHours: " + String.format("%.2f", hours)
				+ "\nTotal Pay: $" + String.format("%.2f", totalPay);
	}
	
}
