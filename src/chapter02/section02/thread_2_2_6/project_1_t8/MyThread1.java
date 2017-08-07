package chapter02.section02.thread_2_2_6.project_1_t8;

public class MyThread1 extends Thread {

	private Task task;

	public MyThread1(Task task) {
		super();
		this.task = task;
	}

	@Override
	public void run() {
		super.run();
		task.doLongTimeTask();
	}

}
