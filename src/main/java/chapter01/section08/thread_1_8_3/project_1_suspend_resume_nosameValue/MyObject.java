package chapter01.section08.thread_1_8_3.project_1_suspend_resume_nosameValue;

public class MyObject {
	private String username = "1";
	private String password = "11";

	public void setValue(String u, String p) {
		this.username = u;
		if (Thread.currentThread().getName().equals("a")) {
			System.out.println("停止a线程！");
			Thread.currentThread().suspend();
		}
		this.password = p;
	}

	public void printUsernamePassword() {
		System.out.println(username + " " + password);
	}
}
