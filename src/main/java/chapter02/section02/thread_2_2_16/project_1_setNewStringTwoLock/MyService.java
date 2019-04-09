package chapter02.section02.thread_2_2_16.project_1_setNewStringTwoLock;

public class MyService {
	private String lock = "123";

	public void testMethod() {
		try {
			synchronized (lock) {
				System.out.println(Thread.currentThread().getName() + " begin "
						+ System.currentTimeMillis());
				lock = "456";
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName() + "   end "
						+ System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
