package fullAuto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class JavaConfig {
	
	public Home getHome() {
		return new Home();
	} 
	
	@Bean
	public Address getAddress() {
	   Address address = new Address(getHome());
	   return address;
	}
	
 
}
