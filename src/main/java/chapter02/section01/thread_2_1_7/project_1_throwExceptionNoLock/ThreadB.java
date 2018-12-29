package chapter02.section01.thread_2_1_7.project_1_throwExceptionNoLock	;

public class ThreadB extends Thread {
	private Service service;

	public ThreadB(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.testMethod();
	}

}
