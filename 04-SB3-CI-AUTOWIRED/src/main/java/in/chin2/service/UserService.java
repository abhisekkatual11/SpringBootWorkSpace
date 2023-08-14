package in.chin2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.chin2.dao.UserDao;
import in.chin2.utils.EmailUtils;
import in.chin2.utils.PwdUtils;

@Service
public class UserService {
	
	private PwdUtils pwUtils;
	private UserDao userDao;
	private EmailUtils emailUtils;
	
	@Autowired
	public UserService(PwdUtils pwUtils, UserDao userDao, EmailUtils emailUtils) {
		this.pwUtils = pwUtils;
		this.userDao = userDao;
		this.emailUtils = emailUtils;
	}
	
	public void registered() {
		pwUtils.createPwd();
		userDao.saveInfo();
		emailUtils.sendEmail();
		System.out.println("Register Successfully");
	}
}
