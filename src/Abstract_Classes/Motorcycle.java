package Abstract_Classes;

public class Motorcycle extends Vehicle{

	private int cc;

	public Motorcycle(String model, int cc) {
		super(model);
		this.cc = cc;	
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	

	
}
