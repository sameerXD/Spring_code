package Assignment2Q1;

public class Employee {
	private long id;
	private String firtsName;
	private String lastName;
	private String email;
	
	public Employee(long id, String firtsName, String lastName, String email) {
		super();
		this.id = id;
		this.firtsName = firtsName;
		this.lastName = lastName;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirtsName() {
		return firtsName;
	}

	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firtsName=" + firtsName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
	

}
