package chapter03.section02.therad_3_2_6.project_1_joinMoreTest;

public class ThreadA extends Thread {
	private ThreadB b;

	public ThreadA(ThreadB b) {
		super();
		this.b = b;
	}

	@Override
	public void run() {
		try {
			synchronized (b) {
				System.out.println("begin A ThreadName="
						+ Thread.currentThread().getName() + "  "
						+ System.currentTimeMillis());
				Thread.sleep(5000);
				System.out.println("  end A ThreadName="
						+ Thread.currentThread().getName() + "  "
						+ System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
