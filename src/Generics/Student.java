package Generics;

public class Student extends User{

	private int studentid;

	public Student(String name, int studentid) {
		super(name);
		
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	
	
}
