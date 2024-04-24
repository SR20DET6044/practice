package Abstract_Classes;

public abstract class Vehicle {

	private final String MAKE = "Honda";
	
	private String model;
	
	public Vehicle(String model) {
		this.model = model;
		
	}
	
	public String getMake() {
		return MAKE;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return MAKE + " "+ model;
	}
	
	
	
	
}
