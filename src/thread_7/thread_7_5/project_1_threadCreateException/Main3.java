package thread_7.thread_7_5.project_1_threadCreateException;

import java.lang.Thread.UncaughtExceptionHandler;

public class Main3 {
	public static void main(String[] args) {
		MyThread
				.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
					@Override
					public void uncaughtException(Thread t, Throwable e) {
						System.out.println("线程:" + t.getName() + " 出现了异常：");
						e.printStackTrace();

					}
				});

		MyThread t1 = new MyThread();
		t1.setName("线程t1");
		t1.start();

		MyThread t2 = new MyThread();
		t2.setName("线程t2");
		t2.start();
	}
}
