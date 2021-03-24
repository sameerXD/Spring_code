package Assignment2Q1;

import java.security.KeyException;
import java.security.KeyStoreException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("Assignment2Q1");
		context.refresh();

		EmployeeServices repository = context.getBean(EmployeeServices.class);
		
		repository.store(new Employee(1, "Pankaj", "rao","pankaj@gmail.com"));
		repository.store(new Employee(2, "sameer", "xD","sameer@gmail.com"));
		repository.store(new Employee(3, "morty", "rickandmorty","rickandmorty@gmail.com"));
		
		Employee emp = repository.retrieve(1);
		System.out.println(emp);
		
		Employee emp1 = repository.retrieve(2);
		System.out.println(emp1);
		
		Employee emp2 = repository.retrieve(3);
		System.out.println(emp2);
		
		//not found
		Employee emp3 = repository.retrieve(4);
		System.out.println(emp3);
		
		
		Employee editor = repository.delete(2);
		System.out.println(editor);

	}

}
