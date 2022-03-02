package lecture;

public enum Planet{
	MERCURY,
	VENUS, 
	EARTH("This is where we live", 3.5e+23, 3.2e+5),
	MARS("It is beautiful"), 
	JUPITER,
	SATURN,
	URANUS,
	NEPTUNE;
	
	private String description;
	private double mass;
	private double radius;
	
	Planet (String description, double mass, double radius) {
			this.description = description;
			this.mass = mass;
			this.radius = radius;
	}
	
	Planet(){
//		this.description = "";
//		this.mass = 0;
//		this.radius = 0; //these are default value, actually we don't need them unless we want some new default value
	}
	
	Planet (String description){
		this.description = description; //other parameter would be default value
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public final double G = 6.67E-11;
	public double surfaceFravity() {
		double gravity = G*mass/(radius*radius);
		return gravity;
	}
}


