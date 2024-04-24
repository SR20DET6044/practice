package Generics;

public class Printer<T> {

	public T value;
	
	public Printer(T value) {
		this.value = value;
	}
	
	public void out() {
		System.out.println(value);
	}
	
	
	
	
	
}
