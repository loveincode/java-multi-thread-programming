package chapter07.section01.thread_7_1_2.project_1_stateTest2;

public class MyThread extends Thread {

	@Override
	public void run() {
		try {
			System.out.println("begin sleep");
			Thread.sleep(10000);
			System.out.println("  end sleep");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
