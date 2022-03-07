package p1;

public class Person {

	
	private Name name;
	private String id;
	private String phone;
	private static int idCounter;
	
	public Person(Name name, String id, String phone) {
		super();
		this.name = name;
		this.id = String.valueOf(idCounter++);
		this.phone = phone;
	}


	public Person(Person person) {
		
	}
	
	
	public Name getName() {
		return name;
	}


	public void setName(Name name) {
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "Person name=" + name + ", id=" + id + ", phone=" + phone + "";
	}



	
}
