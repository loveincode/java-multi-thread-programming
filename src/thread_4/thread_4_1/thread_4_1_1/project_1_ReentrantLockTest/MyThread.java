package thread_4.thread_4_1.thread_4_1_1.project_1_ReentrantLockTest;

public class MyThread extends Thread {

	private MyService service;

	public MyThread(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.testMethod();
	}
}

