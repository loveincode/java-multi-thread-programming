package thread_4.thread_4_1.thread_4_1_2.project_1_ConditionTestMoreMethod;

public class ThreadAA extends Thread {

	private MyService service;

	public ThreadAA(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.methodA();
	}
}

