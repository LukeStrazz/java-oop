package p1;

public class Instructor extends Person {

	public Instructor(String name, String id, String phone) {
		super(name, id, phone);
		
	}
	private double salary;
	private String phoneNumber;
	
	public Instructor(String name, String id, String phone, double salary, String phoneNumber) {
		super(name, id, phone);
		this.salary = salary;
		this.phoneNumber = phoneNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	public String toString() {
		return "Instructor salary=" + salary + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
}
