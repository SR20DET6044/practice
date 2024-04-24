package Generics;

public class Teacher extends User {

	private String subject;

	public Teacher(String name, String subject) {
		super(name);
		
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
}
