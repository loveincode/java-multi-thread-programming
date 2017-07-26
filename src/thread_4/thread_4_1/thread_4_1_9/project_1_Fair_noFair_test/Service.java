package thread_4.thread_4_1.thread_4_1_9.project_1_Fair_noFair_test;

import java.util.concurrent.locks.ReentrantLock;

public class Service {

	private ReentrantLock lock;

	public Service(boolean isFair) {
		super();
		lock = new ReentrantLock(isFair);
	}

	public void serviceMethod() {
		try {
			lock.lock();
			System.out.println("ThreadName=" + Thread.currentThread().getName()
					+ "获得锁定");
		} finally {
			lock.unlock();
		}
	}

}
