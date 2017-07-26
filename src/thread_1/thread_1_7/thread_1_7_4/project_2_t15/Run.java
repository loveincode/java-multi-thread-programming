package thread_1.thread_1_7.thread_1_7_4.project_2_t15;

public class Run {
	
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
		thread.interrupt();
		System.out.println("end!");
	}

}
