package chapter04.section01.thread_4_1_14.project_1_awaitUninterruptiblyTest_1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {

	private ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	public void testMethod() {
		try {
			lock.lock();
			System.out.println("wait begin");
			condition.await();
			System.out.println("wait   end");
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("catch");
		} finally {
			lock.unlock();
		}

	}
}

