package lambdas;

public class Main {


		  public static void main(String[] args) {
		    
			  
			  //Car honda = new Car();
			  //engineStarter(honda);
			  
			  engineStarter( () -> System.out.println("car starting engine"));
		    
			  //honda.startEngine();
			  
			  
		  }
		  
		  public static void engineStarter(EngineRunner vehicle) {
			  
			  vehicle.startEngine();
			  
		  }
		

	
	

		
}

