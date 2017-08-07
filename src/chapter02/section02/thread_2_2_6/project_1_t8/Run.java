package chapter02.section02.thread_2_2_6.project_1_t8;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		Task task = new Task();

		MyThread1 thread1 = new MyThread1(task);
		thread1.start();

		Thread.sleep(100);

		MyThread2 thread2 = new MyThread2(task);
		thread2.start();
	}
}
