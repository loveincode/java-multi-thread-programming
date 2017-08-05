package chapter01.section07.thread_1_7_6.project_1_runMethodUseStopMethod;

public class MyThread extends Thread {
	@Override
	public void run() {
		try {
			this.stop();
		} catch (ThreadDeath e) {
			System.out.println("进入了catch()方法！");
			e.printStackTrace();
		}
	}

}
