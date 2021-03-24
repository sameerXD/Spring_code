package Assignment2Q1;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Configurable
public class ExceptionAdvice {
	@AfterThrowing (pointcut = "this(Assignment2Q1)", throwing = "ex")
	public void ExceptionLogging(Exception ex) {
		 System.out.println("****LoggingAspect.logAfterThrowingAllMethods() " + ex);
	}
	
	@Before("execution(public !void Assignment2Q1+.*(..))")
	public void beforeMenufacture() {
		  System.out.println("    executing MyApiAnlyticsAspect");
	  }

}
