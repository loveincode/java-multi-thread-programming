package chapter03.section01.therad_3_1_3.project_2_test2;

public class MyThread2 extends Thread {
	private Object lock;

	public MyThread2(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		synchronized (lock) {
			System.out.println("开始notify time=" + System.currentTimeMillis());
			lock.notify();
			System.out.println("结束notify time=" + System.currentTimeMillis());
		}
	}
}
