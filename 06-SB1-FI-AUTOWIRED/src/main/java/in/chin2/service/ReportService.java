package in.chin2.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.chin2.utils.DateUtils;

@Service
public class ReportService {
	
	public ReportService() {
		System.out.println("ReportService :: Constructor");
	}
	
	@Autowired
	private DateUtils du;
	
	public void generateReport() {
		LocalDate date = du.generateDate();
		System.out.println("Local Date "+date);
	}
}
