package in.chin2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.chin2.beans.DateBeans;
import in.chin2.beans.DateUtils;
import in.chin2.beans.EmailBeans;
import in.chin2.beans.EmailUtils;
import in.chin2.beans.HiBeans;
import in.chin2.beans.HiUtils;
import in.chin2.beans.JiiBeans;
import in.chin2.beans.JiiUtils;
import in.chin2.beans.ReportBeans;
import in.chin2.beans.ReportUtils;

@Service
public class ServiceImpl {
	@Autowired
	private DateBeans beans;
	
	@Autowired
	private DateUtils dateUtils;
	
	@Autowired
	private EmailBeans beans2;
	
	@Autowired
	private EmailUtils emailUtils;
	
	@Autowired
	private HiBeans beans3;
	
	@Autowired
	private HiUtils hiUtils;
	
	@Autowired
	private JiiBeans beans4;
	
	@Autowired
	private JiiUtils jiiUtils;
	
	@Autowired
	private ReportBeans beans5;
	
	@Autowired
	private ReportUtils reportUtils;
	
//	it perform multiple task in one class which is against the SINGLE RESPONSIBILITY PRINCIPLE
}
