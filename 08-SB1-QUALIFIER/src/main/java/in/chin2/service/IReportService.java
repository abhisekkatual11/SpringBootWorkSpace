package in.chin2.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.chin2.report.IReport;

@Service
public class IReportService {
	
	private IReport iReport;
	
	public IReportService(@Qualifier("email")IReport iReport) {
		System.out.println("IReportService :: Constructor");
		this.iReport=iReport;
	}
	
	public void testReports() {
		iReport.generateIReport();
	}
}
