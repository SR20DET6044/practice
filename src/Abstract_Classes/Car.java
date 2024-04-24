package Abstract_Classes;

public class Car extends Vehicle{

	private int hp;

	public Car(String model, int hp) {
		super(model);
		this.hp = hp;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	

	
	
}
