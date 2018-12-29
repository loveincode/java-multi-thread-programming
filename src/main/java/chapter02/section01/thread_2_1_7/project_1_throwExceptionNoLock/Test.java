package chapter02.section01.thread_2_1_7.project_1_throwExceptionNoLock;

public class Test {

	public static void main(String[] args) {
		try {
			Service service = new Service();

			ThreadA a = new ThreadA(service);
			a.setName("a");
			a.start();

			Thread.sleep(500);

			ThreadB b = new ThreadB(service);
			b.setName("b");
			b.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
