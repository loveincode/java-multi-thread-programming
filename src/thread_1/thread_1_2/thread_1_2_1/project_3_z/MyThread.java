package thread_1.thread_1_2.thread_1_2_1.project_3_z;

public class MyThread extends Thread{
	
	private int i;

	public MyThread(int i) {
		super();
		this.i = i;
	}

	@Override
	public void run() {
		System.out.println(i);
	}
	
}
