package IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("web.xml");
		
		ICoach theCoach = (ICoach)context.getBean("myCoach");
		System.out.println(theCoach.getDailyWorkout());
		
		ICoach cricketCoach = (ICoach)context.getBean("cricketCoach");
		System.out.println(cricketCoach.getDailyWorkout());
        
	}

}
