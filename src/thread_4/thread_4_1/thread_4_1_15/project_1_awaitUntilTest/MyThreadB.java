package thread_4.thread_4_1.thread_4_1_15.project_1_awaitUntilTest;

public class MyThreadB extends Thread {

	private Service service;

	public MyThreadB(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.notifyMethod();
	}

}