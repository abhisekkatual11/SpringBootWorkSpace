package in.chin2.daos;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	public UserDao() {
		System.out.println("UserDao :: Constructor");
	}
}
