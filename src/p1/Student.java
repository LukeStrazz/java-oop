package p1;

public class Student extends Person {

	private double gpa;
	private String major;
	
	

	public Student(String name, String id, String phone) {
		super(name, id, phone);

	}

	
	

	public double getGpa() {
		return gpa;
	}


	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}


	@Override
	public String toString() {
		return "Student gpa=" + gpa + ", major=" + major + "";
	}
	
	
	
	
}
