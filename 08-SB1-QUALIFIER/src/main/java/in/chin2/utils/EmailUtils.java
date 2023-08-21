package in.chin2.utils;

import org.springframework.stereotype.Component;

import in.chin2.report.IReport;

@Component("email")
public class EmailUtils implements IReport {
	
	public EmailUtils() {
		System.out.println("EmailUtils :: Constructor");
	}

	@Override
	public void generateIReport() {
		System.out.println("Email Reporting");
	}

}
