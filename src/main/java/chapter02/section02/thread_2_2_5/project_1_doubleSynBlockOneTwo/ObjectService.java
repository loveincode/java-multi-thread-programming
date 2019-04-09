package chapter02.section02.thread_2_2_5.project_1_doubleSynBlockOneTwo;

public class ObjectService {

	public void serviceMethodA() {
		try {
			synchronized (this) {
				System.out.println("A begin time=" + System.currentTimeMillis());
				Thread.sleep(2000);
				System.out.println("A end    end=" + System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void serviceMethodB() {
		synchronized (this) {
			System.out.println("B begin time=" + System.currentTimeMillis());
			System.out.println("B end    end=" + System.currentTimeMillis());
		}
	}
}
