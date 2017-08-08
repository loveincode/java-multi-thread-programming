package chapter02.section02.thread_2_2_10.project_2_StringAndSyn2;

public class Service {
	public static void print(Object object) {
		try {
			synchronized (object) {
				while (true) {
					System.out.println(Thread.currentThread().getName());
					Thread.sleep(1000);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
