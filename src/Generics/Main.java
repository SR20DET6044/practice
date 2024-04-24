package Generics;

public class Main {

	public static void main(String[] args) {
		
		Printer<Integer> p1 = new Printer<>(10);
		p1.out();
		Printer<String> p2 = new Printer<>("Hello World");
		p2.out();
		
		
		
	}

}
