package AspectDemo.com;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyApiAnlyticsAspect {
	@Before("execution(public void menufacture())")
	public void beforeMenufacture() {
		  System.out.println("    executing MyApiAnlyticsAspect");
	  }

}
