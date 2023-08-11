package in.chin2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.chin2.dao.UserDao;

@Service
public class UserService {
	
	private UserDao userDao;
	
	@Autowired
	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}



	public void register() {
		boolean user1 = userDao.saveUser("abhi@gmail.com", "8327753076", "Abhisek");
		
		if(user1) {
			System.out.println("Record succesfully saved...!!!");
		}else {
			System.out.println("Record not succesfully saved...!!!");
		}
		
	}
}
