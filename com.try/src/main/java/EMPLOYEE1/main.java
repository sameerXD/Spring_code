package EMPLOYEE1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import AspectDemo.com.AppConfig;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Employee emp = context.getBean("emp",Employee.class);
		
		emp.setName("sam");
		emp.getName();
		emp.salary(3);

	}

}
