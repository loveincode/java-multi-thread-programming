package chapter02.section01.thread_2_1_4.project_2_synchronizedMethodLockObject2;

public class ThreadB extends Thread {

	private MyObject object;

	public ThreadB(MyObject object) {
		super();
		this.object = object;
	}

	@Override
	public void run() {
		super.run();
		object.methodB();
	}
}
