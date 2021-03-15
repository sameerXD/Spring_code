package AspectDemo.com;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyLoggingDemoAspect {
	@Before("execution(public void menufacture())")
	public void beforeMenufacture() {
		  System.out.println("    executing MyLoggingDemoAspect");
	  }

}
