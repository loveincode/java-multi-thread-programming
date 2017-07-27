package thread_7.thread_7_7.project_1_threadExceptionMove;

public class Run1 {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		// 对象
		myThread
		 .setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
		// 类
		MyThread
			.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
		myThread.start();
	}
}
