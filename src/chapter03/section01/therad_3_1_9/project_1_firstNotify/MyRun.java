package chapter03.section01.therad_3_1_9.project_1_firstNotify;

public class MyRun {

	private String lock = new String("");
	private boolean isFirstRunB = false;

	private Runnable runnableA = new Runnable() {
		@Override
		public void run() {
			try {
				synchronized (lock) {
					while (isFirstRunB == false) {
						System.out.println("begin wait");
						lock.wait();
						System.out.println("end wait");
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};

	private Runnable runnableB = new Runnable() {
		@Override
		public void run() {
			synchronized (lock) {
				System.out.println("begin notify");
				lock.notify();
				System.out.println("end notify");
				isFirstRunB = true;

			}
		}
	};

	public static void main(String[] args) throws InterruptedException {

		MyRun run = new MyRun();

		Thread a = new Thread(run.runnableA);
		a.start();

		Thread.sleep(100);

		Thread b = new Thread(run.runnableB);
		b.start();

	}

}
