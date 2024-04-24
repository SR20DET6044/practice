package Generics;

public class Login<T extends User> {

	private T value;

	public Login(T value) {
		this.value = value;
	}
	
	public void login(){
		
		System.out.println(value + " logged in");
	}
	
	
}
