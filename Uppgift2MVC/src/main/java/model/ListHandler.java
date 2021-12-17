package model;

import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("unused")
public class ListHandler {

	private static List<String> usernameList = new ArrayList<>();
	private static List<String> passwordList = new ArrayList<>();
	
	public ListHandler() {
	}
	
	
	public static String getUsername(String username) {
		for (String user : usernameList) {
			if(user.equals(username)) {
				return username;
			}else {
				return "No matching username";
				}
		}return "-1";
		
	}
	
	
	public static String getPassword(String pw) {
		if(passwordList.contains(pw)) {
			String p = passwordList.get(passwordList.indexOf(pw));
			return p;
		}else {
			return "-1";
		}
	}
	
	public static List<String> getUsernameList(){
		return usernameList;
	}
	
	public static List<String> getPasswordList(){
		return passwordList;
	}
	
	public static void addUsername(String username) {
		usernameList.add(username);
	}
	
	public static void addPassword(String password) {
		passwordList.add(password);
		
	}
}
