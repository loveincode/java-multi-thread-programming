package chapter01.section10.thread_1_10_1.project_1_t18;

public class MyThread2 extends Thread {
	@Override
	public void run() {
		System.out.println("MyThread2 run priority=" + this.getPriority());
	}

}
