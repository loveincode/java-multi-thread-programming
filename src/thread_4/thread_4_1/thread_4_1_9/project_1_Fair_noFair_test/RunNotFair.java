package thread_4.thread_4_1.thread_4_1_9.project_1_Fair_noFair_test;

public class RunNotFair {

	public static void main(String[] args) throws InterruptedException {
		final Service service = new Service(false);

		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("★线程" + Thread.currentThread().getName()
						+ "运行了");
				service.serviceMethod();
			}
		};

		Thread[] threadArray = new Thread[10];
		for (int i = 0; i < 10; i++) {
			threadArray[i] = new Thread(runnable);
		}
		for (int i = 0; i < 10; i++) {
			threadArray[i].start();
		}

	}
}
