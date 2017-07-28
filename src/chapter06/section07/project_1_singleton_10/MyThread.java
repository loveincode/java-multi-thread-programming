package chapter06.section07.project_1_singleton_10;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(MyObject.getConnection().hashCode());
		}
	}
}
