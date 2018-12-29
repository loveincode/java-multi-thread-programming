package chapter02.section02.thread_2_2_13.project_2_innerStaticClass;

public class PublicClass {

	static private String username;
	static private String password;

	static class PrivateClass {
		private String age;
		private String address;

		public String getAge() {
			return age;
		}

		public void setAge(String age) {
			this.age = age;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public void printPublicProperty() {
			System.out.println(username + " " + password);
		}
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
