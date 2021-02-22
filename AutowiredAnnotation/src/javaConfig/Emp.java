package javaConfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	
	private Address address;
	
	@Autowired
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("INSIDE CONSTRUCTOR");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	

}
