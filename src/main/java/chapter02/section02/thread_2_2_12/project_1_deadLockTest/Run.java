package chapter02.section02.thread_2_2_12.project_1_deadLockTest;

public class Run {
	public static void main(String[] args) {
		try {
			DealThread t1 = new DealThread();
			t1.setFlag("a");

			Thread thread1 = new Thread(t1);
			thread1.start();

			Thread.sleep(100);

			t1.setFlag("b");
			Thread thread2 = new Thread(t1);
			thread2.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}