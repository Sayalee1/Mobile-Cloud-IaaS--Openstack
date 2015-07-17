package mvcdemo.model;

public class Authentication {
	 
	public String authenticate(String username, String password) {
		if (("Tester_1".equalsIgnoreCase(username))
				&& ("password".equals(password))) {
			return "success";
		} else {
			return "failure";
		}
	}
}