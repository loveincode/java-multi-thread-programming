package chapter02.section02.thread_2_2_7.project_2_synBlockString2;

public class ThreadB extends Thread {

	private Service service;

	public ThreadB(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.b();

	}

}
