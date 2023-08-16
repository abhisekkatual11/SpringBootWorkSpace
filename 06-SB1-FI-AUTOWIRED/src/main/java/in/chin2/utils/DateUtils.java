package in.chin2.utils;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class DateUtils {
	
	public DateUtils() {
		System.out.println("DateUtils :: Constructor");
	}
	
	public LocalDate generateDate() {
		LocalDate date = LocalDate.now();
		System.out.println("Calculating Local time");
		return date;
	}
}
