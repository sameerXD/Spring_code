package EMPLOYEE1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAdvice {
	
	@Before("execution(public String getName())")
	public void getNameAdvice() {
		System.out.println(" this is before getName Advice");
	}
	
	@After("execution(public void setName(String))")
	public void setNameAdvice() {
		System.out.println(" this is after setName Advice");
	}
	
	@Around("execution(public int salary(int))")
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("inside around before exec");
		Object result = pjp.proceed();
		System.out.println("inside around after exec");
		return result;
	}

}
