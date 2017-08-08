package chapter02.section03.thread_2_3_6.project_1_atomicIntergerNoSafe;

public class MyThread extends Thread {
	private MyService mySerivce;

	public MyThread(MyService mySerivce) {
		super();
		this.mySerivce = mySerivce;
	}

	@Override
	public void run() {
		mySerivce.addNum();
	}

}
