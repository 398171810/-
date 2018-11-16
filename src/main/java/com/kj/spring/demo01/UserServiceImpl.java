package com.kj.spring.demo01;

public class UserServiceImpl implements UserService {
	private String userName;
	@Override
	public void sayHello() {
	System.out.println("hello spring" + userName);	

	}
	public String getUserName() { return userName;}
	public void setUserName(String userName) { this.userName = userName;}
	   
}
