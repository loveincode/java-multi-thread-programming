package thread_7.thread_7_5.project_1_threadCreateException;

public class MyThread extends Thread {
	@Override
	public void run() {
		String username = null;
		System.out.println(username.hashCode());
	}

}
