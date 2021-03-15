package AspectDemo.com;

import org.springframework.stereotype.Component;

@Component("comp")
public class Company {
	public void menufacture() {
		System.out.println(" manufacturing");
	}

}
