package chapter02.section02.thread_2_2_2.project_1_synchronizedOneThreadIn;

public class ThreadB extends Thread {
	private ObjectService service;

	public ThreadB(ObjectService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		super.run();
		service.serviceMethod();
	}
}
