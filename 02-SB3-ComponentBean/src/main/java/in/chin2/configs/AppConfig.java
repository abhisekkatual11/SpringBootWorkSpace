package in.chin2.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.chin2.Flight;

@Configuration
public class AppConfig {
	public AppConfig() {
		System.out.println("Appconfig :: Constructor");
	}
	
	@Bean
	public Flight getFlight() {
		Flight f=new Flight();
		return f;
	}
}
