package chapter01.section02.thread_1_2_1.project_1_t1;

public class Run {
	
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
		System.out.println("运行结束！");
	}

}
