
public enum Planet {
	MERCURY,
	VENUS,
	EARTH("This is where we live", 3.5e+23, 3.1e+5),
	MARS("It is beautiful"),
	JUPITER,
	SATURN,
	URANUS,
	NEPTUNE;
	
	private String desc;
	private double mass;
	private double radius;
	Planet(String desc, double mass, double radius){
		this.desc=desc;
		this.mass = mass;
		this.radius = radius;
	}
	
	Planet(){
		this.desc="";
		this.mass = 0;
		this.radius = 0;
	}
	Planet(String desc){
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
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
	
	public double surfaceGravity() {
		double gravity = G*mass/(radius*radius);
		return gravity;
	}
}
