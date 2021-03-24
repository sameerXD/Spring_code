package Assignment2Q1;


import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
public class EmployeeServices implements ObjectInterface<Employee> {
	private Map<Long, Employee> repository;
	
	public EmployeeServices() {
		this.repository = new HashMap<>();
		
	}
	
	@Override
	public void store(Employee emp) {
		repository.put(emp.getId(), emp);
	}
	
	@Override
	public Employee retrieve(long id) {
		return repository.get(id);
	}
	
	@Override
	public Employee delete(int id) {
		Employee e = repository.get(id);
		this.repository.remove(id);
		return e;

}
	}
