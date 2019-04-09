package chapter02.section03.thread_2_3_7.project_1_synchronizedUpdateNewValue;

public class Run {

	public static void main(String[] args) {
		try {
			Service service = new Service();

			ThreadA a = new ThreadA(service);
			a.start();

			Thread.sleep(1000);

			ThreadB b = new ThreadB(service);
			b.start();

			System.out.println("已经发起停止的命令了！");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
