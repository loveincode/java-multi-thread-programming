package chapter01.section02.thread_1_2_2.project_1_t2;

public class Run {
	
	public static void main(String[] args) {
		Runnable runnable=new MyRunnable();
		Thread thread=new Thread(runnable);
		thread.start();
		System.out.println("运行结束!");
	}

}
