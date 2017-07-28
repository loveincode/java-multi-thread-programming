package chapter04.section01.thread_4_1_6.project_1_MustUseMoreCondition_OK;

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
