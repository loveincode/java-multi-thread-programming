package thread_6.thread_6_2.project_4_singleton_2_2;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println(MyObject.getInstance().hashCode());
	}

}
