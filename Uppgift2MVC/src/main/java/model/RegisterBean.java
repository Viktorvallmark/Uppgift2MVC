package model;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class RegisterBean {
	

	private int age;
	private String city;
	private String password;
	private String username;


	public RegisterBean(String city, int age, String password, String username) {
		this.city = city;
		this.age = age;
		this.password = password;
		this.username = username;
	}
	
	public RegisterBean() {
		
	}
	

	public String getUsername() {
		return ListHandler.getUsername(username);
	}

	
	public void setUsername(String username) {
		this.username = username;
		ListHandler.getUsernameList().add(username);
	}																							//TODO: Testa att flytta listorna i ListHandler till RegisterBean och använd bara 1 Bean.
	
	public String getPassword() {
		return ListHandler.getPassword(password);
	}

	public void setPassword(String password) {
		this.password = password;
		ListHandler.getPasswordList().add(password);
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}


