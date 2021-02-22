package autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("auto.xml");
		
		Address address = context.getBean("address",Address.class);
		System.out.println(address);
		
		

	}

}
