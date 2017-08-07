package chapter02.section02.thread_2_2_4.project_1_t7;

public class Run {

	public static void main(String[] args) {
		Task task = new Task();

		MyThread1 thread1 = new MyThread1(task);
		thread1.start();

		MyThread2 thread2 = new MyThread2(task);
		thread2.start();
	}
}
