package fullAuto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Address {
	
	private Home home ;
	
	public Address(Home home) {
		super();
		this.home = home;
	}
	@Value("secto 10")
	private String street;
	@Value("gurugram")
	private String city;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	public void advice() {
		home.display();
	}
	
  
}
