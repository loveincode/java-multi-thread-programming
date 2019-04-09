package chapter07.section01.thread_7_1_4.project_1_stateTest4;

public class MyThread extends Thread {

	@Override
	public void run() {
		try {
			synchronized (Lock.lock) {
				Lock.lock.wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
