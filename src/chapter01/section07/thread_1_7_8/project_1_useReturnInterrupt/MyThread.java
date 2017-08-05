package chapter01.section07.thread_1_7_8.project_1_useReturnInterrupt;

public class MyThread extends Thread {

	@Override
	public void run() {
			while (true) {
				if (this.isInterrupted()) {
					System.out.println("停止了!");
					return;
				}
				System.out.println("timer=" + System.currentTimeMillis());
			}
	}

}
