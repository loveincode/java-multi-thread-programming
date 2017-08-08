package chapter02.section02.thread_2_2_11.project_1_twoStop;

public class ThreadB extends Thread {

	private Service service;

	public ThreadB(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.methodB();
	}

}
