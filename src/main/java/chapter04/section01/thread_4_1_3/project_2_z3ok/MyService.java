package chapter04.section01.thread_4_1_3.project_2_z3ok;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	public void waitMethod() {
		try {
			lock.lock();
			System.out.println("A");
			condition.await();
			System.out.println("B");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
			System.out.println("锁释放了！");
		}
	}
}

