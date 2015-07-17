package mvcdemo.model;
public class UserDetails {
	 
	private String s_username;
	private String s_password;
 
	public UserDetails(String username, String password){
		this.s_username = username;
		this.s_password = password;
	}
 
	public String getUsername() {
		return s_username;
	}
 
	public void setUsername(String username) {
		this.s_username = username;
	}
 
	public String getPassword() {
		return s_password;
	}
 
	public void setPassword(String password) {
		this.s_password = password;
	}
 
}