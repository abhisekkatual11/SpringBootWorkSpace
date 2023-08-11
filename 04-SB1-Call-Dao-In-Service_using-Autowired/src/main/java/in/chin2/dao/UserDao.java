package in.chin2.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	public boolean saveUser(String email, String phone, String name) {
		System.out.println("Strong the data in database...!!!!");
		return true;
	}
}
