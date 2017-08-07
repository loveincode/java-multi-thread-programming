package chapter02.section02.thread_2_2_7.project_4_t9;

public class MyThread1 extends Thread {

	private MyOneList list;

	public MyThread1(MyOneList list) {
		super();
		this.list = list;
	}

	@Override
	public void run() {
		MyService msRef = new MyService();
		msRef.addServiceMethod(list, "A");
	}

}
