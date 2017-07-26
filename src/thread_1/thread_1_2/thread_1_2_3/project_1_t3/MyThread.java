package thread_1.thread_1_2.thread_1_2_3.project_1_t3;

public class MyThread extends Thread {

	private int count = 5;

	public MyThread(String name) {
		super();
		this.setName(name);
	}

	@Override
	public void run() {
		super.run();
		while (count > 0) {
			count--;
			System.out.println("由 " + this.currentThread().getName()
					+ " 计算，count=" + count);
		}
	}
}
