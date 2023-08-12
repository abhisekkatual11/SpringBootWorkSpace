package com.abhi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhi.dao.UserDao;

@Service
public class UserService {
	public UserService() {
		System.out.println("USERSERVICE :: 0-PARAM Constructor");
	}//by default SPRING IOC call the DEFALUT CONSTRUCTOR
	//using the default constructor we get NULL POINTER EXCEPTION 
	
	private UserDao userDao;
	
	@Autowired
	public UserService(UserDao dao) {
		System.out.println("USERSERVICE :: 1-PARAM Constructor");
		this.userDao=dao;
	}//To call this Constructor By Spring IOC, we have to give the Annotation @AUTOWIRED to the constructor
	
	public void register() {
		boolean isTrue= userDao.saveUserDetails("Abhi","abhisek@gmail.com");
		
		if(isTrue) {
			System.out.println("SAVED THE RECORD");
		}
	}
}
