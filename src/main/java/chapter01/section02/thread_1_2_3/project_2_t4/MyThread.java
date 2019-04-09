package chapter01.section02.thread_1_2_3.project_2_t4;

public class MyThread extends Thread {

	private int count=5;
	
	@Override
	public void run() {
	//synchronized public void run() {
		super.run();
			count--;
			System.out.println("由 "+this.currentThread().getName()+" 计算，count="+count);
	}
}
