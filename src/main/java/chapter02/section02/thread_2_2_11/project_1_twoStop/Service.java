package chapter02.section02.thread_2_2_11.project_1_twoStop;

public class Service {
	public void methodA() {
		Object object1 = new Object();
		synchronized (object1) {
			System.out.println("methodA begin");
			boolean isContinueRun = true;
			while (isContinueRun) {
			}
			System.out.println("methodA end");
		}
	}

	public void methodB() {
		Object object2 = new Object();
		synchronized (object2) {
			System.out.println("methodB begin");
			System.out.println("methodB end");
		}
	}
}
