package chapter02.section02.thread_2_2_7.project_1_synBlockString;

public class ThreadB extends Thread {

	private Service service;

	public ThreadB(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.setUsernamePassword("b", "bb");

	}

}
