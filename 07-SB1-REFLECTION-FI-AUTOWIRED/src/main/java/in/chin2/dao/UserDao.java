package in.chin2.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	public UserDao() {
		System.out.println("UserDao :: Constructor");
	}
	
	public void sendHi() {
		System.out.println("Hello");
	}
}
