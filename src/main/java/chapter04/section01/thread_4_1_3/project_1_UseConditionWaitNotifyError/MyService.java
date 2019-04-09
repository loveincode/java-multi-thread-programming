package chapter04.section01.thread_4_1_3.project_1_UseConditionWaitNotifyError;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	public void await() {
		try {
			condition.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}