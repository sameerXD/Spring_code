package EMPLOYEE1;

import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {
	
	private String name;
	private int age;
	private String address;
	private int no_of_days;
	
	


	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public int getNo_of_days() {
		return no_of_days;
	}




	public void setNo_of_days(int no_of_days) {
		this.no_of_days = no_of_days;
	}
	
	public int salary(int no_of_days) {
		int sal;
		int days = no_of_days;
		sal = days*1000;
		
		return sal;
	}






}
