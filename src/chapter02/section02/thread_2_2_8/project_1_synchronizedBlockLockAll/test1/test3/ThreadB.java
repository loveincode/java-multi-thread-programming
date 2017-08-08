package chapter02.section02.thread_2_2_8.project_1_synchronizedBlockLockAll.test1.test3;

public class ThreadB extends Thread {
	private MyObject object;

	public ThreadB(MyObject object) {
		super();
		this.object = object;
	}

	@Override
	public void run() {
		super.run();
		object.speedPrintString();
	}
}
