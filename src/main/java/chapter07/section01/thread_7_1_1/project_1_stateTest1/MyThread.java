package chapter07.section01.thread_7_1_1.project_1_stateTest1;

public class MyThread extends Thread {

	public MyThread() {
		System.out.println("构造方法中的状态：" + Thread.currentThread().getState());
	}

	@Override
	public void run() {
		System.out.println("run方法中的状态：" + Thread.currentThread().getState());
	}
}
