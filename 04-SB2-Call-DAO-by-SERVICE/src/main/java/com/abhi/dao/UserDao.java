package com.abhi.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	public UserDao() {
		System.out.println("USER DAO :: CONSTRUCTOR");
	}

	public boolean saveUserDetails(String string, String string2) {
		System.out.println("storing the data in the database");
		return true;
	}

}
