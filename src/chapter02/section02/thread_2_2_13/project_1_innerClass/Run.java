package chapter02.section02.thread_2_2_13.project_1_innerClass;

import chapter02.section02.thread_2_2_13.project_1_innerClass.PublicClass.PrivateClass;

public class Run {

	public static void main(String[] args) {

		PublicClass publicClass = new PublicClass();
		publicClass.setUsername("usernameValue");
		publicClass.setPassword("passwordValue");

		System.out.println(publicClass.getUsername() + " "
				+ publicClass.getPassword());

		PrivateClass privateClass = publicClass.new PrivateClass();
		privateClass.setAge("ageValue");
		privateClass.setAddress("addressValue");

		System.out.println(privateClass.getAge() + " "
				+ privateClass.getAddress());

	}

}
