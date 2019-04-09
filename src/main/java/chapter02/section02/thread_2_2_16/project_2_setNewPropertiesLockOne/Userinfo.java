package chapter02.section02.thread_2_2_16.project_2_setNewPropertiesLockOne;

public class Userinfo {
	private String username;
	private String password;

	public Userinfo() {
		super();
	}

	public Userinfo(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
