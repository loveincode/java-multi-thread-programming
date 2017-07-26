package thread_1.thread_1_7.thread_1_7_2.project_1_t12;

public class MyThread  extends Thread {
	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 500000; i++) {
			System.out.println("i=" + (i + 1));
		}
	}
}
