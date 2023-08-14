package in.chin2.utils;

import org.springframework.stereotype.Component;

@Component
public class PwdUtils {
	public PwdUtils() {
		System.out.println("PwdUtils :: Constructor");
	}
	public void createPwd() {
		System.out.println("1st Create encrypted pwd");
	}
}
