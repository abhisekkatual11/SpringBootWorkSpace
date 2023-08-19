package in.chin2.service;

import org.springframework.stereotype.Service;

import in.chin2.dao.UserDao;

@Service
public class UserService {
	
	public UserService() {
		System.out.println("UserService :: Constructor");
	}
	
	private UserDao userDao;
	
	public void generateOtp() {
		userDao.sendHi();
		System.out.println("Generate Otp");
	}
}
