package chapter01.section10.thread_1_10_1.project_1_t18;

public class Run {
	public static void main(String[] args) {
		System.out.println("main thread begin priority="
				+ Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(6);
		System.out.println("main thread end   priority="
				+ Thread.currentThread().getPriority());
		MyThread1 thread1 = new MyThread1();
		thread1.start();
	}
}
