package funPerformence;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import EMPLOYEE1.JavaConfig;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(funPerformence.JavaConfig.class);
		
		Fun f = context.getBean("func",Fun.class);
		f.fun();

	}

}
