package chapter06.section05.project_1_singleton_8;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(MyObject.getInstance().hashCode());
		}
	}
}
