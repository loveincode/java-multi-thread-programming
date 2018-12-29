package chapter01.section07.thread_1_7_7.project_1_stopThrowLock;

public class MyThread extends Thread {

	private SynchronizedObject object;

	public MyThread(SynchronizedObject object) {
		super();
		this.object = object;
	}

	@Override
	public void run() {
		object.printString("b", "bb");
	}

}
