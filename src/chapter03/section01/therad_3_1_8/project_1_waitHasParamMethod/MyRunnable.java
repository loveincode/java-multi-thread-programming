package chapter03.section01.therad_3_1_8.project_1_waitHasParamMethod;

public class MyRunnable {
	static private Object lock = new Object();
	static private Runnable runnable1 = new Runnable() {
		@Override
		public void run() {
			try {
				synchronized (lock) {
					System.out.println("wait begin timer="
							+ System.currentTimeMillis());
					lock.wait(5000);
					System.out.println("wait   end timer="
							+ System.currentTimeMillis());
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};

	static private Runnable runnable2 = new Runnable() {
		@Override
		public void run() {
			synchronized (lock) {
				System.out.println("notify begin timer="
						+ System.currentTimeMillis());
				lock.notify();
				System.out.println("notify   end timer="
						+ System.currentTimeMillis());
			}
		}
	};

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(runnable1);
		t1.start();
		Thread.sleep(3000);
		Thread t2 = new Thread(runnable2);
		t2.start();
	}

}
