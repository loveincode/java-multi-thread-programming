package thread_1.thread_1_5.project_1_t8;

public class MyThread1 extends Thread {
	@Override
	public void run() {
		try {
			System.out.println("run threadName="
					+ this.currentThread().getName() + " begin");
			Thread.sleep(2000);
			System.out.println("run threadName="
					+ this.currentThread().getName() + " end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}