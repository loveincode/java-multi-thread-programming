package chapter02.section01.thread_2_1_4.project_1_synchronizedMethodLockObject;
public class ThreadA extends Thread {

	private MyObject object;

	public ThreadA(MyObject object) {
		super();
		this.object = object;
	}

	@Override
	public void run() {
		super.run();
		object.methodA();
	}

}
