package in.chin2.utils;

import org.springframework.stereotype.Component;

import in.chin2.report.IReport;

@Component("date")
public class DateUtils implements IReport{
	
	public DateUtils() {
		System.out.println("DateUtils :: Constructor");
	}

	@Override
	public void generateIReport() {
		System.out.println("Reported date");
	}
	
}
