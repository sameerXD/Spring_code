package funPerformence;

import org.springframework.stereotype.Component;

@Component("func")
public class Fun {
	
	public void fun() {
	for(int i = 1; i<=10; i++) {
		System.out.println("X Logic I is "+i);
	}
	}

}
