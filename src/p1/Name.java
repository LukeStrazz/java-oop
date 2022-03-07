package p1;

public class Name extends Person {
	
	private String name;
	
	public Name(String name, String id, String phone) {
		super(name, id, phone);
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String toString() {
		return "Name =" + name + "";
	}

	

	

	

}
