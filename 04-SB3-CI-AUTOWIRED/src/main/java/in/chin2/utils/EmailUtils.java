package in.chin2.utils;

import org.springframework.stereotype.Component;

@Component
public class EmailUtils {
	
	public EmailUtils() {
		System.out.println("EmailUtils :: Constructors");
	}
	
	public void sendEmail() {
		System.out.println("Sending email after saving");
	}

}
