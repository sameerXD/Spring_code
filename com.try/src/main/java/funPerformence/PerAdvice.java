package funPerformence;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerAdvice {
	long start;
	@Pointcut("execution(* funPerformence.Fun.*(..))")
	public void performence() {
		
	}
	
	@Before("performence()")
	public void beforeAdvice() {
		System.out.println("this is before advice");
		 start = System.nanoTime();
	}
	
	@After("performence()")
	public void afterAdvice() {
		System.out.println("this is after advice");
		long end = System.nanoTime();
		
		long t = end- start;
		System.out.println("time taken " + t);
	}

}
