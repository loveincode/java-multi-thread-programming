package chapter03.section02.therad_3_2_3.project_1_joinException;

public class ThreadA extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			String newString = new String();
			Math.random();
		}
	}
}
