package chapter01.section07.thread_1_7_7.project_1_stopThrowLock;

public class Run {
	public static void main(String[] args) {
		try {
			SynchronizedObject object = new SynchronizedObject();
			MyThread thread = new MyThread(object);
			thread.start();
			Thread.sleep(500);
			thread.stop();
			System.out.println(object.getUsername() + " "
					+ object.getPassword());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
