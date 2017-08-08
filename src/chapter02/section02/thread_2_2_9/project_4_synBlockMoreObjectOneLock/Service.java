package chapter02.section02.thread_2_2_9.project_4_synBlockMoreObjectOneLock;

public class Service {

	public static void printA() {
		synchronized (Service.class) {
			try {
				System.out.println("线程名称为：" + Thread.currentThread().getName()
						+ "在" + System.currentTimeMillis() + "进入printA");
				Thread.sleep(3000);
				System.out.println("线程名称为：" + Thread.currentThread().getName()
						+ "在" + System.currentTimeMillis() + "离开printA");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public static void printB() {
		synchronized (Service.class) {
			System.out.println("线程名称为：" + Thread.currentThread().getName()
					+ "在" + System.currentTimeMillis() + "进入printB");
			System.out.println("线程名称为：" + Thread.currentThread().getName()
					+ "在" + System.currentTimeMillis() + "离开printB");
		}
	}
}
