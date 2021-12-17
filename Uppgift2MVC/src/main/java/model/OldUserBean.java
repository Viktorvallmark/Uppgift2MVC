package model;

@SuppressWarnings("unused")
public class OldUserBean {

	private String username;
	private String password;
	
	
	public OldUserBean(String username, String password) {
		this.username = username;
		this.password = password;
	}


	public String getUsername() {
		
		if(ListHandler.getUsernameList().contains(getUname())) {
			int uname = ListHandler.getUsernameList().indexOf(getUname());
			return ListHandler.getUsernameList().get(uname);
		}else {
			return "-1";
		}		
	}
	
	public void setUsername(String uname) {
		this.username = uname;
	}

	public String getPassword() {
		if(ListHandler.getPasswordList().contains(getPw())) {
			int pw = ListHandler.getPasswordList().indexOf(getPw());
			return ListHandler.getPasswordList().get(pw);
		}else {
			return "-1";
		}
	}
	
	public void setPassword(String pw) {
		this.password = pw;
	}
	
	private String getUname() {
		return username;
	}
	
	private String getPw() {
		return password;
	}
	
}
