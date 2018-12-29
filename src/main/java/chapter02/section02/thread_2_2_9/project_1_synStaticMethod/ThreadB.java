package chapter02.section02.thread_2_2_9.project_1_synStaticMethod;

public class ThreadB extends Thread {
	@Override
	public void run() {
		Service.printB();
	}
}
