package chapter01.section08.thread_1_8_2.project_2_suspend_resume_LockStop;

public class MyThread extends Thread {
	private long i = 0;

	@Override
	public void run() {
		while (true) {
			i++;
			System.out.println(i);
		}
	}

}
