package chapter04.section01.thread_4_1_5.project_1_MustUseMoreCondition_Error;

public class ThreadB extends Thread {

	private MyService service;

	public ThreadB(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.awaitB();
	}
}

