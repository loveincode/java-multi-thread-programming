package thread_4.thread_4_1.thread_4_1_4.project_1_UseConditionWaitNotifyOK;

public class ThreadA extends Thread {

	private MyService service;

	public ThreadA(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.await();
	}
}

