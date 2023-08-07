package in.chin2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import in.chin2.utils.DateUtil;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Bean
	public DateUtil getDate() {
		DateUtil d=new DateUtil();
		return d;
	}
//	Flight
//	Bike
//	AppConfig
//	UserDao
//	Flight
//	DateUtil
}
