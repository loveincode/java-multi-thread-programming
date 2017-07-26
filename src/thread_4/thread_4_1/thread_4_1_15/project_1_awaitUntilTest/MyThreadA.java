package thread_4.thread_4_1.thread_4_1_15.project_1_awaitUntilTest;

public class MyThreadA extends Thread {

	private Service service;

	public MyThreadA(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.waitMethod();
	}

}