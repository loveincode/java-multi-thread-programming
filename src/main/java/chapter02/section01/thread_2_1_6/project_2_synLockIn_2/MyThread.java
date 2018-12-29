package chapter02.section01.thread_2_1_6.project_2_synLockIn_2;

public class MyThread extends Thread {
	@Override
	public void run() {
		Sub sub = new Sub();
		sub.operateISubMethod();
	}

}
