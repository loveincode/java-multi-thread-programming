package chapter01.section02.thread_1_2_3.project_3_t4threadsafe;

public class LoginServlet {
	
	private static String usernameRef;
	private static String passwordRef;

	public static void doPost(String username, String password) {
	//synchronized public static void doPost(String username, String password) {
		try {
			usernameRef = username;
			if (username.equals("a")) {
				Thread.sleep(5000);
			}
			passwordRef = password;

			System.out.println("username=" + usernameRef + " password="
					+ passwordRef);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
