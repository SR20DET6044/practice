package lambdas;

public class Car implements EngineRunner{
	
	private String make;
	private String model;
	
	
	
	@Override
	public void startEngine() {
		System.out.println("Car starting engine");
		
	}
	
	

}
