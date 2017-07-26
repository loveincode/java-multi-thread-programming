package thread_4.thread_4_1.thread_4_1_14.project_1_awaitUninterruptiblyTest_1;

public class MyThread extends Thread {

	private Service service;

	public MyThread(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.testMethod();
	}

}
