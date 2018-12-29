package chapter01.section10.thread_1_10_2.project_1_t19;

public class Run {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			MyThread1 thread1 = new MyThread1();
			thread1.setPriority(1);
			thread1.start();

			MyThread2 thread2 = new MyThread2();
			thread2.setPriority(1);
			//thread2.setPriority(10);
			thread2.start();
		}
	}
}
