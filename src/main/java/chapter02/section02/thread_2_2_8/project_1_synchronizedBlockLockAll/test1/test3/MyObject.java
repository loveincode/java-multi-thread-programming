package chapter02.section02.thread_2_2_8.project_1_synchronizedBlockLockAll.test1.test3;

public class MyObject {
	public void speedPrintString() {
		synchronized (this) {
			System.out.println("speedPrintString ____getLock time="
					+ System.currentTimeMillis() + " run ThreadName="
					+ Thread.currentThread().getName());
			System.out.println("-----------------");
			System.out.println("speedPrintString releaseLock time="
					+ System.currentTimeMillis() + " run ThreadName="
					+ Thread.currentThread().getName());
		}
	}
}
