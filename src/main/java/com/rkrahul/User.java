package com.rkrahul;

public class User {
	
	private long userId;
	
	private String userName;
	
	private int salary;
	
	public User() {
		
	}

	public User(long userId, String userName, int salary) {
		this.userId = userId;
		this.userName = userName;
		this.salary = salary;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", salary=" + salary + "]";
	} 
	
}
