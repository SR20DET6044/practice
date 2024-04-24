package Generics;

public class Main2 {

	public static void main(String[] args) {
		
		Student bob = new Student("bob", 1234);
			
		Login<Student> l1 = new Login<>(bob);
		l1.login();
		
		
		
	}

}
