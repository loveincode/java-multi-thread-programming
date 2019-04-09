package chapter02.section01.thread_2_1_6.project_1_synLockIn_1;

public class MyThread extends Thread {
	@Override
	public void run() {
		Service service = new Service();
		service.service1();
	}

}
