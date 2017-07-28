package chapter04.section01.thread_4_1_14.project_2_awaitUninterruptiblyTest_2;

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

