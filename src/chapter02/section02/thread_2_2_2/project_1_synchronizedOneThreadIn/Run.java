package chapter02.section02.thread_2_2_2.project_1_synchronizedOneThreadIn;

public class Run {

	public static void main(String[] args) {
		ObjectService service = new ObjectService();

		ThreadA a = new ThreadA(service);
		a.setName("a");
		a.start();

		ThreadB b = new ThreadB(service);
		b.setName("b");
		b.start();
	}

}
