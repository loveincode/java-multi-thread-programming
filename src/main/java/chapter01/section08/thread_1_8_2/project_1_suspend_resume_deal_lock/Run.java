package chapter01.section08.thread_1_8_2.project_1_suspend_resume_deal_lock;

public class Run {
	public static void main(String[] args) {
		try {
			final SynchronizedObject object = new SynchronizedObject();

			Thread thread1 = new Thread() {
				@Override
				public void run() {
					object.printString();
				}
			};

			thread1.setName("a");
			thread1.start();

			Thread.sleep(1000);

			Thread thread2 = new Thread() {
				@Override
				public void run() {
					System.out
							.println("thread2启动了，但进入不了printString()方法！只打印1个begin");
					System.out
							.println("因为printString()方法被a线程锁定并且永远的suspend暂停了！");
					object.printString();
				}
			};
			thread2.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
