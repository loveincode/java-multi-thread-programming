package thread_4.thread_4_2.thread_4_2_2.project_1_ReadWriteLockBegin2;

public class ThreadA extends Thread {

	private Service service;

	public ThreadA(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.write();
	}

}
